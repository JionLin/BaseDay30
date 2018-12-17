/**
 * @Auther: Joinlin
 * @Descriptional: 假如我们在开发一个系统时需要对员工类进行设计，员工包含3个属性：姓名、工号以及工资。
 * 经理也是员工，除了含有员工的属性外，另为还有一个奖金属性。
 * 请使用继承的思想设计出员工类和经理类。要求类中提供必要的方法进行属性访问。
 * @Date: Create in 9:30 2018/6/7
 * @Modify By:
 */
public class AbstractTest3 {
	public static void main(String[] args) {
		Employee employee=new Program("小强","a111",10000);
		employee.work();
		System.out.println(employee.getEid()+":"+employee.getName()+":"+employee.getSalary());

		employee=new Manager();
		employee.work();
		System.out.println("---");
//		因为有特有的需求,需要用子类进行实现
		Manager manager=new Manager("小黑","e123",10000,2000);
		System.out.println(manager.getBouns()+manager.getSalary()+manager.getEid()+manager.getName());
		manager.work();
	}
}

abstract class Employee {
	String name;
	String eid;
	int salary;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEid() {
		return eid;
	}

	public void setEid(String eid) {
		this.eid = eid;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Employee() {
	}

	public Employee(String name, String eid, int salary) {

		this.name = name;
		this.eid = eid;
		this.salary = salary;
	}

	public abstract void work();
}

class Program extends Employee {
	public Program() {
	}

	public Program(String name, String eid, int salary) {
		super(name, eid, salary);
	}

	@Override
	public void work() {
		System.out.println("程序员敲代码");
	}
}

class Manager extends Employee {
	int bouns;

	public Manager() {
	}

	public Manager(String name, String eid, int salary, int bouns) {
		super(name, eid, salary);
		this.bouns = bouns;
	}

	public int getBouns() {
		return bouns;
	}

	public void setBouns(int bouns) {
		this.bouns = bouns;
	}

	@Override
	public void work() {
		System.out.println("经理谈需求");
	}
}