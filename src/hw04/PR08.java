/*
 * ๋ฐฉ์ ? 4X + 5Y =60? ๋ชจ๋  ?ด๋ฅ? ๊ตฌํ? ?๋ก๊ทธ?จ? ??ฑ???ค. XY? 10?ด?? ??ฐ?
 */


package hw04;

public class PR08 {

	public static void main(String[] args) {

		int x, y;
		
		for(x = 1; x <= 10; x++)
		{
			for(y = 1; y <= 10; y++)
				if((4 * x + 5 * y) == 60)	
					System.out.println(x + ", " + y);
		}
		
		
	}

}
