//Given an int n, return the absolute difference between n and 21, except return double the absolute difference if n is over 21.
package Programs;

public class AbsoluteValue {
	public static void main(String[] args) {
		System.out.println(absoluteValue(0)); //21
		System.out.println(absoluteValue(-22)); //43
		System.out.println(absoluteValue(-54)); //75
		System.out.println(absoluteValue(54)); //66
		System.out.println(absoluteValue(22)); //2
		System.out.println(absoluteValue(21)); //0
		System.out.println(absoluteValue(-21)); //42
		}
		
				
		public static int absoluteValue(int a){
		int abs= Math.abs(a-21);
			if(a>21){
			return abs*2;
			}
		 return abs;
		}
		
}
