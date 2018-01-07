//Given three ints, a b c, return true if it is possible to add two of the ints to get the third.
package Programs;

public class AddTwoValuesGetThirdValue {
	public static void main(String[] args) {
		enter_values(0, 2, 0);
		enter_values(2, 2, 0);
		enter_values(0, 2, 3);
		enter_values(0, -2, 3);
		enter_values(8, 5, 3);
		enter_values(2, 3, 5);
		
		}
		
		static void enter_values(int num1, int num2, int num3){
			if (num1>=0 && num2>=0 && num3>=0){
				System.out.println(addTwoValuestoGetThirdValue(num1,num2,num3));
			}
			else System.out.println("Values can not be less than 0");
		}
				
		public static boolean addTwoValuestoGetThirdValue(int a, int b, int c){
		if((a+b)==c || (b+c)==a || (a+c)==b){
			return true;
			}
		 return false;
		}
		
}
