
public class Student {
	public Student()// this is constructor and also you can pass parameteres to constructor
	{
	System.out.println("Constructors called");
	}
	public Student ( String abc)
	{
	name=abc;
	}
int age;
String name;
int id;
static String schoolname;
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}

static public void Calculate()
{
String temp;
temp=schoolname;
//temp=name;//error we cant use non static varaibe inside static method
}

}
