/**
 * @Auther: Joinlin
 * @Descriptional:
 * @Date: Create in 15:33 2018/6/7
 * @Modify By:
 */
public class StudentDemo3 {
	public static void main(String[] args) throws CloneNotSupportedException{
		Student s1=new Student();
		s1.setAge(18);
		s1.setName("林志玲");

		//克隆学生对象
		Object object=s1.clone();
		Student s2= (Student) object;
		System.out.println("---");
		System.out.println(s1.getAge()+";"+s1.getName());
		System.out.println(s2.getAge()+";"+s2.getName());

		System.out.println("---");
		Student s3 = s1;
		System.out.println(s3.getName()+"---"+s3.getAge());
		System.out.println("---------");

		s3.setName("刘意");
		s3.setAge(30);
		System.out.println(s1.getName()+"---"+s1.getAge());
		System.out.println(s2.getName()+"---"+s2.getAge());
		System.out.println(s3.getName()+"---"+s3.getAge());
	}
}
