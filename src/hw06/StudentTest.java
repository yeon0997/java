package hw06;

public class StudentTest {

	public static void main(String[] args) {
		//staticλ³?? ?¬?©λ²μκΈ?
		//staticλ³??? κ°μ²΄?? κ°μ²΄κ°? κ³΅λ?Όλ‘? ?¬?©?  ? ??€
//		Student studentkim = new Student("kim", 10000);
//		studentkim.showinfo();
//		Student studentlee = new Student("lee", 10000);
//		studentlee.showinfo();
		
		//κ°μ²΄λ₯? ??±?μ§? ?κ³? ?΄??€ λ³??κ°μ ??Έ?κΈ?
		//static? κΈ°λ₯
		//System.out.println(Student.serialnum);
		//System.out.println(Student.grade); //static?΄ ???΄? μ‘°ν λΆκ?
		Student.showserial(); //serial?? staticλ³???Ό? κ°μ²΄λ₯? ??±?μ§???? μ‘°νκ°? κ°??₯??€
	}

}
