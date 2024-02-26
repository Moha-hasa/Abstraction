package Abstraction;
import java.util.Scanner;

public class Data {
	
	Model model=new Model();
	
	public void setEmployee() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee Id");
		model.setEid(sc.nextInt());
		System.out.println("Enter Employee Name");
		model.setEname(sc.next());
		System.out.println("Enter Employee Salary");
		model.setsalary(sc.nextDouble());
	}
	
	public void getEmployee() {
		System.out.println("Employee Id is="+model.getEid());
		System.out.println("Employee Name is="+model.getEname());
		System.out.println("Employee Salary is="+model.getsalary());
		
	}

	public static void main(String[] args) {
		Data data= new Data();
		data.setEmployee();
		data.getEmployee();

	}

}
