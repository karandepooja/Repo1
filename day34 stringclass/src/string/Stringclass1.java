package string;

public class Stringclass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stringclass1 c1=new Stringclass1();
		System.out.println("c1: "+c1);
		//String representation of an object because of toString()
		//String class object creation
		//1.using literal
		String s1="Mumbai";//new object will be create in String constant pool
		String s2="Mumbai";//no object will be create as its a duplicate object, so's2' will points to 's1' object
		String s3="Bangalore";//new object will be create in String constant pool
		System.out.println("s1:"+s1);//object value because toString() is overrided in String class
		System.out.println("s2:"+s2);
		System.out.println("s3:"+s3);
		System.out.println("s2:+s2");
		System.out.println("s1 char count: "+s1.length());
		System.out.println("s2 char count: "+s2.length());
		System.out.println("s3 char count: "+s3.length());
		/**
		 * outside String class:==-->compare two values
		 * .equals(obj)-->compare two objects based on there address
		 * inside String class ==> compare two object based on address
		 * .equals(obj)==>compare two object based on value
		 */
		System.out.println("s1 & s2 using equals(): "+s1.equals(s3));//compare s1 and s2 values
		System.out.println("s1 & s2 '==' "+(s1==s2)); //compare s1 and s2 based on address
		System.out.println("s1 & s3 using equals(): "+s1.equals(s3));
		System.out.println("s1 & s3 '==' "+(s1==s3)); 
		String s4=new String("Mumbai");//two object---> constant pool 2.non-constant pool
		System.out.println("s4:"+s4);
		System.out.println("s1 & s4 using equals(): "+s1.equals(s4));
		System.out.println("s1 & s4 '==' "+(s1==s4));
		String s5=new String("Mumbai");
		System.out.println("s4 & s5 using equals(): "+s1.equals(s5));
		System.out.println("s4 & s5 '==' "+(s4==s5));
		String s6=new String("Hyderabad");
		System.out.println("s1 & s6 using equals(): "+s1.equals(s6));
		System.out.println("s1 & s6 '==' "+(s5==s6));
	}

}
