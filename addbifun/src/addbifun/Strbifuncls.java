package addbifun;
import java.util.function.BiFunction;
interface Stringfun{
	public static String str(String a,String b) {
		System.out.println("First String is: "+a);
		System.out.println("Second String is: "+b);
		return a+b;
	}
}
public class Strbifuncls {
	public static void main(String[] args) {
		BiFunction <String,String,String> a=Stringfun :: str;
		String r= a.apply("Welcome","home");
		System.out.println("The whole string is: "+r);
	}
}
