class Student{
	
	int studentId;
	String studentName;
	
	public Student(int studentId, String studentName)
	{
		this.studentId=studentId;
		this.studentName=studentName;
	}
	
	public void PrintStudentDetails()
	{
		System.out.println("Student ID = "+studentId+" : Student Name = "+studentName);
	}
	
	
	
}



public class ArraysOneDimensional {
	
	public static void main(String[] args)
	{
		//array declaration
		int[] marks = new int[4];
		
		//array initialization
		marks[0]=50;
		marks[1]=20;
		marks[2]=30;
		marks[3]=77;
		
		//looping through array with for loop
		for(int i=0;i<marks.length;i++)
		{
			System.out.println(marks[i]);			
		}
		
		System.out.println("============");
		
		int[] ages = {30,11,44,77,90};
		
		for(int j=0; j<ages.length;j++)
		{
			System.out.println(ages[j]);
		}
		
		
		// here we are creating  Obj of Student class
		//for three students and printind their information
		
		Student s1 = new Student(1,"Alpha");
		Student s2 = new Student(2,"Bravo");
		Student s3 = new Student(3,"Charlie");
		
		s1.PrintStudentDetails();
		s2.PrintStudentDetails();
		s3.PrintStudentDetails();
		
		// Here we are creating an array of Student class 
		//and assigning  values to each student
		//finally we are printing them.
		
		Student[] s = new Student[4];
		s[0]= new Student(5,"Foxtrot");
		s[1]= new Student(6,"Golf");
		s[2]= new Student(7,"Hotel");
		s[3]= new Student(8,"India");
		
		for(int i=0; i<s.length;i++)
		{
			s[i].PrintStudentDetails();
		}
		
		

		
		
	}

}
