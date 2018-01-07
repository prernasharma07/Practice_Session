//Given 2 ints, a and b, return their sum. However, sums in the range 10..19 inclusive, are forbidden, so in that case just return 20.
package Programs;

public class ForSumRange10to19Return20 {
	public static void main(String[] args) {
		System.out.println(forSumRange10to19Return20elseReturnSum(-8,-2)); //-10
		System.out.println(forSumRange10to19Return20elseReturnSum(8,2)); //20
		System.out.println(forSumRange10to19Return20elseReturnSum(10,-1)); //9
		System.out.println(forSumRange10to19Return20elseReturnSum(19,0)); //20
		System.out.println(forSumRange10to19Return20elseReturnSum(0,1)); //1
		System.out.println(forSumRange10to19Return20elseReturnSum(19,1)); //20
		System.out.println(forSumRange10to19Return20elseReturnSum(20,-1)); //20
		System.out.println(forSumRange10to19Return20elseReturnSum(2,4)); //6
		System.out.println(forSumRange10to19Return20elseReturnSum(10,30)); //40
		
		}
				
		public static int forSumRange10to19Return20elseReturnSum(int a, int b){
			int sum = a+b;
		if(sum>=10 && sum<=19){
			sum = 20;
			return sum;
			}
		 return sum;
		}
}
