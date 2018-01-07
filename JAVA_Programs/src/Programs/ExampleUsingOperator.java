//The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation. 
//We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.
package Programs;

public class ExampleUsingOperator {

	public static void main(String args[]){
		boolean a= SleepIn(true,true);
		boolean b= SleepIn(true,false);
		boolean c= SleepIn(false,false);
		boolean d= SleepIn(false,true);
		System.out.println(" "+a+" "+b);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
	public static boolean SleepIn(boolean weekday, boolean vacation){
		if(weekday==false && vacation==true) return true;
		return false;
	}
}
