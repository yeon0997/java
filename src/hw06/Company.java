package hw06;

public class Company {

	//private??±?
	private static Company instance = new Company(); //??΄? μ»΄ν??Ό? ?Έ?€?΄?€? λ§λ€ ? ??
	
	private Company() {} 
	
	public static Company getinstance() {
		if(instance == null) {	//κΈ°μ‘΄? λ§λ€?΄μ§? ?Έ?€?΄?€κ°? ??€λ©?
			instance = new Company(); //?Έ?€?΄?€λ₯? λ§λ€κ³?
		}
		return instance; //??€λ©? ???? ?Έ?€?΄?€λ₯? λ°ν??Ό
	}
	
	
	
}
