package day12exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UsingThrows {
	static int acceptText() throws IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
		System.out.println("Enter a text: "); 
		int str = br.read();
		return str;
	}
	public static void main(String[] args) {
		try {
			int str = acceptText();
			System.out.println("Your string is: "+str);
		}catch (IOException e) {
				System.err.println(e.getMessage());
		}
	}
}
