package demo;

public class Test2 {

	public static void main(String[] args) {
		String name = "Ali";
		System.out.println(name.length());
		String input = "Software Testing Material";
		StringBuilder input1 = new StringBuilder();
		input1.append(input);
//	 input1=input1.reverse(); 
//	 for (int i=0;i<input1.length();i++)
//	 System.out.print(input1.charAt(i));
		System.out.println("  ");
		System.out.println(input1.reverse());
		StringBuffer a = new StringBuffer("Software Testing Material");
		// use reverse() method to reverse string
		System.out.println(a.reverse());
		
		

		
		int i = 0;
		int num = 0;
		String primeNumbers = "";

		for (i = 1; i <= 100; i++) {
			int counter = 0;
			for (num = i; num >= 1; num--) {
				if (i % num == 0) {
					counter = counter + 1;
				}
			}
			if (counter == 2) {
				primeNumbers = primeNumbers + i + " ";
			}
		}
		System.out.println("Prime numbers from 1 to 100 are :");
		System.out.println(primeNumbers);
	}

}
