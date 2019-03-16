package test.vo;

public class Teacher extends Person {

	@Override
	public void working() {
		super.working();
		System.out.println("teacher正在批改作业...");
	}
}
