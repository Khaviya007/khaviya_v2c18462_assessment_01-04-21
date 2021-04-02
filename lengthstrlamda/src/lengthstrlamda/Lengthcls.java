package lengthstrlamda;
interface Length{
	public String name(String a);
}
public class Lengthcls {
	public static void main(String[] args) {
	
   Length l=(a)->{   
	   System.out.println("Length of string is: "+a.length());
	   return a;
   };
   
   l.name("sivagopal");
	}

}
