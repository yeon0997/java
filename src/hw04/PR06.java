package hw04;

import java.util.Scanner;

public class PR06 {

	public static void main(String[] args) {

		//1. λ³??λ₯? ? ?Έ
		int a = 0, b = 0, num = 0;
		
		Scanner sc = new Scanner(System.in);
		
		//2. ??? λ°λ³΅??€κ°? 4λ²μ΄λ©? μ’λ£
		while(num != 4)
		{
			
			System.out.println("??λ²νΈλ₯? ?? ₯?΄μ£ΌμΈ?. 1. ?κΈ? 2. μΆκΈ 3. μ‘°ν 4.μ’λ£");
			num = sc.nextInt();

			switch(num)
			{
			case 1 :	//?κΈ?
				System.out.println("?κΈν  κΈμ‘? ?? ₯??Έ?");
				b = sc.nextInt();
				a = a + b;
				System.out.println("?κ³ λ " + a + "???€" );
				b = 0;
				break;
			
			case 2 :	//μΆκΈ
				System.out.println("μΆκΈ?  κΈμ‘? ?? ₯??Έ?");
				b = sc.nextInt();
			
				if(a >= b)
				{
					a = a - b;
					System.out.println("?κ³ λ " + a + "? ???€" );
				}
			
				else
				{
					System.out.println("?κ³ κ? λΆ?μ‘±ν©??€");
				}
				break;
		
			case 3 :	//?κΈμ‘°?
				System.out.println("?κ³ λ " + a + "? ???€");
				break;
		
			case 4 :	//μ’λ£
				System.out.println("??? μ’λ£?©??€");
				break;
				
			case 5 : //?€λ₯?
				System.out.println("?€λ₯?!");
				break;
		
			} //case
		
		
		}//while
			
	}

}
