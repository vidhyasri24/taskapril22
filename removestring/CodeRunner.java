package removestring;

import java.util.Scanner;

public class CodeRunner {

	public static void main(String[] args) {
		{
			String str1, str2;
			Scanner scan = new Scanner(System.in);
			System.out.print("Enter the String1 :");
			str1 = scan.nextLine();
			System.out.print("Enter the String2 :");
			str2 = scan.nextLine();
			scan.close();

			RemoveMethod oRemoveMethod = new RemoveMethod();
			oRemoveMethod.removeCharacters(str1, str2);

		}

	}
}
