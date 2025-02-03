package aula;

import java.util.Scanner;

public class soma {

	public static void main(String[] args) {
				
		Scanner sc = new Scanner(System.in);
		
		Double n1;
		Double n2;
		Double soma;
		n1 = sc.nextDouble();
		n2 = sc.nextDouble();
		soma= (n1 * n2);
		
		
		System.out.println("A multiplicaçao e;" + soma);
		
	}

}
