public class Student
{
 	int rollno;
 	String name;
 	
	public Student(int rollno,String name)
	{
		this.rollno=rollno;
		this.name=name;
	}
 
	 public static void main(String[] args) 
	{
 		 Student s[] = new Student[5];
		s[0]=new Student(1,"PQR");
		s[1]=new Student(2,"ABC");
		s[2]=new Student(3,"XYZ");
		s[3]=new Student(4,"LMN");
		s[4]=new Student(5,"IJK");
  
  		for(int i=0; i<5; i++) 
		{
   			System.out.println("Student Roll No.= "+s[i].rollno);	
			System.out.println("Student name= "+s[i].name);		
  		}
 
	 }
}