package model;

import processing.core.PApplet;
import processing.core.PConstants;

public class Polo implements Runnable {

	  PApplet app;
	
	  private float posX;
	  private float posY;
	  
	  private int dir, dirX, dirY; 
	  
	  private boolean message;
	  
	  private int tam = 40;
	  
	  
	  public Polo (PApplet app, float posX, float posY) {
			
		  this.app = app;
		  
		  this.dir = 28;
			
		  this.posX = posX;
		  this.posY = posY;
		  
		  dirX = 1; 
		  dirY= 1; 
		  
		  this.message = false;

		}
		    
	 public void draw (boolean message) {
		 
		 //polo
		 app.fill(0,191,255);
		 
		 app.noStroke();
		 
		 app.circle(posX, posY, tam);
		 
		 //message  
		 if (message) {
			 
			app.fill(255);
			app.textSize(12);
			app.textAlign(PConstants.CENTER);
			app.text("POLO", posX, posY + (dir-25));
			
			//coordenadas
			//app.text(posX + " , " + posY, posX, posY + (dir+15));
			 
		 }
		 
	}
		      
	 public void mov() {
		 
		 posX += 1 * dirX; 
		 posY+= 1 * dirY;
			
			
			if(posX<0 || posX > app.width) {
				
				dirX*=-1; 
			
			}
			
			if(posY<0 || posY > app.width) {
				
				dirY*=-1; 
				
			}
	 
	 }
	 
	 public void run() {
		    
			mov();
			 
			try {
		      
		        Thread.sleep(30);
		        
		    } catch (InterruptedException e) {
		      
		        e.printStackTrace();
		        
		    }
	}

	public PApplet getApp() {
		return app;
	}

	public void setApp(PApplet app) {
		this.app = app;
	}

	public float getPosX() {
		return posX;
	}

	public void setPosX(float posX) {
		this.posX = posX;
	}

	public float getPosY() {
		return posY;
	}

	public void setPosY(float posY) {
		this.posY = posY;
	}

	public int getDir() {
		return dir;
	}

	public void setDir(int dir) {
		this.dir = dir;
	}

	public int getDirX() {
		return dirX;
	}

	public void setDirX(int dirX) {
		this.dirX = dirX;
	}

	public int getDirY() {
		return dirY;
	}

	public void setDirY(int dirY) {
		this.dirY = dirY;
	}

	public boolean isMessage() {
		return message;
	}

	public void setMessage(boolean message) {
		this.message = message;
	}

	public int getTam() {
		return tam;
	}

	public void setTam(int tam) {
		this.tam = tam;
	}
	 
	 
		    
}
