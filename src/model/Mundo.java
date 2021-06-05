package model;

import java.util.ArrayList;
import processing.core.PConstants;
import processing.core.PApplet;

public class Mundo {
	
	PApplet app;
	
	private ArrayList<Polo> polo;
	
	Marco marco;

	public Mundo(PApplet app) {
		
		this.app = app;
		
		marco = new Marco(app, 300, 300);
		polo = new ArrayList<>();
		
		//creates polos
		for(int i = 0; i < 20; i++) {
		    
		    float posX = app.random(20, 550);
		    float posY = app.random(20, 550);
		    
		    Polo temp = new Polo(app, posX, posY);
		    
		    polo.add(temp);
		    
		}
	}
		 
	public void draw () {
		
		//marco
		marco.draw();
		new Thread(marco).start();
		
		
		//polos
		for(int i = 0; i < polo.size(); i++) {
		    
		    polo.get(i).draw(marco.isMessage());
		   
		    new Thread(polo.get(i)).start(); 
		    
		  }
		  
	}
	
	

}
