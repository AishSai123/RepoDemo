package JavaDemos;

import java.util.Scanner;

public class primedemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter range:");
		int a,b;
		a=sc.nextInt();
		b=sc.nextInt();
		while(a<b) {
			int f=0;
			for(int i=2;i<=a/2;i++) {
				if(a%i==0) {
					f=1;
					break;
				}
			}
			if(f==0) {
				System.out.println(a+" ");
			
			}
			a++;
				
		}
		
		
			
		}
		


	}


