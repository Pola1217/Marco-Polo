package view;

import model.Mundo;
import processing.core.PApplet;

public class main extends PApplet {
	
	
	public static void main(String[] args) {
		
		PApplet.main(main.class.getName());
		
	}

	Mundo mundo;
	
	@Override
	public void settings() {
		
		size(600, 600);
		
	}
	
	@Override
	public void setup() {
		
	mundo = new Mundo(this);
		
	}
	
	@Override
	public void draw() {
		
	background(20);
	
	mundo.draw();
	
		//System.out.println(mouseX+","+mouseY);
	
	}
	
	
}
