//The number 6 is a truly great number. Given two int values, a and b, return true if either one is 6. Or if their sum 6.
package Programs;

public class TrueIfAnyNumis6OrSumIs6 {
	public static void main(String[] args) {
		System.out.println(trueIfAnyNumis6OrSumIs6(8,-2));
		System.out.println(trueIfAnyNumis6OrSumIs6(-11,5));
		System.out.println(trueIfAnyNumis6OrSumIs6(-1,-5));
		System.out.println(trueIfAnyNumis6OrSumIs6(2,4));
		System.out.println(trueIfAnyNumis6OrSumIs6(10,6));
		System.out.println(trueIfAnyNumis6OrSumIs6(6,1));
		System.out.println(trueIfAnyNumis6OrSumIs6(0,6));
		System.out.println(trueIfAnyNumis6OrSumIs6(-0,-6));
		}

				
		public static boolean trueIfAnyNumis6OrSumIs6(int a, int b){
		if((a==6 || b==6)||(a+b==6)){
			return true;
			}
		 return false;
		}
}
