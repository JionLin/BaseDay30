package mapDemo;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @Auther: Joinlin
 * @Descriptional: HashMap<String,Student>
 * 键：String	学号
 * 值：Student 学生对象
 * 用keySet和entrySet来获取
 * @Date: Create in 11:25 2018/6/15
 * @Modify By:
 */
public class MapDemo2 {
	public static void main(String[] args) {
		HashMap<String, Student> map = new HashMap<String, Student>();
		Student s1 = new Student("林志玲", 40);
		Student s2 = new Student("林志颖", 23);
		Student s3 = new Student("林正英", 66);
		Student s4 = new Student("林志玲", 40);
		map.put("1号", s1);
		map.put("2号", s2);
		map.put("3号", s3);
		map.put("4号", s4);
		Set<String> set = map.keySet();
		for (String key : set) {
			Student student = map.get(key);
			System.out.println(key + "---" + student.getAge() + "---" + student.getName());
		}
		System.out.println("-----------------------------");

		Set<Map.Entry<String, Student>> entrySet = map.entrySet();
		for (Map.Entry<String, Student> entry : entrySet) {
			String key = entry.getKey();
			Student student = map.get(key);
			System.out.println(key + "---" + student.getAge() + "---" + student.getName());
		}
	}
}
