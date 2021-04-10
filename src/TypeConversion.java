
public class TypeConversion {

	public static void main (String[] args){
		
		double d = 54_38_87_43_354.46887348763453248536;
		float f = (float)d;
		int i = (int)d;
		
		System.out.println(d);
		System.out.println(f);
		System.out.println(i);
		
		double percent = 5.5;
		float fper = (float)percent;
		int per = (int)percent;
		System.out.println(per);
		System.out.println(fper);
		
		int agents = 50;
		float fagents = agents;
		double dagents = agents;
		
		System.out.println(agents);
		System.out.println(fagents);
		System.out.println(dagents);
		
			
		
	}
	
}
