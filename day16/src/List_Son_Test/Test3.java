package List_Son_Test;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import generic.Inter;
import org.omg.PortableServer.LIFESPAN_POLICY_ID;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @Auther: Joinlin
 * @Descriptional: 键盘录入多个数据，以0结束，要求在控制台输出这多个数据中的最大值
 * 分析：
 * A:创建键盘录入数据对象
 * B:键盘录入多个数据,我们不知道多少个，所以用集合存储
 * C:以0结束,这个简单，只要键盘录入的数据是0，我就不继续录入数据了
 * D:把集合转成数组
 * E:对数组排序
 * F:获取该数组中的最大索引的值
 * @Date: Create in 10:38 2018/6/14
 * @Modify By:
 */
public class Test3 {
	public static void main(String[] args) {
		// 键盘录入多个数据，以0结束，要求在控制台输出这多个数据中的最大值

		//进行键盘录入
		Scanner scanner = new Scanner(System.in);
		//用集合来进行存储
		ArrayList<Integer> list = new ArrayList<Integer>();

		while (true) {
			System.out.println("请输入你需要的数字: ");
			int number = scanner.nextInt();
			if (number != 0) {
				list.add(number);
			} else {
				break;
			}
		}
		//拿到集合了,就需要转换成数组进行排序
		Integer[] arr = new Integer[list.size()];
		//把list转换为数组
		list.toArray(arr);
		Arrays.sort(arr);
		System.out.println("数组为:" + arrayToString(arr) + "最大的数为: " + arr[arr.length - 1]);

	}

	public static String arrayToString(Integer[] arr) {
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for (int x = 0; x < arr.length; x++) {
			if (x == arr.length - 1) {
				sb.append(arr[x]).append("]");
			} else {
				sb.append(arr[x]).append(", ");
			}
		}
		return sb.toString();
	}
}
