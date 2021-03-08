package example;

public class Main {

	public static void main(String[] args) {
		Employee e1 = new Employee("viraj", "manager", "HR", 47000);
		Employee e2 = new Employee("sathvik", "Director", "TR", 980000);
		System.out.println("viraj's withHolding: "+e1.getWithHolding());
		System.out.println("viraj's bonus: " + e1.getBouns());
		System.out.println("sathvik's withHolding: "+e2.getWithHolding());
		System.out.println("sathvik's bonus: " + e2.getBouns());

	}

}
