package BasicJava;

import java.util.Scanner;

public class AdditionofTwoNumbersScanner {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int A;
		double B,Add,Mul,Div;
		System.out.println("Enter A:");
		
		A=scan.nextInt();
		System.out.println("Enter B:");
		B=scan.nextDouble();
		Add=A+B;
		System.out.println("The Addition of Two Numer is:"+Add);
		Mul=A*B;
		System.out.println("The Multipication of Two Number is:" +Mul);
		Div=A/B;
		
	}
	

}
