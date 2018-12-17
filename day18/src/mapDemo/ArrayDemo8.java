package mapDemo;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/**
 * @Auther: Joinlin
 * @Descriptional: 为了更符合要求：
 * 这次的数据就看成是学生对象。 可以值相同就覆盖了
 * <p>
 * 传智播客
 * bj	北京校区
 * jc	基础班
 * 林青霞		27
 * 风清扬		30
 * jy	就业班
 * 赵雅芝		28
 * 武鑫		29
 * sh	上海校区
 * jc	基础班
 * 郭美美		20
 * 犀利哥		22
 * jy	就业班
 * 罗玉凤		21
 * 马征		23
 * gz	广州校区
 * jc	基础班
 * 王力宏		30
 * 李静磊		32
 * jy	就业班
 * 郎朗		31
 * 柳岩		33
 * xa	西安校区
 * jc	基础班
 * 范冰冰		27
 * 刘意		30
 * jy	就业班
 * 李冰冰		28
 * 张志豪		29
 * @Date: Create in 15:35 2018/6/15
 * @Modify By:
 */
public class ArrayDemo8 {
	public static void main(String[] args) {
		//进行遍历出每一个数
		HashMap<String, HashMap<String, ArrayList<Student>>> map = new HashMap<>();

		HashMap<String, ArrayList<Student>> map1 = new HashMap<>();
		ArrayList<Student> list = new ArrayList<>();
		Student s1 = new Student("郭美美", 26);
		Student s2 = new Student("马震", 49);
		list.add(s1);
		list.add(s2);
		map1.put("基础班", list);

		ArrayList<Student> list2 = new ArrayList<>();
		Student s3 = new Student("李冰冰", 26);
		Student s4 = new Student("范冰冰", 27);
		list2.add(s3);
		list2.add(s4);
		map1.put("就业班", list2);

		map.put("北京校区", map1);


		HashMap<String, ArrayList<Student>> map2 = new HashMap<>();
		ArrayList<Student> list5 = new ArrayList<>();
		Student s5 = new Student("波多野结衣", 48);
		Student s6 = new Student("林志玲", 28);
		list5.add(s5);
		list5.add(s6);
		map2.put("基础班", list5);

		ArrayList<Student> list6 = new ArrayList<>();
		Student s7 = new Student("林允儿", 18);
		Student s8 = new Student("迪内热巴", 28);
		list6.add(s7);
		list6.add(s8);
		map2.put("就业班", list6);

		map.put("深圳校区", map2);

		for (String s : map.keySet()) {
			System.out.println(s);
			HashMap<String, ArrayList<Student>> hashMap = map.get(s);
			for (String s9 : hashMap.keySet()) {
				System.out.println(s9);
				for (Student student : hashMap.get(s9)) {
					System.out.println(student.getAge() + "---" + student.getName());
				}

			}


		}


	}
}
