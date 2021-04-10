
public class SelectionDemo {
	
	public static void main (String[] args) {
		
		// if
		
		int m = 1235;
		
		if (m%2==0) {
			System.out.println("m is even");
		}
		else if (m%2!=0) {
			System.out.println("m is odd");
		}
		else {
			System.out.println("m is neither even or odd");
		}
		
		//ternary : condition?value1:value2
		
		int n = (m%2==0)?m*2:m*3;
		
		System.out.println("m="+m);
		System.out.println("n="+n);
		
		//switch : 
		
		String a = "40";
		
		switch(a) {
		case "40":
			System.out.println("40 street");
			break;
		case "41":
			System.out.println("41 street");
			break;
		default:
			System.out.println("other street");
		}
		
		int ab = 41;
		
		switch(ab) {
		case 40:
			System.out.println("40 street");
			break;
		case 41:
			System.out.println("41 street");
			break;
		default:
			System.out.println("other street");
		}
		
		char isComplete = 'Y';
		
		switch(isComplete) {
		case 'Y':
			System.out.println("40 street");
			break;
		case 'N':
			System.out.println("41 street");
			break;
		default:
			System.out.println("other street");
		}
		
					
	}

}
