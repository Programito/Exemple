package com.implement.main;

public class Circle implements IntGeometry{
	private static final float PI =3.1416f;
	private float r;  
	
	public Circle(int r) { 
		this.r=r; 
	}
	
	@Override
	public float computeArea(){
		return PI*r*r; 
	}
	
	@Override
	public float computePerimeter() {
		return 2*PI*r; 
	}


	@Override
	public int getSide() {
		return Integer.MAX_VALUE; 
	}
	
	
}
