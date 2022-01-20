package javaArray;

public class JavaArray {
	
	// Printing an Anonymous Array
	static void printArray(int b[]){  
		for(int i=0;i<b.length;i++)  
		System.out.print("[" + b[i] + "] ");  
	} 

	public static void main(String[] args) {
		// One dimension Array example
		int a[] = {5,6,12,2,45,8,4};
		System.out.println("One Dimension Array");
		for (int i: a) {
			System.out.print("[" + i + "] ");
		}
		System.out.println("\n");
			
		// Passing an Anonymous Array
		System.out.println("Anonymous Array");
		printArray(new int[]{56,5,12,38,6});
		System.out.println("\n");
		
		// Class name of Java array   
		Class c=a.getClass();  
		String name=c.getName();  
		System.out.println("Class name of Java array");  
		System.out.println(name + "\n");  
		
		// Array Copy
		int[] copyTo = new int[4];
		System.arraycopy(a, 2, copyTo, 0, 4);
		System.out.println("Partial Copy of array a");
		for (int i: copyTo) {
			System.out.print("[" + i + "] ");
		}
		System.out.println("\n");	
		
		// Array Clone
		int[] cloneArray = a.clone();
		System.out.println("Clone of array a");
		for (int i: cloneArray) {
			System.out.print("[" + i + "] ");
		}
		System.out.println("\n");		
		

			
			
	}

}
