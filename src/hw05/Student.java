package hw05;

//?΄??€? ?Έ
public class Student{
	int id;
	private String name;
	int grade;
	String dept;
	String address;
	
	//original constructor
	public Student() {
		System.out.println("κΈ°λ³Έ??±? ?ΈμΆ?");
	}
	
	public Student(String p_name) {
		name = p_name;
		System.out.println("?΄λ¦μ κ°?μ§? ??±? ?ΈμΆ?");
	}
	
	//?? ?¨?¬λ―Έν° ??±?
	public Student(int p_id,String p_name, int p_grade, String p_dept, String p_address) {
		id = p_id;
		name = p_name;
		grade = p_grade;
		dept = p_dept;
		address = p_address;
		
		System.out.println("full parameter ??±? ?ΈμΆ?");
		
	}
	
	public void setname(String pname) {
		name = pname;
	}
	
	public String getname()
	{
		return name;
	}
	
	public void study() {	//λ©μ?
		System.out.println(name + "?΄(κ°?) " + dept +  "λ₯? κ³΅λ???€.");
	}
	
	public void showInfo() {
		System.out.println(id + ", " + name + ", " + grade + ", " + dept + ", " + address);
	}
	
	
}// end of class Student
