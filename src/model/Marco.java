package model;

import processing.core.PApplet;

public class Marco implements Runnable {
	
	PApplet app;
	
	private float posX;
	private float posY;
	
	private int tam = 40;
	  
	public Marco (PApplet app,float posX, float posY) {
		
		  this.app = app;
		
		  this.posX = posX;
		  this.posY = posY;

	}

	public void draw ( ) {
		
		app.fill(220,20,60);
		
		app.noStroke();
		
		app.ellipse(posX, posY, tam, tam);
		
	}

	 public void mov() {
	        
	     posX += app.random(-2, 2);
		 posY += app.random(-2, 2);
		        
	 }
	 
	 public void run() {
		    
			mov();
			    
		  }

}
