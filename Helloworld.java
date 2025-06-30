package d;

public class Helloworld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a = 50;
		int b = 150;
		int  c = 25;
		System.out.println ("large No in A B C is:");
		if (a >= b) {
			if(a >= c) {
				System.out.println("A is large :" + a);
			}
		}
		else if(b >= c) {
			System.out.println("B is large :"+b);
		}
		else {
			System.out.println("C is larege : "+ c);
		}
	

		
		
		System.out.println();
		
		
		for(int i =1; i <= 10;i++) {
			for(int j = 1; j <= i;j++) {
				System.out.print( "* ");
			}
			System.out.println();
	}
		
		System.out.println();
	
	
		int n= 5;
		int f=0;
		int s=1;
		System.out.print("faboncci series :"+n+" :");
		for(int i=1;i<=n;i++) {
			System.out.print(f + " ");
			int next= f+s;
			f=s;
			s=next;
		}
		
		
  }
}

