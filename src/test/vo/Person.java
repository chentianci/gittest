package test.vo;

public class Person implements Cloneable{

	public String name = "Person";
	public int age = 18;
	
	public void working() {
		System.out.println("person正在工作...");
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	public void fun(String name) {
		System.out.println(name + "在父类");
	}
	
}
