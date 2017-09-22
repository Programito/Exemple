package com.implement.test;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;


import com.implement.main.IntGeometry;
import com.implement.main.ListGeometry;

public class ListGeometryTest {
	
	
	
	@Test
	public void testSortByArea(){
		
	ListGeometry listGeometry = new ListGeometry(); 
		
		IntGeometry[] expected = new IntGeometry[]{
				new Mock(4), 
				new Mock(3), 
				new Mock(2), 
				new Mock(1), 
			}; 
	
	
		listGeometry.add(expected[3]);  //4
		listGeometry.add(expected[2]);  //3
		listGeometry.add(expected[0]);  //1
		listGeometry.add(expected[1]);  //2
		
		ArrayList<IntGeometry> listResult = listGeometry.sortByArea();
		

		Assert.assertEquals(expected[0],listResult.get(0)); 
		Assert.assertEquals(expected[1],listResult.get(1)); 
		Assert.assertEquals(expected[2],listResult.get(2)); 
		Assert.assertEquals(expected[3],listResult.get(3)); 
		
		
	}
	
	
	public class Mock implements IntGeometry{

		float value; 
		
		public Mock(float value){
			this.value = value; 
		}
		
		@Override
		public float computeArea() {
			return value;
		}

		@Override
		public float computePerimeter() {
			return value;
		}

		@Override
		public int getSide() {
			return (int) value;
		}
		
		
		
	}
	
	

}
