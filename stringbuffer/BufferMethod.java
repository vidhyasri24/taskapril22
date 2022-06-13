package stringbuffer;

import stringmethod.Method;

public class BufferMethod {
	public void buffer() {

		StringBuffer append = new StringBuffer("Hello Atmecs");
		append.append(" Family ");
		System.out.println(" Append : " + " " + append);


		StringBuffer insert = new StringBuffer("vidhyasri");
		insert.insert(6, "anu");
		System.out.println("Insert the words" + " " + insert);


		StringBuffer replace = new StringBuffer(" i am from ariyalur");
		replace.replace(11, 21, "Chidambaram");
		System.out.println("Replace the word:" + " " + replace);



		StringBuffer delete = new StringBuffer("Captain America");
		delete.delete(1, 5);
		System.out.println("Delete the words:" + " " + delete);


		StringBuffer reverse = new StringBuffer("Hello");
		reverse.reverse();
		System.out.println("Reverse the Words:" + " " + reverse);


		StringBuffer capacity = new StringBuffer();
		capacity.append("sri");
		System.out.println("Capacity of the word:" + " " + capacity.capacity());
		capacity.append("vidhya sri is a software trainee in atmecs");
		System.out.println("Capacity of the word:" + " " + capacity.capacity());


		

		}


}
