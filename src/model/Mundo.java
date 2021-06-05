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
		
		marco = new Marco(app, app.random(20, 550), app.random(20, 550));
		polo = new ArrayList<Polo>();
		
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
		
		//marco.runIn();
		
		//polos
		for(int i = 0; i < polo.size(); i++) {
			
			float poloPosX = polo.get(i).getPosX();
			float poloPosY = polo.get(i).getPosY();
		    
		    polo.get(i).draw(marco.isMessage());
		   
		    new Thread(polo.get(i)).start(); 
		 
		    if (PApplet.dist( poloPosX, poloPosY, marco.getPosX(), marco.getPosY()) < 40) {

				polo.remove(i);	

			}
		} 
	}	

}
