//swap 2 variables without using third variable ?
package Programs;

public class SwapUsingTwoVariables {
	public static void main(String args[]) {
		System.out.println(args);
		swap(2, 3);
	}
	 static int swap(int a, int b) {
		a=a+b;
		System.out.println("a="+a);
		b=a-b;
		System.out.println("b="+b);
		a=a-b;
		System.out.println("a="+a);
		return a;
	}
}
