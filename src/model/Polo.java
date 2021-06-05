package model;

import processing.core.PApplet;
import processing.core.PConstants;

public class Polo implements Runnable {

	  PApplet app;
	
	  private float posX;
	  private float posY;
	  
	  
	  private int tam = 40;
	  
	  public Polo (PApplet app, float posX, float posY) {
			
		  this.app = app;
		  
		  this.posX = posX;
		  this.posY = posY;
		  
		}
		    
	 public void draw( PApplet app) {
		 
		 app.fill(0,191,255);
		 
		 app.noStroke();
		 
		 app.circle(posX, posY, tam);
		        
	}
		      
	 public void mov() {
		        
	     posX += app.random(-2, 2);
		 posY += app.random(-2, 2);
		        
	 }
	 
	 public void run() {
		    
			mov();
			    
		  }
		    
}
