package first.java;
 import java.util.Scanner;
public class Emplyoee {
     private Integer id;
     private String Name;
     private String Department;
     private Integer salary;
     
     public Emplyoee(Integer id,String Name,String Department,Integer salary) {
    	 this.id = id;
    	 this.Name = Name;
    	 this.Department = Department;
    	 this.salary = salary;
    	 
    	 
     }

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getDepartment() {
		return Department;
	}

	public void setDepartment(String department) {
		Department = department;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}
		public void option() {
	        System.out.println("enter number");
	        Scanner sc=new Scanner(System.in);
	        int a=sc.nextInt();
	        switch (a){
	            case 1:
	                System.out.println("name in Sorted manner");
	                break;
	            case 2:
	                System.out.println("salary in sorted manner");
	                break;
	            case 3:
	                System.out.println("ID in sorted manner");
	                break;
	            case 4:
	                System.out.println("Department in sorted manner");
	                break;
	        }

		
		
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Emplyoee[id="+id+",Name="+Name+",Department="+Department+",salary=" +salary+"]";
				
	}
}
