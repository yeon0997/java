/*
 * ?΄??€? ??±? constructor\
 * ?΄??€λ‘λ??° κ°μ²΄λ₯? ??±??€
 * ?΄??€? κΈ°λ³Έ? ?Όλ‘? ??°?λ₯? ?¬?¨??€
 * 
 */


package hw05;

public class A02_useclass {

	public static void main(String[] args) { 

		/*
		Student st1 = new Student(); //st1?? μ²¨μ‘°λ³??
		Student st2 = new Student("?κΈΈλ");
		Student st3 = new Student(1, "λ°λ¬Έ?", 4, "μ»΄ν¨?°κ³?", "μ²??κ΅?");
		
		st1.study();
		st2.study();
		st3.study();
		st3.showInfo();
		*/
		////////////////////////////////////////////////////////////////
		
		//Student st1 = new Student();
	//	st1.setname("? ? ?°"); //setname?΄?Ό? λ©μ?λ₯? ?΅?΄ private λ³??λ₯? ?¬?©
	//	st1.id = 1;
	//	st1.address = "μ²??κ΅?";	
	//	//System.out.println(st1.getname());
	//	System.out.println(st1.id);
	//	System.out.println(st1.address);
		
		InfoHiding info = new InfoHiding();
		info.setId(1);
		System.out.println(info.getId());
		
		
	}

}








