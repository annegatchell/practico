public class binarySearchArray<T>{
    private T[] data;
    private int nElems;

    public binarySearchArray<T>(int size){
         data = new T[size]; //create array
         nElems = size; 
    }

    public T binFind(T element){
        if(nElems == 0){
	    return null;
        }
	int lowerEnd = 0;
	int upperEnd = nElems-1;
	int midpoint; 
	
	while(true)
	{
	    midpoint = (upperEnd-lowerEnd)/2 + lowerEnd;
	    if (lowerEnd > upperEnd){
	    	return null;
	    }
	    else if (data[midpoint].equals(element){
	    	return data[midpoint]; 
	    }
            else{
		if(data[midpoint].isGreaterThan(element){
		    lowerEnd = midpoint + 1;
		}
		else{
		    upperEnd = midpoint - 1;
		}	
	    }
	}		        
    }

    public delete(T element){
    }

    public insert(T element){
    }
}
