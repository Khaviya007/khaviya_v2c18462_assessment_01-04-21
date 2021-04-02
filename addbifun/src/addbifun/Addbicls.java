package addbifun;
import java.util.function.BiFunction;
interface  subtraction
{
	public static float sub(int a,float b) {
		return a-b;
	}
}
public class Addbicls {
	public static void main(String[] args) {
		BiFunction<Integer,Float,Float> s= subtraction :: sub;
		float r= s.apply(200,(float)100.6);
		System.out.println("The value is: "+r);
	}
}
