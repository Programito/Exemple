package com.implement.main;

import java.util.ArrayList;


public class ListGeometry {


	private ArrayList<IntGeometry> list; 
	
	
	
	public ListGeometry() {
		this.list = new ArrayList<>();
	}

	public void add(IntGeometry item){
		list.add(item); 
	}
	
    public void remove(IntGeometry item){
    	list.remove(item); 
	}
    
    public IntGeometry get(int index){
		return list.get(index);	 
	}
    
    public int size(){
		return list.size();
	}
    
    
    /**  sort methodos ***********************************/

    /**
     * Este metodo ordena las geometrias por el area, de mayor a 
     * menor
     * @return
     */
    public ArrayList<IntGeometry> sortByArea(){
     ArrayList<IntGeometry> listResult = new ArrayList<>();
     listResult.addAll(this.list); 
	 int size = listResult.size(); 
		
		for(int k=0; k<size-1; k++){
			for(int i =k+1; i<size; i++){
				if(listResult.get(k).computeArea()<listResult.get(i).computeArea()){
					IntGeometry tem = listResult.get(k);  //int tem = array[k]; 
					listResult.set(k, listResult.get(i));    // array[k]= array[i];
					listResult.set(i,tem); 		    //array[i]= tem; 
				}  
			}
		}
    	
		return listResult;
    	
    }
    
    public ArrayList<IntGeometry> sortByPerimeter(){
    	 ArrayList<IntGeometry> listResult = new ArrayList<>();
         listResult.addAll(this.list); 
    	 int size = listResult.size(); 
    		
    		for(int k=0; k<size-1; k++){
    			for(int i =k+1; i<size; i++){
    				if(listResult.get(k).computePerimeter()<listResult.get(i).computePerimeter()){
    					IntGeometry tem = listResult.get(k);  //int tem = array[k]; 
    					listResult.set(k, listResult.get(i));    // array[k]= array[i];
    					listResult.set(i,tem); 		    //array[i]= tem; 
    				}  
    			}
    		}
        	
    		return listResult;
    	
    }
    
    public ArrayList<IntGeometry> sortBySize(){
    	 ArrayList<IntGeometry> listResult = new ArrayList<>();
    
         listResult.addAll(this.list); 
    	 int size = listResult.size(); 
    		
    		for(int k=0; k<size-1; k++){
    			for(int i =k+1; i<size; i++){
    				if(listResult.get(k).getSide()<listResult.get(i).getSide()){
    					IntGeometry tem = listResult.get(k);  //int tem = array[k]; 
    					listResult.set(k, listResult.get(i));    // array[k]= array[i];
    					listResult.set(i,tem); 		    //array[i]= tem; 
    				}  
    			}
    		}
        	
    		return listResult;
    	
    }
    
	
}
