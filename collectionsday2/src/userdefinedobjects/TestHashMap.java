package userdefinedobjects;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;
import java.util.HashMap;


public class TestHashMap {

	public static void main(String[] args) {
		
		
Employee emp1= new Employee("John Dpe","Male",24,101,"Research",2000000.0);
		
		Employee emp2= new Employee("taniya","female",22,102,"Accounting",400000);
		
		Employee emp3= new Employee("maria","female",22,104,"training",30000000);
	
		Employee emp4= new Employee("merin","female",24,107,"marketing",5100000);
	
		Employee emp5= new Employee("John Dpe","Male",24,101,"Research",2000000.0);
		
		
		ArrayList<Employee> empList=new ArrayList<Employee>();
		
		empList.add(emp5);
		empList.add(emp4);
		empList.add(emp3);
		empList.add(emp2);
		empList.add(emp1);
		
		
		HashSet<Employee> empSet=new HashSet<Employee>();
		empSet.add(emp5);
		empSet.add(emp4);
		empSet.add(emp3);
		empSet.add(emp2);
		empSet.add(emp1);
		
		
		TreeSet<Employee> empTreeSet=new TreeSet<Employee>();
		
		empTreeSet.add(emp5);
		empTreeSet.add(emp4);
		empTreeSet.add(emp3);
		empTreeSet.add(emp2);
		empTreeSet.add(emp1);
		
		
		
		HashMap<String,Collection> dataMap= new HashMap<>();
		dataMap.put("empList",empList );
		dataMap.put("empSet", empSet);
		dataMap.put("empTreeSet", empTreeSet);
		
		System.out.println(dataMap);
		
		Collection<Employee> list= dataMap.get("empList");
		Iterator<Employee> iter=list.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		System.out.println("empset");
		Collection<Employee> set= dataMap.get("empSet");
	 iter=set.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		System.out.println("emptreeset");
		
		Collection<Employee> tree= dataMap.get("empTreeSet");
		 iter=tree.iterator();
			while(iter.hasNext()) {
				System.out.println(iter.next());
			}
		
		

	}

}
