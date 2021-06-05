package model;

import processing.core.PApplet;

public class Players {

	protected int posX, posY, speed;
	PApplet app;
	
	public Players(PApplet app, int posX, int posY, int speed) {
		
		this.posX = posX;
		this.posY = posY;
		this.app = app;
		this.speed = speed;
		
	}

	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public PApplet getApp() {
		return app;
	}

	public void setApp(PApplet app) {
		this.app = app;
	}
		
	
	
	}

