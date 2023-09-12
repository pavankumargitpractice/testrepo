package seleniumpractice;

public class ArraysPractice {

	public static void main(String[] args) {
		//int[] a= new int[10];
		Object[] obj= new Object[10];
		obj[0]= new Integer[20];
		obj[1]=new String("pavan");
		obj[2]=new Object();
		
		int[][] x= {{10,20,30},{40,50}};
		for(int i=0;i<x.length;i++) {
			for(int j=0;j<x[i].length;j++){
				System.out.println("value of " +i+j+" "+ x[i][j]);
				
			}
		}
		
		for(int[] x1:x) {
			for(int x2:x1) {
				System.out.println(x2);
			}
		}

	}

}
