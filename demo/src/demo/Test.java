package demo;

public class Test {
	public static void main(String[] args) {
		/*
		String[] cars = {"hyundai","lexus","opel"};
		for(String car: cars) {
			System.out.println(car);
			*/
			 int [] numbers = {14,15,13,33};
			for(int i = 3;i>=0;i--) {
				
				System.out.println("the value of i: "+ numbers[i]);
			}
			
			String[] cars = {"hyundai","lexus","opel"};
//			for(int x=0;x<=2; x+=2) {
			for(int x=0;x<cars.length;x+=2) {
				System.out.println(cars[x]);
				
	}
			System.out.println(cars.length);
	}
}
