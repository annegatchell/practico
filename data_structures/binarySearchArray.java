public class binarySearchArray<T>{
    private T[] data;
    private int nElems;
    private int maxElems;

    public binarySearchArray(int size){
        this.data = new T[size]; //create array
        this.nElems = size; 
	 	this.maxElems = size;
    }
    
    public int binaryFindElementIndex(T element){
        if(nElems == 0){
		    return -1;
        }
		int lowerEnd = 0;
		int upperEnd = nElems-1;
		int midpoint; 
		
		while(true)
		{
		    midpoint = (upperEnd-lowerEnd)/2 + lowerEnd;
		    if (lowerEnd > upperEnd){
		    	return -1;
		    }
		    else if (data[midpoint].equals(element)) {
		    	return midpoint; 
		    }
	        else{
				if(data[midpoint].isGreaterThan(element)) {
				    lowerEnd = midpoint + 1;
				}
				else{
				    upperEnd = midpoint - 1;
				}	
		    }
		}		        
    }//end binaryFindElementIndex

    public T binFind(T element){
		int index;
		index = binaryFindElementIndex(element);

		if(index > -1){
		    return data[index];
		}
		else{
		    return null;
		}
    }//end binFind

    public boolean delete(T element){
    	int index;
		index = binaryFindElementIndex(element);
	
		if (index > -1){
		    while(index < nElems){
		        data[index] = data[index+1];
			index++;
		    }
		    nElems--;
		    return true;
		}
		else{
		    return false;
		}
    }//end delete

    public boolean insert(T element){
        int upperEnd = nElems-1;
		int lowerEnd = 0;
		int higher, lower;
		if(maxElems < nElems + 1){
		    return false;
		}	

		if(nElems == 0){
		    data[0] = element;
		}
		else if ( nElems == 1){
		    if(data[0].isGreaterThan(element)) {
			data[1] = data[0];
			data[0] = element;
			nElems++;
		    }
		    else if(data[0].isLessThan(element)) {
		        data[1] = element;
			nElems++;
		   }
		   else{
			return false;
		   }
		}
		else{
			while(true){
			   lower = (upperEnd - lowerEnd)/2 + lowerEnd;
			   higher = lower + 1;
			   if(element.isLessThan(data[higher]) && element.isGreaterThan(data[lower])) {
			       break;
			   }
			   else{ 
				if(element.isLessThan(data[lower])){
				    upperEnd = lower;
			   	}
				else if(element.isGreaterThan(data[higher])) {
				    lowerEnd = higher;
				}
			   }	 
			}
			//insert the element
			for(int k=nElems; k > higher; k++){
			    data[k] = data[k-1];
			}
			data[greater] = element;
			nElems++;
			return true;
		}	    
    } //end insert
}
