package palindromestring;

public class Palindrome {
	String name;

	public Palindrome(String name) {
		this.name = name;
	}

	public void palindromeChar() {
		String reverse = "";

		for (int size = name.length() - 1; size >= 0; size--)
			reverse = reverse + name.charAt(size);

		if (name.equals(reverse))
			System.out.println(name + " its a palindrome");

		else
			System.out.println(name + " its not a palindrome");

	}
}