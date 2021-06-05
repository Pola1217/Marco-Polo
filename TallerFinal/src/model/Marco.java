package model;

import processing.core.PApplet;
import processing.core.PConstants;

public class Marco implements Runnable {
	
	PApplet app;
	
	 private float posX;
	 private float posY;
	  
	 private int dir, dirX, dirY; 
	 
	 private boolean message;
	 
	 private int Timer, messTimer;
	 
	 private int tam = 40;
	 
	public Marco (PApplet app,float posX, float posY) {
		
		  this.app = app;
		
		  this.dir = 30;
		  
		  this.posX = posX;
		  this.posY = posY;

		  dirX = 2; 
		  dirY= 2; 
		  
		  this.message = false;
		  
		  this.Timer = 125;
		  this.messTimer = 125;
		  
	}

	public void draw ( ) {
		
		//marco
		app.fill(220,20,60);
		
		app.noStroke();
		
		app.ellipse(posX, posY, tam, tam);
		
		
		//timer message1
		if (Timer > 0) {
			
			Timer--;
			
		}

		//timer message2
		if (Timer == 0) {
			
			app.fill(255);
			app.textSize(20);
			app.textAlign(PConstants.CENTER);
			app.text("MARCO", posX, posY + (dir-25));
			
			messTimer--;
			
			message = true;
			
			if (messTimer == 0) {
				
				Timer = 125;
				messTimer = 125;
				
				message = false;
				
			}
		}
		
	}

	 public void mov() {
	        
//	     posX += app.random(-2, 2);
//		 posY += app.random(-2, 2);
		   
		 posX += 1*dirX; 
		 posY+= 1*dirY;
			
			
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
	 
	 public void runIn() {
		 
		
		 
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

	public int getTimer() {
		return Timer;
	}

	public void setTimer(int timer) {
		Timer = timer;
	}

	public int getMessTimer() {
		return messTimer;
	}

	public void setMessTimer(int messTimer) {
		this.messTimer = messTimer;
	}

	public int getTam() {
		return tam;
	}

	public void setTam(int tam) {
		this.tam = tam;
	}
	 
	 

}
