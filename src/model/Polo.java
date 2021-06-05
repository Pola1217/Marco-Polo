package model;

import processing.core.PApplet;
import processing.core.PConstants;

public class Polo implements Runnable {

	  PApplet app;
	
	  private float posX;
	  private float posY;
	  
	  protected int dirX, dirY; 
	  
	  private int speed = 2;
	  private int tam = 40;
	  
	  public Polo (PApplet app, float posX, float posY) {
			
		  this.app = app;
		  
		  this.posX = posX;
		  this.posY = posY;
		  
		  dirX = 1; 
		  dirY= 1; 
			
			
		}
		    
	 public void draw( PApplet app) {
		 
		 app.fill(0,191,255);
		 
		 app.noStroke();
		 
		 app.circle(posX, posY, tam);
		        
	}
		      
	 public void mov() {
		 
		 posX += 1*dirX; 
		 posY+= 1*dirY;
			
			
			if(posX<0 ||posX>app.width) {
				dirX*=-1; 
			}
			if(posY<0 ||posY>app.width) {
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
		    
}
