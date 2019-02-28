package demo;

public class Main {
	
	
	public static void main(String[] args) {
		Emp e = new Emp();
		e.setName("Mohammad");
		e.setAge(20);
		e.setSalary(400);
		
		System.out.println("Name: "+e.getName());
		System.out.println("Age: "+e.getAge());
		System.out.println("Salary: "+e.getSalary());
			
	}
}
