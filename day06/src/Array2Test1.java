import javax.sound.midi.Soundbank;

/**
 * @Auther: Joinlin
 * @Descriptional: 公司年销售额求和
 * 某公司按照季度和月份统计的数据如下：单位(万元)
 * 第一季度：22,66,44
 * 第二季度：77,33,88
 * 第三季度：25,45,65
 * 第四季度：11,66,99
 * @Date: Create in 16:07 2018/6/5
 * @Modify By:
 */
public class Array2Test1 {
	public static void main(String[] args) {
		int[][] arrs={{22,66,44},{77,33,88},{25,45,65},{11,66,99}};
		int result = println(arrs);
		System.out.println(result);
	}
	public static int println(int[][] arrs){
		int count=0;
		//最外层2维数组
		for (int x=0;x<arrs.length;x++){
			for (int y=0;y<arrs[x].length;y++){
				count+=arrs[x][y];
			}
		}
		return count;
	}
}
