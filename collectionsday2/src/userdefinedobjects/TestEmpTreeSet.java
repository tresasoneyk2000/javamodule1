package userdefinedobjects;
import java.util.HashSet;
import java.util.TreeSet;

//import oopsday4.inheritence.Employee;

public class TestEmpTreeSet {

	public static void main(String[] args) {
		
		TreeSet<Employee> empSet=new TreeSet<Employee>();// can add in linked list,dequeue as like arraylist
		
		
		Employee emp1= new Employee("John Dpe","Male",24,101,"Research",2000000.0);
		
		Employee emp2= new Employee("taniya","female",22,102,"Accounting",400000);
		
		Employee emp3= new Employee("maria","female",22,104,"training",30000000);
	
		Employee emp4= new Employee("merin","female",24,107,"marketing",5100000);
	
		Employee emp5= new Employee("John Dpe","Male",24,101,"Research",2000000.0);
		
		
		
		empSet.add(emp5);
		empSet.add(emp4);
		empSet.add(emp3);
		empSet.add(emp2);
		empSet.add(emp1);
		
		
		System.out.println(empSet);// 4 because emp1 and emp5 are same values same

	}

}
