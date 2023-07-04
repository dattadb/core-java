package Basic;

public class Swip_number_withoutThird5 {
	
	public static void main(String[] args) {
		
		
		int a=10;
		int b=20;
		
		System.out.println("before swap");
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("after swap");
		
		a=a+b;
		b=a-b;
		a=a-b;
	
		System.out.println(a);
		System.out.println(b);
		
		
	}

}
