package JavaDemos;

public class Armstrongnumberdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=244,sum=0,temp;
		int r;
		temp=n;
		while(n>0) {
			r=n%10;
			sum=sum+r*r*r;
			n=n/10;
		}
		if(temp==sum) {
			System.out.println(temp+" "+"is an Armstrong number");
			
		}
		else {
			System.out.println(temp+" "+"is not an Armstrong number");
			
		}
		
	}

}
