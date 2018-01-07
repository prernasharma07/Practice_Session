//Return true if the given non-negative number is 1 or 2 more than a multiple of 20.
package Programs;

public class TrueifValueIsMultipleof20 {

	public static void main(String[] args) {
		enter_values(18);
		enter_values(20);
		enter_values(19);
		enter_values(25);
		enter_values(0);
		enter_values(-6);
		
		}
		
		static void enter_values(int num1){
			if (num1>=0){
				System.out.println(trueifValueIsMultipleof20(num1));
			}
			else System.out.println("Values can not be less than 0");
		}
				
		public static boolean trueifValueIsMultipleof20(int a){
		if((a+1)%20==0 || (a+2)%20==0){
			return true;
			}
		 return false;
		}
}
