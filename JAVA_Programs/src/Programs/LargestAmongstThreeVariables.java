//Find largest number amongst three variable
package Programs;

public class LargestAmongstThreeVariables {

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
			System.out.println(largest(num1,num2,num3));
		}
		else System.out.println("Values can not be less than 0");
	}
	
		
	static int largest(int num1, int num2, int num3){
	
	if((num1>num2 && num2>=num3) ||(num1>num3 && num3>=num2))	return num1;
	else if((num2>num1 && num1>=num3)||(num2>num3 && num3>=num1)) return num2;
	else if((num3>num1 && num1>=num2)||(num3>num2 && num3>=num1)) return num3;
	else return 0;
	
	}
		
}
