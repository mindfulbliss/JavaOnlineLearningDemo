import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Comparator interface works for defined datatype Integer, String, Float
//But we want to compare based on Custom object say Obj of class Student
// For this we use the comparable interface
//The Comparable interface should be implemented by the class whose obj
// is to be compared.

class Stud implements Comparable<Stud>
{
	int rollNo,marks;
	String name;
	
	public Stud(int rollNo, String name, int marks) {
		this.rollNo= rollNo;
		this.name= name;
		this.marks= marks;
	}

	
	


	
	public String toString() {
		return "Stud [rollNo=" + rollNo + ", marks=" + marks + ", name=" + name + "]";
	}


	
	public int compareTo(Stud o) {
		return marks>o.marks?1:-1;
	}


	
	
	
}


public class CollectionsObjectComparableInterfaceDemo {
	
	public static void main(String[] args)
	{
		List<Stud> s = new ArrayList<>();
		
		s.add(new Stud(1,"GOG",50));
		s.add(new Stud(2,"SBG",10));
		s.add(new Stud(3,"UAG",51));

		Collections.sort(s);
		
		for(Stud k: s) {
			System.out.println(k);
		}
		
		// Even though we have sorted it based on the marks
		// we can sort it based on the criteria that we provide
		
		Collections.sort(s,(i,j) -> i.name.charAt(1) > j.name.charAt(1)? 1:-1);
		for (Stud k:s) {
			System.out.println(k);			
		}
		
		
		
	}
	

}
