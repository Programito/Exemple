package com.geometry.util;
import java.util.Scanner;


@SuppressWarnings("resource")
public class Input {
	

	public static int scannInt(){
    	Scanner reader = new Scanner(System.in);
    	 int var =  reader.nextInt();  
    	 return var; 
    }
    
    public static float scannFloat(){
    	Scanner reader = new Scanner(System.in);
    	 float var =  reader.nextFloat();  
    	 return var;
    }
    
    public static String scannLine(){
    	Scanner reader = new Scanner(System.in);
    	 String var =  reader.nextLine(); 
    	 return var;
    }

}
