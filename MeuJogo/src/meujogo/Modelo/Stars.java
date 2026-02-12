package meujogo.Modelo;

import java.awt.Image;
import java.awt.Rectangle;
import java.util.Random;

import javax.swing.ImageIcon;

public class Stars {
	
	private Image imagem;
	private int x, y;
	private int altura , largura;
	private boolean isVisible;
	
	//private static final int LARGURA=938;
	private static int VELOCIDADE=3; 
	
	public Stars(int x, int y) {
		this.x=x;
		this.y=y;
		isVisible=true;
		 load();
	}
	
	public void load() {
		ImageIcon ref=new ImageIcon("res\\star_05.png");
		imagem=ref.getImage().getScaledInstance(16, 16, Image.SCALE_SMOOTH);
		
		this.largura=imagem.getWidth(null);
		this.altura=imagem.getHeight(null);
	}
	
	public void update() {
		if(this.x+largura <0) {
			this.x=largura;
			Random a=new Random();
			int m=a.nextInt(500);
			this.x=m+1024;
			Random r=new Random();
			int n=r.nextInt(768);
			this.y=n;
		}else {
			this.x-=VELOCIDADE;
		}
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
