package JavaDemos;

public class givenprimeornotdemo {
	public static void main(String[] args) {
		int f=0,n=6,m=n/2;
		if(n==0||n==1) {
			System.out.println("Not a prime");
			
		}else {
			for(int i=2;i<=m;i++) {
				if(n%i==0) {
					f=1;
					System.out.println(n+" "+"Not a prime");
					break;
				}
			}
		}
		if(f==0) {
			System.out.println(n+" "+"prime number");
		}
	}

}
