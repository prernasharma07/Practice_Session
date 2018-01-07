//Return true if the given non-negative number is a multiple of 3 or 5, but not both.
package Programs;

public class TrueIfMultipleofEither3or5 {
	public static void main(String[] args) {
		enter_values(18);
		enter_values(15);
		enter_values(20);
		enter_values(0);
		enter_values(-6);
		
		}
		
		static void enter_values(int num1){
			if (num1>=0){
				System.out.println(trueIfMultipleofEither3or5(num1));
			}
			else System.out.println("Values can not be less than 0");
		}
				
		public static boolean trueIfMultipleofEither3or5(int a){
		if((a%3!=0 && a%5==0)||(a%3==0 && a%5!=0)){
			return true;
			}
		 return false;
		}
}
