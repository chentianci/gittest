package test.vo;

public class Student extends Person {
	
	public String no = "student001";
	public String name = "student";

//	@Override
	public void working() {
		super.working();
		System.out.println("student正在写作业...");
	}
	
	public void fun() {
		System.out.println("在子类");
	}
}