public class longIntObject{
    private long data;

    public longIntObject(long data){
 	this.data = data;
    }

    public boolean equals(longIntObject other){
	if(this.data == other.getData()){
	    return true;
	}
	else{
	    return false;
	}
    }

    public long getData(){
	return data;
    }

    public void setData(long data){
	this.data = data;
    }

    public boolean isGreaterThan(longIntObject other){
	if(this.data > other.getData()){
	    return true;
	}
	else{
	    return false;
	}
    }
    public boolean isLessThan(longIntObject other){
	if(this.data < other.getData()){
	    return true;
	}
	else{
	    return false;
	}
    }

}
