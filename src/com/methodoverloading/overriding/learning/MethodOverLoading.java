package com.methodoverloading.overriding.learning;

public class MethodOverLoading {

	
	public int love(int A,int B) {
		int c = A+B;
		return c;
		
		
	}
    public int love(int X,int Y,int Z) {
		int c = X+Y+Z;
		return c;
	}
    public String love(String abc) {
		return abc;
			
    }
    
    //*** Same method name with different parameters in a single calss
		
	public static void main(String[] args) {
		

		MethodOverLoading loading = new MethodOverLoading();
		System.out.println(loading.love(10, 5));
		System.out.println(loading.love(5, 10, 15));
		System.out.println(loading.love("I love Coading...!!!"));
		
		
	}

}
