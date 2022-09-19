package string;

public class Stringclass5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="I am form pune";
		System.out.println("Actual String: "+s1);
		String str[]=s1.split(" ");
		String temp=" ";
		for(String s:str){
		System.out.println(s);
		}
		for(int i=str.length-1; i>=0; i--) {
			temp=temp+""+str[i];
		}
		System.out.println("reverse statement: "+temp);
		String s2=" I am pooja";
		System.out.println("Actual String with spaces: "+s2);
		System.out.println("Actual String length: "+s2.length());
		System.out.println("Actual String without spaces: "+s2.trim());
		System.out.println("Actual String length without spaces: "+s2.trim().length());
		String s3="I am yogesh";
		System.out.println("Actual String with spaces: "+s3.trim());
		System.out.println("Actual String length: "+s2.trim().length());
		
		
		
		}
		

	}


