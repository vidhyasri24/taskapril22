package reversestring;

public class Reverse {
	String letter;
	String reverse;

	public Reverse(String letter) {
		this.letter = letter;
		this.reverse = "";

	}

	public void reversecharacter() {
		for (int i = letter.length() - 1; i >= 0; i--) {
			reverse = reverse + letter.charAt(i);

		}
		System.out.println(" reverse letter : " + reverse);
	//	StringBuffer buffer=new StringBuffer("vidhyanu");
	//	System.out.println(buffer.reverse());
	}

}
