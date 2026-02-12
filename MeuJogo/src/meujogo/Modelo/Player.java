package meujogo.Modelo;

import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;

public class Player {
		
	private int x,y;
	private int dx, dy;
	private Image imagem;
	private int largura, altura;
	private List<Tiro> tiros;
	private boolean isVisible;
	
	public Player() {
		this.x=100;
		this.y=100;
		isVisible=true;
		
		tiros= new ArrayList<Tiro>();
	}
	
	public void load() {
		ImageIcon ref=new ImageIcon("res\\Ship1.png");
		imagem=ref.getImage();
		altura=imagem.getHeight(null);
		largura=imagem.getWidth(null);
	}
	
	public void update() {
		x+=dx;
		y+=dy;
	}
	
	public void tiroSimples() {
		this.tiros.add(new Tiro(x+largura,y+(altura/2)));
	}
	
	public Rectangle getBounds() {
		int ajusteX =5;  // margem de 10px
	    int ajusteY =5;
	    int w = largura - 20;
	    int h = altura - 20;
	    return new Rectangle(x + ajusteX, y + ajusteY, w, h);
	}

	public void keyPressed(KeyEvent tecla) {
		int codigo=tecla.getKeyCode();
		
		if(codigo==KeyEvent.VK_A) {
			tiroSimples();
		}
		
		if(codigo==KeyEvent.VK_UP) {
			dy=-3;
		}
		if(codigo==KeyEvent.VK_DOWN) {
			dy=3;
		}
		if(codigo==KeyEvent.VK_LEFT) {
			dx=-3;
		}
		if(codigo==KeyEvent.VK_RIGHT) {
			dx=3;
		}
	}
	
	public void keyReleased(KeyEvent tecla) {
		int codigo=tecla.getKeyCode();
		
		if(codigo==KeyEvent.VK_UP) {
			dy=0;
		}
		if(codigo==KeyEvent.VK_DOWN) {
			dy=0;
		}
		if(codigo==KeyEvent.VK_LEFT) {
			dx=0;
		}
		if(codigo==KeyEvent.VK_RIGHT) {
			dx=0;
		}
	}
	

	public boolean isVisible() {
		return isVisible;
	}

	public void setVisible(boolean isVisible) {
		this.isVisible = isVisible;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public Image getImagem() {
		return imagem;
	}

	public List<Tiro> getTiros() {
		return tiros;
	}
	
	
}
