package collectionDemo;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @Auther: Joinlin
 * @Descriptional: 模拟斗地主洗牌和发牌
 * <p>
 * 分析：
 * A:创建一个牌盒
 * B:装牌
 * C:洗牌
 * D:发牌
 * E:看牌
 * @Date: Create in 15:36 2018/6/19
 * @Modify By:
 */
public class Porker {
	public static void main(String[] args) {
		//弄牌盒

		//洗牌
		//发牌
		//看牌
		ArrayList<String> list=new ArrayList<>();
		//装牌
		String[] colors={"♠","♥","♣","♦"};
		String[] numbers={"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
		for (String color:colors){
			for (String number:numbers){
				list.add(color.concat(number));
			}
		}
		list.add("大王");
		list.add("小王");
		//洗牌
		Collections.shuffle(list);
		//创造人头
		ArrayList<String> jiaoLin=new ArrayList<>();
		ArrayList<String> linYunEr=new ArrayList<>();
		ArrayList<String> linYun=new ArrayList<>();
		ArrayList<String> diPai=new ArrayList<>();

		//发牌
		for (int i = 0; i < list.size(); i++) {
			if (i>=list.size()-3){
				diPai.add(list.get(i));
			}else if(i%3==0){
				jiaoLin.add(list.get(i));
			}else if(i%3==1){
				linYunEr.add(list.get(i));
			}else if (i%3==2){
				linYun.add(list.get(i));
			}
		}

		//看牌
		lookPorker("焦林",jiaoLin);
		lookPorker("林允",linYun);
		lookPorker("林允儿",linYunEr);
		lookPorker("底牌",diPai);
	}

	public static void lookPorker(String name, ArrayList<String> list) {
		System.out.print(name+"的牌是 ");
		for (String s : list) {
			System.out.print(s+" , ");
		}
		System.out.println();
	}
}
