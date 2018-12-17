package ArrayTest;

/**
 * @Auther: Joinlin
 * @Descriptional: 选择排序 从0索引和别的索引进行比较,求出最小值
 * @Date: Create in 8:44 2018/6/11
 * @Modify By:
 */
public class SelectSort {
	public static void main(String[] args) {
		int[]arr={23,32,45,42,1,111};
		System.out.println("排序前的数组");
		printArray(arr);
		System.out.println("排序后的数组");
		selectSort(arr);
		printArray(arr);

	}

	//进行选择排序
	private static void selectSort(int[] arr) {
		for (int x=0;x<arr.length-1;x++){
			for (int y=x+1;y<arr.length;y++){
				if (arr[y]<arr[x]){
					int temp=arr[x];
					arr[x]=arr[y];
					arr[y]=temp;
				}
			}
		}
	}

	//排序前的数组
	public static void printArray(int[] arr){
		System.out.print("[");
		for (int x=0;x<arr.length;x++){
			if (x==arr.length-1){
				System.out.println(arr[x]+"]");
			}else {
				System.out.print(arr[x]+", ");
			}
		}
	}
}
