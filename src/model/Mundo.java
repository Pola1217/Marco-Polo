package model;

import java.util.ArrayList;

import processing.core.PApplet;

public class Mundo {
	
	PApplet app;
	
	private ArrayList<Polo> polo;
	
	Marco marco;

	public Mundo(PApplet app) {
		
		this.app = app;
		
		polo = new ArrayList<>();
		marco = new Marco(app, 300, 300);
		
		for(int i = 0; i < 20; i++) {
		    
		    float posX = app.random(20, 550);
		    float posY = app.random(20, 550);
		    
		    Polo temp = new Polo(app, posX, posY);
		    
		    polo.add(temp);
		    
		}
	}
		 
	public void draw () {
		
		marco.draw();
		new Thread(marco).start();
		
		for(int i = 0; i < polo.size() - 1; i++) {
		    
		    polo.get(i).draw(app);
		   
		    new Thread(polo.get(i)).start(); 
		    
		  }
		  
	}
	
	

}
