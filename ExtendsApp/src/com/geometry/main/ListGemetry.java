package com.geometry.main;

import java.util.ArrayList;

public class ListGemetry {
	
	private ArrayList<Geometry> list; 
	
	
	
	public ListGemetry() {
		this.list = new ArrayList<>();
	}

	public void add(Geometry item){
		list.add(item); 
	}
	
    public void remove(Geometry item){
    	list.remove(item); 
	}
    
    public Geometry get(int index){
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
    public ArrayList<Geometry> sortByArea(){
     ArrayList<Geometry> listResult = new ArrayList<>();
     listResult.addAll(this.list); 
	 int size = listResult.size(); 
		
		for(int k=0; k<size-1; k++){
			for(int i =k+1; i<size; i++){
				if(listResult.get(k).computeArea()<listResult.get(i).computeArea()){
					Geometry tem = listResult.get(k);  //int tem = array[k]; 
					listResult.set(k, listResult.get(i));    // array[k]= array[i];
					listResult.set(i,tem); 		    //array[i]= tem; 
				}  
			}
		}
    	
		return listResult;
    	
    }
    
    public ArrayList<Geometry> sortByPerimeter(){
    	 ArrayList<Geometry> listResult = new ArrayList<>();
         listResult.addAll(this.list); 
    	 int size = listResult.size(); 
    		
    		for(int k=0; k<size-1; k++){
    			for(int i =k+1; i<size; i++){
    				if(listResult.get(k).computePerimeter()<listResult.get(i).computePerimeter()){
    					Geometry tem = listResult.get(k);  //int tem = array[k]; 
    					listResult.set(k, listResult.get(i));    // array[k]= array[i];
    					listResult.set(i,tem); 		    //array[i]= tem; 
    				}  
    			}
    		}
        	
    		return listResult;
    	
    }
    
    public ArrayList<Geometry> sortBySize(){
    	 ArrayList<Geometry> listResult = new ArrayList<>();
    
         listResult.addAll(this.list); 
    	 int size = listResult.size(); 
    		
    		for(int k=0; k<size-1; k++){
    			for(int i =k+1; i<size; i++){
    				if(listResult.get(k).getSide()<listResult.get(i).getSide()){
    					Geometry tem = listResult.get(k);  //int tem = array[k]; 
    					listResult.set(k, listResult.get(i));    // array[k]= array[i];
    					listResult.set(i,tem); 		    //array[i]= tem; 
    				}  
    			}
    		}
        	
    		return listResult;
    	
    }
    
    
    
}
