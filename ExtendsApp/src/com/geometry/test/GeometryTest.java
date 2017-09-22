package com.geometry.test;

import org.junit.Assert;
import org.junit.Test;

import com.geometry.main.Circle;
import com.geometry.main.ETriangle;
import com.geometry.main.Rectangle;


public class GeometryTest {
	
	
	@Test
	public void testCircle(){		
		Circle circle = new Circle(5);
		Assert.assertEquals(78.54, circle.computeArea(),0.1);
		Assert.assertEquals(31.41, circle.computePerimeter(),0.1);		
	}
	
	@Test
	public void testETriangle(){		
		ETriangle etriangle = new ETriangle(3);
		Assert.assertEquals(3.8971, etriangle.computeArea(),0.1);
		Assert.assertEquals(9, etriangle.computePerimeter(),0.1);		
	}
	
	@Test
	public void testRectangle(){		
		Rectangle rectangle = new Rectangle(2,3);
		Assert.assertEquals(6, rectangle.computeArea(),0.1);
		Assert.assertEquals(10, rectangle.computePerimeter(),0.1);		
	}

}
