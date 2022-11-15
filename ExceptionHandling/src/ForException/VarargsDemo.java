package ForException;

public class VarargsDemo {

	public static void main(String[] args) {
		Calc obj = new Calc();
		
		int result = obj.add(new int[]{6, 4, 3, 23, 443});
		System.out.println(result);
	}

}


class Calc {
	
	//method to add 3 values
	public int add(int x, int y) {
		return x+y;
	}
	
	//overload method to add 3 values
	//not a viable solution when the arguments keep changing constantly and have more than 3 args
	public int add(int x, int y, int z) {
		return x+y+z;
	}
	
	
	//to be able to use only one method, irrespective of method to take care of the functioning
	public int add(int[] nums) {
		int sum = 0;
		for (int i : nums) {
			sum+=i;
		}
		return sum;
	}
	
}
