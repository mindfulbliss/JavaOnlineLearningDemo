// Final keyword can be used with

//variables - final keyword her mean that variable is a constant
// syntax public final double PI =3.14 == note that constant variable
//are UPPER CASE. Also once assigned value cannot be changed. 

//class AAA
//{
//	final int k = 10;
//	final int i;
//	
//	public AAA(){
//		this.i=10; // here we are assigning value in constructor. 
//	}
//	
//}
//
//public class FinalKeywordDemo {
//	
//	public static void main(String[] args) {
//		AAA a = new AAA();
//		a.i=80; // error the final field a.i cannot be assigned.
//	}
//	
//
//}


//methods - When final is used with a method 
//no other class can override by extending the class.

//class MoneyMakingFormula{
//	public final void formula() {
//		System.out.println("This is the money making formula by OWNER");
//	}
//}
//
//class Freeloader extends MoneyMakingFormula{
//	public void formula() { //ERROR: Cannot override the final methd from MoneyMakingFormula
//		System.out.println("This is money making formula by FREELOADER");
//	}
//}
//
//class FinalKeywordDemo{
//	public static void main(String[] args) {
//		Freeloader fr = new Freeloader();
//		fr.formula();
//	}
//}


//classes - When a class is made final no other class can extend it/ inherit it.
//Thus your source code is safe and limits other from extending it
//thus using your methods.

//final class MyMoneyMakingSourceCode{
//	
//	public void specialMethod(String message) {
//		System.out.println(message);
//		
//	}
//}
//
//// here class freeloader extends the money making class,
////this can be stopped by making your source code as final. 
////Error : type freeloader cannot subclass the final type MyMoneyMakingSourceCode
//class Freeloader extends MyMoneyMakingSourceCode{
//	
//}
//
//class FinalKeywordDemo{
//	public static void main(String[] args) {
//		Freeloader fr = new Freeloader();
//		fr.specialMethod("Ghar baithe jeeto KBC");
//	}
//}
