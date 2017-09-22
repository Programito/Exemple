package com.abstracto.example;

public class AbtCircle  extends AbtGeometry{
	private static final float PI =3.1416f;
	private float r; 
	
	public AbtCircle(int r) {
		super(Integer.MAX_VALUE); 
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

}
