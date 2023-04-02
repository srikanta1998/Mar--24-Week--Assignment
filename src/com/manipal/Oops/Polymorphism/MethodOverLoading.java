package com.manipal.Oops.Polymorphism;

public class MethodOverLoading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Mathematics obj = new Mathematics();
        
        
        int result1 = obj.add(2, 3);
        System.out.println("2 + 3 = " + result1);
        
        
        int result2 = obj.add(2, 3, 4);
        System.out.println("2 + 3 + 4 = " + result2);
        
        
        double result3 = obj.add(2.5, 3.5);
        System.out.println("2.5 + 3.5 = " + result3);
		
	}

}

class Mathematics {
    
    public int add(int x, int y) {
        return x + y;
    }
    
    
    public int add(int x, int y, int z) {
        return x + y + z;
    }
    
    
    public double add(double x, double y) {
        return x + y;
    }
}