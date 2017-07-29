/*
 * Creating a class Test
 */
public class Test {

	public static void main(String[] args) {
		//Creating a string buffer
		StringBuffer str= new StringBuffer();
		//Checking the initial capacity of StringBuffer
			System.out.println(str.capacity());
			//using append once in this case also capacity of the buffer is 16
			str.append("Hello");
			System.out.println(str.capacity());
			//Now increasing the number of characters from current capacity
			str.append("Prienc learns java");
			System.out.println(str.capacity());//Here  it increases the capacity by (oldcapacity*2)+2

	}

}
