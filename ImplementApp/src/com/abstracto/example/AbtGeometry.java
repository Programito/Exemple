package com.abstracto.example;

public abstract class AbtGeometry {
	
    private int side;
	
	
	public AbtGeometry(int side) {
		this.side = side;
	}
	

	public abstract float computeArea();  
	

	public abstract float computePerimeter(); 
	

	public int getSide() {
		return this.side;
	}


}
