package userdefinedobjects;
import java.util.ArrayList;

//import oopsday4.inheritence.Employee;

public class TestEmpArrayList {

	public static void main(String[] args) {
		
		ArrayList<Employee> empList=new ArrayList<Employee>();// can add in linked list,dequeue as like arraylist
		
		
		Employee emp1= new Employee("John Dpe","Male",24,101,"Research",2000000.0);
		
		Employee emp2= new Employee("taniya","female",22,102,"Accounting",400000);
		
		Employee emp3= new Employee("maria","female",22,104,"training",30000000);
	
		Employee emp4= new Employee("merin","female",24,107,"marketing",5100000);
	
		Employee emp5= new Employee("John Dpe","Male",24,101,"Research",2000000.0);
		
		
		
		empList.add(emp5);
		empList.add(emp4);
		empList.add(emp3);
		empList.add(emp2);
		empList.add(emp1);
		
		
		System.out.println(empList);

	}

}
