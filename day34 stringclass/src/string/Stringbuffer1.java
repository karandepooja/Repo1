package string;

public class Stringbuffer1 {

	public static void main(String[] args) {
		//String str = "ABC";
		//str.a
		StringBuffer sb=new StringBuffer("hello");
		System.out.println("original StringBuffer value: "+sb);
		sb.append("java");//now original string changed
		System.out.println(sb);
		sb.insert(5, "pune");//now original string changed
		System.out.println(sb);
		sb.replace(1, 3, "XXX");
		System.out.println(sb);
		sb.delete(1, 4);
		System.out.println(sb);
		StringBuffer s1=new StringBuffer("Bangalore is know for IT");
		s1.reverse();
		System.out.println(s1);
		System.out.println("***************");
		StringBuffer s2=new StringBuffer();
		System.out.println(s2.capacity());
		s2.append("hello");
		System.out.println(s2.capacity());
		s2.append("java is my favourite language");
		System.out.println(s2.capacity());//now(16*2)+2=34 i.e(oldcapacity*2)+2
		s2.append("I am from automation area");
		System.out.println(s2.capacity());
		
		
		
		
		
		

	}

}
