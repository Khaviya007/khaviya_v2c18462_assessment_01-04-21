package oddevenlamda;
interface Evodd{
	public void value();
}
public class Oddeven {
	public static void main(String[] args) {
	int[] num=new int[] {1,2,3,4,5};
	
		Evodd e=()->{
		for(int i=0;i<num.length;i++) {
			if((num[i])%2==0) {
				int k=num[i];
				System.out.println( k+" is even no");
				
			}
			else {
				int k=num[i];
				System.out.println(k+" is odd no");
				
				}
				}	
		//return 0;
		};
		e.value();
		//System.out.println(e.value());
	}

}
