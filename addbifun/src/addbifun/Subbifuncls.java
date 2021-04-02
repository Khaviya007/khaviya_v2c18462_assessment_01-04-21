package addbifun;
import java.util.function.BiFunction;
interface adding{
	public static int add(int a,int b) {
		return a+b;
	}
}
public class Subbifuncls {
	public static void main(String[] args) {
		BiFunction <Integer,Integer,Integer> a=adding :: add;
		int r= a.apply(200,100);
		System.out.println("The value is: "+r);
	}

}
