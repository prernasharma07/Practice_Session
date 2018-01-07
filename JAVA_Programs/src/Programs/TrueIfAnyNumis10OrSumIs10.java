//Given 2 ints, a and b, return true if one of them is 10 or if their sum is 10.
package Programs;

public class TrueIfAnyNumis10OrSumIs10 {
	public static void main(String[] args) {
		System.out.println(trueIfAnyNumis10OrSumIs10(-8,-2));
		System.out.println(trueIfAnyNumis10OrSumIs10(11,-1));
		System.out.println(trueIfAnyNumis10OrSumIs10(1,10));
		System.out.println(trueIfAnyNumis10OrSumIs10(2,8));
		System.out.println(trueIfAnyNumis10OrSumIs10(10,2));
		}

				
		public static boolean trueIfAnyNumis10OrSumIs10(int a, int b){
		if((a==10 || b==10)||(a+b==10)){
			return true;
			}
		 return false;
		}
}
