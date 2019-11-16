//An anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

package Assignment;

public class AnagramCode {

	public static void main(String params[]) {
		String O_Str1 = "conversation ";
		String U_Str1 = O_Str1.replaceAll("\\s", "").toUpperCase();
		char Str1[] = U_Str1.toCharArray();
		String O_Str2 = "voices rant on";
		String U_Str2 = O_Str2.replaceAll("\\s", "").toUpperCase();
		char Str2[] = U_Str2.toCharArray();
		System.out.println("String 1: " + U_Str1 + " String 2: " + U_Str2);
		int len = Str1.length;// 10
		if (len == Str2.length) {
			int count = 0;
			int temp = 0;
			for (int i = 0; i < len; i++) {
				System.out.println((i + 1) + ". Searching character " + Str1[i] + " from " + U_Str1 + " in " + U_Str2);
				for (int k = 0; k < len; k++) { // For finding the occurrence of a letter in String 1
					if (Str1[i] == Str1[k]) {
						temp++;
					}
				}
				System.out.println(Str1[i] + " occurred " + temp + " time(s) in " + U_Str1);
				for (int j = 0; j < Str2.length; j++) { // For finding the count of that letter in String 2
					if (Str1[i] == Str2[j]) {
						count++;
					}
				}
				System.out.println("Occurrence of " + Str1[i] + " in " + U_Str2 + " is " + count);
				// For comparing the results of occurrence of a letter found in String 1 and in
				// String 2
				if ((i == len - 1) && count == temp) {
					System.out.println();
					System.out.println("STRINGS ARE ANAGRAM OF EACH OTHER!");
				} else if (i != len - 1) {
					if (count == temp) {
						System.out
								.println("Letter found with same number of occurrance!! Let's check the other letter.");
						count = 0;
						temp = 0;
						System.out.println();
					} else {
						System.out.println("The provided strings are NOT anagram of each other.");
						return;
					}
				}
			}
		} else {
			System.out.println("The provided strings are NOT anagram of each other.");
		}
	}
}