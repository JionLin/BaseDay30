package regexTest;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Auther: Joinlin
 * @Descriptional: 获取功能：
 * 获取下面这个字符串中由三个字符组成的单词
 * da jia ting wo shuo,jin tian yao xia yu,bu shang wan zi xi,gao xing bu?
 * @Date: Create in 10:21 2018/6/12
 * @Modify By:
 */
public class Test9 {
	public static void main(String[] args) {

		String s="da jia ting wo shuo,jin tian yao xia yu,bu shang wan zi xi,gao xing bu";

		String regex="\\b\\w{3}\\b";
		//根据规则对象得到匹配器对象
		//根据模式对象得到匹配对象
		Matcher matcher = Pattern.compile(regex).matcher(s);
		while (matcher.find()){
			System.out.println(matcher.group());
		}
	}
}
