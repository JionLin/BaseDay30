/**
 * @Auther: Joinlin
 * @Descriptional: 数组元素查找(查找指定元素第一次在数组中出现的索引)
 * @Date: Create in 15:35 2018/6/5
 * @Modify By:
 */
public class ArrayTest3 {
	public static void main(String[] args) {
		int []arrs={1,23,3434,54};
		int index = getIndex2(arrs, 23);
		System.out.println(index);
	}

	public static int getIndex(int[]arrs,int value){
		for (int x=0;x<arrs.length;x++){
			if (arrs[x]==value){
				return x;
			}
		}
		return -1;
	}

	public static int getIndex2(int[]arrs,int value){
		int index=-1;
		for (int x=0;x<arrs.length;x++){
			if (arrs[x]==value){
				index=x;
			}
		}
		return index;
	}
}
