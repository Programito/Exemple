package com.geometry.test;

import org.junit.Assert;
import org.junit.Test;

public class SortIntTest {
	
	
	
	
	@Test
	public void testSort(){
		int[] expected= new int[]{5,4,3,2,1}; 
		int[] array= new int[]{2,1,3,5,4}; 
		
		
		sortGreat(array); 
		
		Assert.assertArrayEquals(expected,array);
		
		
		
	}
	
	
	/**
	 *
	 * 1, 2, 3, 4
	 * 
	 * 4, 2, 3, 1
	 * 
	 * 4, 3, 2, 1
	 * 
	 * 4, 3, 2, 1
	 * 
	 */

	public void sortGreat(int array[]){
		int size = array.length; 
		
		for(int k=0; k<size-1; k++){
			for(int i =k+1; i<size; i++){
				if(array[k]<array[i]){
					int tem = array[k]; 
					array[k]= array[i];
					array[i]= tem; 
				}  
			}
		}
	}
	
	
	

}
