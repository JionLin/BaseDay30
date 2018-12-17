package ArrayTest;

/**
 * @Auther: Joinlin
 * @Descriptional: 二分查找(折半查找)法 对于有序的来说,进行二分查找
 * 无序的话,进行基本查找
 * 1	给定一个数组,进行查询中间的索引,如果目标值大于数组对应值,那就从右边开始查找
 * 2	反之从左边开始查找
 * @Date: Create in 10:40 2018/6/11
 * @Modify By:
 */
public class ArrayTest4 {
	public static void main(String[] args) {
		int[] arrs = {11, 22, 33, 44, 55, 66, 77};
		int index = getIndex(arrs, 333);
		int index2 = findIndex(arrs, 77);
		System.out.println(index);
		System.out.println(index2);

	}

	//基本查找
	public static int findIndex(int[] arrs, int values) {
		int index = -1;
/*
		for (int x = 0; x < arrs.length; x++) {
			if (arrs[x] == values) {
				index = x;
				break;
			}
		}
*/
		for (int i = 0; i < arrs.length; i++) {
			int arr = arrs[i];
			
		}
		return index;
	}

	//二分查找
	public static int getIndex(int[] arrs, int value) {
		//定义最大长度和最小长度和中间索引
		int maxIndex = arrs.length - 1;
		int minIndex = 0;

		int mid = (maxIndex + minIndex) / 2;

		while (arrs[mid] != value) {
			if (arrs[mid] > value) {//左边找
				maxIndex = mid - 1;
			} else if (arrs[mid] < value) {//左边找
				minIndex = mid + 1;
			}
			if (minIndex > maxIndex) {
				return -1;
			}
			mid = (maxIndex + minIndex) / 2;
		}
		return mid;
	}

}
