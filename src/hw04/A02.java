package hw04;

import java.util.Scanner;

public class A02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.println("?«?λ₯? ?? ₯??Έ?.");
		num = sc.nextInt();
		
		if((num % 2) == 0)
		{
			System.out.println(num + "??(?) μ§μ???€.");
		}
		
		else
		{
			System.out.println(num + "??(?) ??????€.");
		}
		
	} //λ©μΈμ’λ£

}
