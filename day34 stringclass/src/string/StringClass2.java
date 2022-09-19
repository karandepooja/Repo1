package string;
import java.util.Scanner;

public class StringClass2 {
	public static void main(String[] args) {
		String str1= "DhanoriPune";
		char c = str1.charAt(0);
		System.out.println("char at index 0: "+ c);
		//to print one by one character of string
		for(int i=0; i < str1.length(); i++) {
			System.out.println(str1.charAt(i));
		}
		System.out.println("**************");
		//to print one by one character of string from the last index
		for(int i= str1.length()-1; i >=0;i--) {
			System.out.println(str1.charAt(i));
		}
		System.out.println("***********");
		String temp = "DhanoriPune ";
		for(int i = str1.length()-1;i >=0; i--) {
			temp=temp + str1.charAt(i);
		}
		
	}

}
