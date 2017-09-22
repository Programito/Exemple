package com.geometry.test;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

import com.geometry.main.Circle;
import com.geometry.main.ETriangle;
import com.geometry.main.Geometry;
import com.geometry.main.ListGemetry;
import com.geometry.main.Rectangle;


public class ListGemetryTest {
	
	
	@Test
	public void testAdd(){
		
		ListGemetry listGeometry = new ListGemetry(); 
		
		listGeometry.add(new Circle(5)); 
		listGeometry.add(new Rectangle(3,2)); 
		listGeometry.add(new ETriangle(3)); 
		
		Assert.assertEquals(3,listGeometry.size());
		
	}
	

	@Test
	public void testSortByArea(){
		
	ListGemetry listGeometry = new ListGemetry(); 
		
		Geometry[] expected = new Geometry[]{
						new Circle(5),      //78.54
						new Rectangle(3,2), //6
						new ETriangle(3),   //3.8971
						new Circle(1)       //3.1416
						}; 
	
	
		listGeometry.add(expected[3]);  // 3.14
		listGeometry.add(expected[2]);  // 3.89
		listGeometry.add(expected[0]);  // 78.54
		listGeometry.add(expected[1]);  // 6
		
		ArrayList<Geometry> listResult = listGeometry.sortByArea();
		
		
		/* Geometry[] arrayResult =
		 * new Geometry[4]; 
		listResult.toArray(arrayResult);  
		
		Assert.assertArrayEquals(expected,arrayResult); */
		
		Assert.assertEquals(expected[0],listResult.get(0)); 
		Assert.assertEquals(expected[1],listResult.get(1)); 
		Assert.assertEquals(expected[2],listResult.get(2)); 
		Assert.assertEquals(expected[3],listResult.get(3)); 
		
		
	}
	
	

}
