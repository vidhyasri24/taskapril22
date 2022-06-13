package stringmethod;

public class Method {
	String name, name2, name3;

	Method(String name, String name2, String name3) {
		this.name = name;
		this.name2 = name2;
		this.name3 = name3;
	}

	void lengthMethod() {
		int length = name.length();
		System.out.println(name + " length is = " + length);
	}

	void upperCaseMethod() {
		String uppercase = name.toUpperCase();
		System.out.println(name + " -> upper case -> " + uppercase);
	}

	void lowerCaseMethod() {
		String lowerrcase = name.toLowerCase();
		System.out.println(name + " -> lower case -> " + lowerrcase);
	}

	void replace() {
		String replace = name.replace('e', 's');
		System.out.println(name + " ->  " + replace);

		String replaceWord = name.replace("Welcome", "Hello");
		System.out.println(name + " -> " + replaceWord);

	}

	void contains() {
		boolean contains = name.contains("to");
		System.out.println(name + " -> " + contains);

		boolean contains2 = name.contains("is");
		System.out.println(name + " -> " + contains2);
	}

	void concat() {
		String concat = name.concat(" Hi! all");
		System.out.println(name + " -> " + concat);

	}

	void methodEquals() {
		boolean equals = name.equals(name3);
		System.out.println(equals);

		boolean equals2 = name.equals(name2);
		System.out.println(equals2);

	}

	void equalsIgnoreCase() {
		boolean equalsIgnoreCase = name.equalsIgnoreCase(name3);
		System.out.println(equalsIgnoreCase);
	}

	void trim() {
		String trim = name.trim();
		System.out.println(name + " -> " + trim);

	}

	void substring() {
		String substring = name.substring(8);
		System.out.println(name + " -> " + substring);

		String substring2 = name.substring(5, 9);
		System.out.println(name + " -> " + substring2);
	}
}
