package seleniumpractice;

public class PrintelementsofarraypresentonEVENandODDposition {

	public static void main(String[] args) {
	
		int[] arr= new int[] {1,2,3,4,5,6,7,8,9,10};
		//prinitng even postion
		for(int i=1;i<arr.length;i=i+2) {
			System.out.println(arr[i]);
			
		}
		
		//prinitng odd postion
		for(int j=0;j<arr.length;j=j+2) {
			System.out.println(arr[j]);
		}

	}

}
