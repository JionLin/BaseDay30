package ArrayTest;

/**
 * @Auther: Joinlin
 * @Descriptional: 冒泡排序 两两进行比较,求出最大值
 * @Date: Create in 8:44 2018/6/11
 * @Modify By:
 */
public class BubbleSort {
	public static void main(String[] args) {
		int[]arr={23,32,45,42,1,111};
		System.out.println("排序前:");
		printArray(arr);

		System.out.println("排序后:");
		bubbleSort(arr);
		printArray(arr);
	}
	//排序前遍历的数组
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
	//冒泡排序后的数组
	public static void bubbleSort(int[] arr){
		for (int x=0;x<arr.length-1;x++){
			for (int y=0;y<arr.length-1-x;y++){
				if (arr[y]>arr[y+1]){
					int temp=arr[y];
					arr[y]=arr[y+1];
					arr[y+1]=arr[y];
				}
			}
		}
	}


}

