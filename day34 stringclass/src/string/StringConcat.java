package string;

public class StringConcat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="pune"+1536;
		System.out.println(str);
		String str1=str.concat(null);//Null pointer Exception
		System.out.println(str1);

	}

}
