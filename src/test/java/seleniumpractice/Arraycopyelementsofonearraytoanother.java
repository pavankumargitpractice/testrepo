package seleniumpractice;

public class Arraycopyelementsofonearraytoanother {

	public static void main(String[] args) {
		
		int [] arr1= new int[] {1,2,3,4,5};
		int[] arr2 = new int[arr1.length];
		for(int i=0;i<arr1.length;i++) {
			arr2[i]=arr1[i];
			System.out.println(arr2[i]);
			System.out.println(arr1[i]);
			
		}

	}

}
