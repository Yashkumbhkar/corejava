package rays.com.compare;

import java.util.Comparator;

public class Employee implements Comparable<Employee>{
 
	 private int  id = 0;
	 private String name = null;
	 private int salary = 0;
	 
	  public Employee(int id , String name , int salary) {
		  this.id = id ;
		  this.name= name;
		  this.salary= salary;
		  
	  }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id+" "+name+" "+salary;
				
	}
	@Override
	public int compareTo(Employee o) {
		
	
	  
int i = this.salary - o.salary;
if (i==0) {
	 int j =  this.name.compareTo(o.name);
	 
	 if(j==0) {
		 
		 return this.id - o.id;
	 }

	 return j ;
}
return i;
	}
}




class OrderByIdAsc implements Comparator<Employee>{
	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.getId()-o2.getId();
	}
	
}
class OrderByNameAsc implements Comparator<Employee>{
	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}
}
class OrderBYSalaryAsc implements Comparator<Employee>{
	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.getSalary()-o2.getSalary();
	}
}