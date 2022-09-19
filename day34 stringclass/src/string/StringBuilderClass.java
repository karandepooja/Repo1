package string;

public class StringBuilderClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb=new StringBuilder("Hello");
		sb.append("java");
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		StringBuilder sb1=new StringBuilder("Hello java");
		System.out.println(sb1);
		StringBuilder sb2=new StringBuilder("Hello java");
		System.out.println(sb2);
		System.out.println(sb1.equals(sb2));//address basis comparison
		System.out.println(sb1==sb2);
		//we don't have any method in StringBuilder to compare object values, so to overcome that
		//first convert
		//StringBuffer/StringBuilder to String class using toString()
		//dn use equals() of String class
		System.out.println(sb1.toString().equals(sb2.toString()));
	}

}
