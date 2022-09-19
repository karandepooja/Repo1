package string;

public class StringClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1=" I am from umb, I am working in accenture, I working as QA Deleivery head";
		System.out.println("Actual String: "+s1);
		String[] strAry=s1.split(" ");
		for(String s:strAry) {
			System.out.println(s);
		}
	}
}

