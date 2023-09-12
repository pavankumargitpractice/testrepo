package seleniumpractice;

public class ArrayLargestandSmallestNumber {

	public static void main(String[] args) {
		
		int[] arr= new int[] {10,40,50,30,60,100,55,5};
		int max = arr[0];
		int min=arr[0];
		
		
		//Loop for largest 
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
				
				
			}
		}
		
		//Loop for smallest
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
				
				
			}
		}
		
		System.out.println(max);
		System.out.println(min);
	}

}
