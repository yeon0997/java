//λ°°μ΄? ?Έ
//?λ£ν[] λ°°μ΄?΄λ¦? = new ?λ£ν[κ°μ]
//?λ£ν λ°°μ΄?΄λ¦?[] = new ?λ£ν[κ°μ]

package hw07;

public class Arraytest {
	
	public static void main(String[] args)	{
		
		//???κ°λ κ°μ? κ²?
		//int[] studentids = new int[10];
		//int studentids[] = new int[10];
		
		int studentids[] = new int[] {100, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1}; //κ°μ μ΄κΈ°?? λ°°μ΄
		
//		for(int i = 0, num = 10; i < 10; i++, num--)  {
//		studentids[i] = num;
//		}
		
		for(int i = 0; i < studentids.length; i++) //length? λ°°μ΄? κ°μλ₯? ???Όλ‘? ?Ό?€
		System.out.printf("%3d",studentids[i]);

	}
	
}
