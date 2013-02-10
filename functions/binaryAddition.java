//This is my answer to 2.1-4 of CLRS
import java.util.Arrays;

class TestBinaryAddition{
	public static void main(String[] args){
		//Test a normal randomish array
		int ARRAY_LENGTH_1 = 10;
		//int[] a = new int[ARRAY_LENGTH_1];
		//int[] b = new int[ARRAY_LENGTH_1];

		int[] a = {0, 1, 1, 1, 0, 1, 0, 1, 0, 1};
		int[] b = {1, 0, 1, 1, 0, 0, 1, 0, 1, 1};
		    //c = {1, 1, 0, 1, 1, 1, 1, 1, 1, 0, 1};

		int[] c = new TestBinaryAddition().binaryAddition(a, b);
		System.out.println("a "+Arrays.toString(a));
		System.out.println("b "+Arrays.toString(b));
		System.out.println("c "+Arrays.toString(c));

		//Test an all 1's array

		//Test an all 0's array

		//Test a null array


	}

	public int[] binaryAddition(int[] a, int[] b){
		if(a.length != b.length)
			return null;
		int c[] = new int[a.length+1];
		//c's default values are set to 0
		for(int j = 0; j < a.length; j++){
			c[j+1] = (a[j]+b[j]+c[j])/2;
			c[j] = (a[j]^b[j])^c[j];	
		}
		System.out.println(c.toString());
		return c;
	}

}