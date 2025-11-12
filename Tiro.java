 package meujogo.Modelo;

import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.ImageIcon;

public class Tiro {
	
	private Image imagem;
	private int x, y;
	private int altura , largura;
	private boolean isVisible;
	
	private static final int LARGURA=938;
	private static int VELOCIDADE=2; 
	
	public Tiro(int x, int y) {
		this.x=x;
		this.y=y;
		isVisible=true;
	}
	
	public void load() {
		ImageIcon ref=new ImageIcon("res\\shot1_asset.png");
		imagem=ref.getImage();
		
		this.largura=imagem.getWidth(null);
		this.altura=imagem.getHeight(null);
	}
	
	public void update() {
		this.x+=VELOCIDADE;
		if (this.x>LARGURA)
			isVisible=false;
	}
	
	public Rectangle getBounds() {
		int ajusteX = 10;  // margem de 10px
	    int ajusteY = 10;
	    int w = largura - 20;
	    int h = altura - 20;
	    return new Rectangle(x + ajusteX, y + ajusteY, w, h);
	}

	public boolean isVisible() {
		return isVisible;
	}

	public void setVisible(boolean isVisible) {
		this.isVisible = isVisible;
	}

	public static int getVELOCIDADE() {
		return VELOCIDADE;
	}

	public static void setVELOCIDADE(int vELOCIDADE) {
		VELOCIDADE = vELOCIDADE;
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
	
	
}
