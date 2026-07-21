public class Employee 
{
 	int empid;
 	String name;
 	double salary;
 	
	public Employee(int empid,String name,double salary)
	{
		this.empid=empid;
		this.name=name;
		this.salary=salary;
	}
 
	 public static void main(String[] args) 
	{
 		 Employee e[] = new Employee[5];
		e[0]=new Employee(1,"PQR",15000);
		e[1]=new Employee(2,"ABC",16000);
		e[2]=new Employee(3,"XYZ",18000);
		e[3]=new Employee(4,"LMN",20000);
		e[4]=new Employee(5,"IJK",25000);
  
  		for(int i=0; i<5; i++) 
		{
   			System.out.println("Employee Id= "+e[i].empid);	
			System.out.println("Employee name= "+e[i].name);
			System.out.println("Employee Salaray= "+e[i].salary);		
  		}
 
	 }
}