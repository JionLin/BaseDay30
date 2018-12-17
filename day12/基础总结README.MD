#### day01

```
键盘功能键的认识和快捷键(掌握)
	(1)功能键的认识
		tab
		shift
		ctrl
		alt
		windos
		空格
		上下左右
		回车
		截图
	(2)快捷键
		全选	Ctrl+A
		复制	Ctrl+C
		粘贴	Ctrl+V
		剪切	Ctrl+X
		撤销	Ctrl+Z
		保存	Ctrl+S

3:常见的DOS命令(掌握)
	(1)常见的如下
		盘符的切换
			d:回车
		目录的进入
			cd javase
			cd javase\day01\code
		目录的回退
			cd..
			cd\
		清屏
			cls
		退出
			exit
5:JDK,JRE,JVM的作用及关系(掌握)
	(1)作用
		JVM：保证Java语言跨平台
		JRE：Java程序的运行环境
		JDK：Java程序的开发环境
	(2)关系
		JDK：JRE+工具
		JRE：JVM+类库
		
9:path环境变量(掌握)
	(1)path环境变量的作用
		保证javac命令可以在任意目录下运行。
		同理可以配置qq等
	(2)path配置的两种方案：
		A:方案1(了解)
		B:方案2
			找到环境变量的位置，在系统变量里面
			新建：
				变量名：JAVA_HOME
				变量值：D:\develop\Java\jdk1.7.0_60
			修改：
				变量名：Path
				变量值：%JAVA_HOME%\bin;以前的内容
```

#### day02

```
1:关键字(掌握)
	(1)被Java语言赋予特定含义的单词
	(2)特点：
		全部小写。
	(3)注意事项：
		A:goto和const作为保留字存在。
		B:类似于Notepad++这样的高级记事本会对关键字有特殊颜色标记

2:标识符(掌握)
	(1)就是给类，接口，方法，变量等起名字的字符序列
	(2)组成规则：
		A:英文大小写字母
		B:数字
		C:$和_
	(3)注意事项：
		A:不能以数字开头
		B:不能是java中的关键字
		C:区分大小写
	(4)常见的命名规则(见名知意)
		A:包	全部小写
			单级包：小写
				举例：liuyi,com
			多级包：小写，并用.隔开
				举例：cn.itcast,com.baidu				
		B:类或者接口
			一个单词：首字母大写
				举例：Student,Demo
			多个单词：每个单词首字母大写
				举例：HelloWorld,StudentName
		C:方法或者变量
			一个单词：首字母小写
				举例：name,main
			多个单词：从第二个单词开始，每个单词首字母大写
				举例：studentAge,showAllNames()
		D:常量
			全部大写
			一个单词：大写
				举例：PI
			多个单词：大写，并用_隔开
				举例：STUDENT_MAX_AGE

3:注释(掌握)
	(1)就是对程序进行解释说明的文字
	(2)分类：
		A:单行注释	//
		B:多行注释	/**/
		C:文档注释(后面讲) /** */
	(3)把HelloWorld案例写了一个带注释的版本。
		后面我们要写一个程序的过程。
		需求：
		分析：
		实现：
		代码体现：
	(4)注释的作用
		A:解释说明程序，提高了代码的阅读性。
		B:可以帮助我们调试程序。
			后面我们会讲解一个更高端的一个调试工具

4:常量(掌握)
	(1)在程序执行的过程中，其值不发生改变的量
	(2)分类：
		A:字面值常量
		B:自定义常量(后面讲)
	(3)字面值常量
		A:字符串常量 "hello"
		B:整数常量	12,23
		C:小数常量	12.345
		D:字符常量	'a','A','0'
		E:布尔常量	true,false
		F:空常量	null(后面讲)
	(4)在Java中针对整数常量提供了四种表现形式
		A:二进制	由0，1组成。以0b开头。
		B:八进制	由0，1，...7组成。以0开头。
		C:十进制	由0，1，...9组成。整数默认是十进制。
		D:十六进制	由0，1，...9,a,b,c,d,e,f(大小写均可)组成。以0x开头。

5:进制转换(了解)
	(1)其他进制到十进制
		系数：就是每一个位上的数值
		基数：x进制的基数就是x
		权：对每一个位上的数据，从右，并且从0开始编号，对应的编号就是该数据的权。
		
		结果：系数*基数^权次幂之和。
	(2)十进制到其他进制
		除基取余，直到商为0，余数反转。
	(3)进制转换的快速转换法
		A:十进制和二进制间的转换
			8421码。
		B:二进制到八进制，十六进制的转换

6:变量(掌握)
	(1)在程序的执行过程中，其值在某个范围内可以发生改变的量
	(2)变量的定义格式：
		A:数据类型 变量名 = 初始化值;
		B:数据类型 变量名;
		  变量名 = 初始化值;

7:数据类型(掌握)
	(1)Java是一种强类型语言，针对每种数据都提供了对应的数据类型。
	(2)分类：
		A:基本数据类型：4类8种
		B:引用数据类型：类，接口，数组。
	(3)基本数据类型
		A:整数			占用字节数
			byte			1
			short			2
			int 			4
			long			8
		B:浮点数
			float			4
			double			8
		C:字符
			char			2
		D:布尔
			boolean			1
			
		注意：
			整数默认是int类型，浮点数默认是double。
			
			长整数要加L或者l。
			单精度的浮点数要加F或者f。

8:数据类型转换(掌握)
	(1)boolean类型不参与转换
	(2)默认转换
		A:从小到大
		B:byte,short,char -- int -- long -- float -- double
		C:byte,short,char之间不相互转换，直接转成int类型参与运算。
	(3)强制转换
		A:从大到小
		B:可能会有精度的损失，一般不建议这样使用。
		C:格式：
			目标数据类型 变量名 = (目标数据类型) (被转换的数据);
	(4)思考题和面试题：
		A:下面两种方式有区别吗?
			float f1 = 12.345f;
			float f2 = (float)12.345;
		B:下面的程序有问题吗，如果有，在哪里呢?
			byte b1 = 3;
			byte b2 = 4;
			byte b3 = b1 + b2;
			byte b4 = 3 + 4;
		C:下面的操作结果是什么呢?
			byte b = (byte)130;
		D:字符参与运算
			是查找ASCII里面的值
			'a'		97
			'A'		65
			'0'		48
			
			System.out.println('a');
			System.out.println('a' + 1);
		E:字符串参与运算
			这里其实是字符串的连接
			
			System.out.println("hello"+'a'+1);
			System.out.println('a'+1+"hello");
			System.out.println("5+5="+5+5);
			System.out.println(5+5+"=5+5");
```

#### day03

```
1:运算符(掌握)
	(1)算术运算符
		A:+,-,*,/,%,++,--
		B:+的用法
			a:加法
			b:正号
			c:字符串连接符
		C:/和%的区别
			数据做除法操作的时候，/取得是商，%取得是余数
		D:++和--的用法
			a:他们的作用是自增或者自减
			b:使用
				**单独使用
					放在操作数据的前面和后面效果一样。
					a++或者++a效果一样。
				**参与操作使用
					放在操作数的前面：先自增或者自减，再参与操作
						int a = 10;
						int b = ++a;
					放在操作数的后面：先参与操作，再自增或者自减
						int a = 10;
						int b = a++;
	(2)赋值运算符
		A:=,+=,-=,*=,/=,%=等
		B:=叫做赋值运算符，也是最基本的赋值运算符
			int x = 10; 把10赋值给int类型的变量x。
		C:扩展的赋值运算符的特点
			隐含了自动强制转换。
			
			面试题：
				short s = 1;
				s = s + 1;
				
				short s = 1;
				s += 1;
				请问上面的代码哪个有问题?
	(3)比较运算符
		A:==,!=,>,>=,<,<=
		B:无论运算符两端简单还是复杂最终结果是boolean类型。
		C:千万不要把==写成了=
	(4)逻辑运算符
		A:&,|,^,!,&&,||
		B:逻辑运算符用于连接boolean类型的式子
		C:结论
			&:有false则false
			|:有true则true
			^:相同则false，不同则true。
				情侣关系。
			!:非true则false，非false则true
			
			&&:结果和&是一样的，只不过有短路效果。左边是false，右边不执行。
			||:结果和|是一样的，只不过有短路效果。左边是true，右边不执行。
	(5)位运算符(了解)
		A:^的特殊用法
			一个数据针对另一个数据位异或两次，该数不变
		B:面试题
			a:请实现两个变量的交换
				**采用第三方变量
				**用位异或运算符
					左边a,b,a
					右边a^b
			b:请用最有效率的方式计算出2乘以8的结果
				2<<3
	(6)三元运算符
		A:格式
			比较表达式?表达式1:表达式2;
		B:执行流程：
			首先计算比较表达式的值，看是true还是false。
			如果是true，表达式1就是结果。
			如果是false，表达式2就是结果。
		C:案例：
			a:比较两个数据是否相等
			b:获取两个数据中的最大值
			c:获取三个数据中的最大值
			
2:键盘录入(掌握)
	(1)实际开发中，数据是变化的，为了提高程序的灵活性，我们加入键盘录入数据。
	(2)如何实现呢?目前就记住
		A:导包
			import java.util.Scanner;
			位置：在class的上边
		B:创建对象
			Scanner sc = new Scanner(System.in);
		C:获取数据
			int x = sc.nextInt();
	(3)把三元运算符的案例加入键盘录入改进。

3:流程控制语句
	(1)顺序结构 从上往下，依次执行
	(2)选择结构	按照不同的选择，执行不同的代码
	(3)循环结构 做一些重复的代码

4:if语句(掌握)
	(1)三种格式
		A:格式1
			if(比较表达式) {
				语句体;
			}
			
			执行流程：
				判断比较表达式的值，看是true还是false
				如果是true，就执行语句体
				如果是false，就不执行语句体
		
		B:格式2
			if(比较表达式) {
				语句体1;
			}else {
				语句体2;
			}
			
			执行流程：
				判断比较表达式的值，看是true还是false
				如果是true，就执行语句体1
				如果是false，就执行语句体2
				
		C:格式3
			if(比较表达式1) {
				语句体1;
			}else if(比较表达式2){
				语句体2;
			}
			...
			else {
				语句体n+1;
			}
			
			执行流程：
				判断比较表达式1的值，看是true还是false
				如果是true，就执行语句体1
				如果是false，就继续判断比较表达式2的值，看是true还是false
				如果是true，就执行语句体2
				如果是false，就继续判断比较表达式3的值，看是true还是false
				...
				如果都不满足，就执行语句体n+1
	(2)注意事项
		A:比较表达式无论简单还是复杂，结果是boolean类型
		B:if语句控制的语句体如果是一条语句，是可以省略大括号的；如果是多条，不能省略。
			建议：永远不要省略。
		C:一般来说，有左大括号，就没有分号，有分号，就没有左大括号。
		D:else后面如果没有if，是不会出现比较表达式的。
		E:三种if语句其实都是一个语句，只要有一个执行，其他的就不再执行。
	(3)案例：
		A:比较两个数是否相等
		B:获取两个数中的最大值
		C:获取三个数中的最大值(if语句的嵌套)
		D:根据成绩输出对应的等级
		E:根据月份，输出对应的季节
		F:根据x计算对应y的值并输出
	(4)三元运算符和if语句第二种格式的关系
		所有的三元运算符能够实现的，if语句的第二种格式都能实现。
		反之不成立。
		
		如果if语句第二种格式控制的语句体是输出语句，就不可以。
		因为三元运算符是一个运算符，必须要有一个结果返回，不能是一个输出语句。
```

#### day04

```
1:switch语句(掌握)
	(1)格式：
		switch(表达式) {
			case 值1:
				语句体1;
				break;
			case 值2:
				语句体2;
				break;
			...
			default:S
				语句体n+1;
				break;
		}
		
		格式解释说明：
			switch:说明这是switch语句。
			表达式:可以是byte,short,int,char
				JDK5以后可以是枚举
				JDK7以后可以是字符串
			case:后面的值就是要和表达式进行比较的值
			break:表示程序到这里中断，跳出switch语句
			default:如果所有的情况都不匹配,就执行这里,相当于if语句中的else
	(2)面试题
		switch语句的表达式可以是byte吗?可以是long吗?可以是String吗?
			可以,不可以,JDK7以后可以
	(3)执行流程:
		A:首先计算表达式的值
		B:和每一个case进行匹配，如果有就执行对应的语句体，看到break就结束。
		C:如果没有匹配，就执行default的语句体n+1。
	(4)注意事项:
		A:case后面只能是常量，不能是变量，而且，多个case后面的值不能出现相同的
		B:default可以省略吗?
			可以省略，但是不建议，因为它的作用是对不正确的情况给出提示。
			特殊情况：
				case就可以把值固定。
				A,B,C,D
		C:break可以省略吗?
			可以省略，但是结果可能不是我们想要的。
			会出现一个现象：case穿透。
			最终我们建议不要省略
		D:default一定要在最后吗?
			不是，可以在任意位置。但是建议在最后。
		E:switch语句的结束条件
			a:遇到break就结束了
			b:执行到末尾就结束了
	(5)案例：
		A:键盘录入一个数字(1-7),输出对应的星期几。
		B:单项选择题
		C:键盘录入一个字符串的问题
			String s = sc.nextLine();
		D:根据给定的月份,输出对应的季节
	(6)if语句和switch语句各自的场景
		A:if
			针对boolean类型的判断
			针对一个范围的判断
			针对几个常量的判断
		B:switch
			针对几个常量的判断

2:循环语句(掌握)
	(1)有三种:for,while,do...while
	(2)for循环语句
		A:格式
			for(初始化语句;判断条件语句;控制条件语句){
				循环体语句;
			}
			
			执行流程：
				a:执行初始化语句
				b:执行判断条件语句
					如果这里是true，就继续
					如果这里是false，循环就结束
				c:执行循环体语句
				d:执行控制条件语句
				e:回到b
		B:注意事项
			a:判断条件语句无论简单还是复杂，结果是boolean类型
			b:循环体语句如果是一条，可以省略大括号，但是不建议
			c:有分号就没有左大括号，有左大括号就没有分号
		C:案例
			a:输出10次HelloWorld
			b:输出1-10的数据
			c:输出10-1的数据
			d:求1-10的和
			e:求1-100的和,求1-100的偶数和,求1-100的奇数和
			f:求5的阶乘
			g:在控制台打印水仙花数
			h:统计水仙花个数
			i:改进版的回文数
				一个五位数
				个位 = 万位
				十位 = 千位
				个位 + 十位 + 千位 + 万位 = 百位
			j:统计1-1000之间同时满足如下条件的数据有多少个
				x%3==2
				x%5==3
				x%7==2
	(3)while循环
		A:基本格式
			while(判断条件语句) {
				循环体语句;
			}
			
			扩展格式：
			初始化语句;
			while(判断条件语句){
				循环体语句;
				控制条件语句;
			}
			
			通过查看这个格式，我们就知道while循环可以和for循环等价转换。
		B:while的练习
			把for语句的练习用while改进
		C:for和while的区别
			a:使用上的区别
				for语句的那个控制条件变量,在循环结束后不能在使用了。
				而while的可以继续使用。
			b:理解上的区别
				for适合于一个范围的判断
				while适合次数不明确的
					举例:吃葡萄
		D:案例：
			a:珠穆朗玛峰问题
			b:小芳存钱问题(break以后才能做)
	(4)do...while循环
		A:基本格式
			do {
				循环体语句;
			}while(判断条件语句);
			
			扩展格式：
			初始化语句;
			do {
				循环体语句;
				控制条件语句;
			}while(判断条件语句);
			
			通过查看格式，我们就可以看出其实三种循环的格式可以是统一的。
		B:三种循环的区别
			a:do...while循环至少执行一次循环体
			b:for和while必须先判断条件是否是true，然后后才能决定是否执行循环体
	(5)循环使用的注意事项(死循环)
		A:一定要注意修改控制条件,否则容易出现死循环。
		B:最简单的死循环格式
			a:while(true){...}
			
			b:for(;;){}
			
3:控制跳转语句(掌握)
	(1)break:中断的意思
		A:用在循环和switch语句中，离开此应用场景无意义。
		B:作用
			a:跳出单层循环
			b:跳出多层循环，需要标签语句的配合
	(2)continue:继续
		A:用在循环中，离开此应用场景无意义。
		B:作用
			a:跳出单层循环的一次，可以继续下一次
		C:填空题
			for(int x=1; x<=10; x++) {
				if(x%3 == 0) {
					//补齐代码
				}
				System.out.println("Java基础班");
			}
			如何让控制台输出2次：Java基础班
			如何让控制台输出7次：Java基础班
			如何让控制台输出13次：Java基础班
	(3)return:返回
		A:用于结束方法的，后面还会在继续讲解和使用。
		B:一旦遇到return,程序就不会在继续往后执行。
		
```

#### day05

```
1:方法(掌握)
	(1)方法：就是完成特定功能的代码块。
		注意：在很多语言里面有函数的定义，而在Java中，函数被称为方法。
	(2)格式：
		修饰符 返回值类型 方法名(参数类型 参数名1,参数类型 参数名2...) {
			方法体语句;
			return 返回值;
		}

		修饰符：目前就用 public static。后面再详细讲解其他修饰符
		返回值类型：就是功能结果的数据类型
		方法名：就是起了一个名字，方便我们调用该方法。
		参数类型：就是参数的数据类型
		参数名：就是变量
		参数分类：
			实参：实际参与运算的数据
			形参：方法上定义的，用于接收实际参数的变量
		方法体语句：就是完成功能的代码块
		return：结束方法
		返回值：就是功能的结果，由return带给调用者。
	(3)两个明确：
		返回值类型：结果的数据类型
		参数列表：参数的个数及对应的数据类型
	(4)方法调用
		A:有明确返回值的方法
			a:单独调用，没有意义
			b:输出调用，不是很好，因为我可能需要不结果进行进一步的操作。但是讲课一般我就用了。
			c:赋值调用，推荐方案
		B:void类型修饰的方法
			a:单独调用
	(5)案例：
		A:求和方案
		B:获取两个数中的较大值
		C:比较两个数据是否相同
		D:获取三个数中的最大值
		E:输出m行n列的星形
		F:输出nn乘法表
	(6)方法的注意事项
		A:方法不调用不执行
		B:方法之间是平级关系，不能嵌套定义
		C:方法定义的时候，参数是用，隔开的
		D:方法在调用的时候，不用在传递数据类型
		E:如果方法有明确的返回值类型，就必须有return语句返回。
	(7)方法重载
		在同一个类中，方法名相同，参数列表不同。与返回值无关。
		
		参数列表不同：
			参数的个数不同。
			参数的对应的数据类型不同。
	(8)方法重载案例
		不同的类型的多个同名方法的比较。
		
2:数组(掌握)
	(1)数组：存储同一种数据类型的多个元素的容器。
	(2)特点：每一个元素都有编号，从0开始，最大编号是长度-1。
	         编号的专业叫法：索引
	(3)定义格式
		A:数据类型[] 数组名;
		B:数据类型 数组名[];
		
		推荐是用A方式，B方法就忘了吧。
		但是要能看懂
	(4)数组的初始化
		A:动态初始化
			只给长度，系统给出默认值
			
			举例：int[] arr = new int[3];
		B:静态初始化
			给出值，系统决定长度
			
			举例：int[] arr = new int[]{1,2,3};
			简化版：int[] arr = {1,2,3};
	(5)Java的内存分配
		A:栈 存储局部变量
		B:堆 存储所有new出来的
		C:方法区(面向对象部分详细讲解)
		D:本地方法区(系统相关)
		E:寄存器(CPU使用)
		
		注意：
			a:局部变量 在方法定义中或者方法声明上定义的变量。
			b:栈内存和堆内存的区别
				栈：数据使用完毕，就消失。
				堆：每一个new出来的东西都有地址
				    每一个变量都有默认值
						byte,short,int,long 0
						float,double 0.0
						char '\u0000'
						boolean false
						引用类型 null
				    数据使用完毕后，在垃圾回收器空闲的时候回收。
	(6)数组内存图
		A:一个数组
		B:二个数组
		C:三个数组(两个栈变量指向同一个堆内存)
	(7)数组的常见操作
		A:遍历
			方式1：
				public static void printArray(int[] arr) {
					for(int x=0; x<arr.length; x++) {
						System.out.println(arr[x]);
					}
				}
				
			方式2：
				public static void printArray(int[] arr) {
					System.out.print("[");
					for(int x=0; x<arr.length; x++) {
						if(x == arr.length-1) {
							System.out.println(arr[x]+"]");
						}else {
							System.out.println(arr[x]+", ");
						}
					}
				}
		B:最值
			最大值：
				public static int getMax(int[] arr) {
					int max = arr[0];
					
					for(int x=1; x<arr.length; x++) {
						if(arr[x] > max) {
							max = arr[x];
						}
					}
					
					return max;
				}
				
			最小值：
				public static int getMin(int[] arr) {
					int min = arr[0];
					
					for(int x=1; x<arr.length; x++) {
						if(arr[x] < min) {
							min = arr[x];
						}
					}
					
					return min;
				}
		C:逆序
			方式1：
				public static void reverse(int[] arr) {
					for(int x=0; x<arr.length/2; x++) {
						int temp = arr[x];
						arr[x] = arr[arr.length-1-x];
						arr[arr.length-1-x] = temp;
					}
				}
				
			方式2：
				public static void reverse(int[] arr) {
					for(int start=0,end=arr.length-1; start<=end; start++,end--) {
						int temp = arr[start];
						arr[start] = arr[end];
						arr[end] = temp;
					}
				}
		D:查表
				public static String getString(String[] strArray,int index) {
					return strArray[index];
				}
		E:基本查找
			方式1：
				public static int getIndex(int[] arr,int value) {
					for(int x=0; x<arr.length; x++) {
						if(arr[x] == value) {
							return x;
						}
					}
					
					return -1;
				}
				
			方式2：
				public static int getIndex(int[] arr,int value) {
					int index = -1;
				
					for(int x=0; x<arr.length; x++) {
						if(arr[x] == value) {
							index = x;
							break;
						}
					}
					
					return index;
				}
```

#### day06

```
1:二维数组(理解)
	(1)元素是一维数组的数组。
	(2)格式：
		A:数据类型[][] 数组名 = new 数据类型[m][n];
		B:数据类型[][] 数组名 = new 数据类型[m][];
		C:数据类型[][] 数组名 = new 数据类型[][]{{...},{...},{...}};
		D:数据类型[][] 数组名 = {{...},{...},{...}};
	(3)案例(掌握):
		A:二维数组的遍历
		B:二维数组的求和
		C:杨辉三角形

2:两个思考题(理解)
	(1)Java中的参数传递问题
		Java中只有值传递。
		
		基本类型：形式参数的改变不影响实际参数
		引用类型：形式参数的改变直接影响实际参数
	(2)数据加密问题
		综合的小案例。
	
3:面向对象(掌握)
	(1)面向对象
		面向对象是基于面向过程的编程思想
	(2)面向对象的思想特点
		A:是一种更符合我们思考习惯的思想
		B:把复杂的事情简单化
		C:让我们从执行者变成了指挥者
		
		举例：
			买电脑
			洗衣服
			做饭
			...
			万事万物皆对象
	(3)把大象装进冰箱(理解)
		A:面向过程实现
		B:面向对象实现
		
		注意：如何让我们的操作更符合面向对象思想呢?
		A:有哪些类
		B:每个类有哪些成员
		C:类与类的关系
	(4)类与对象
		A:现实世界的事物
			属性	事物的基本描述
			行为	事物的功能
		B:Java语言中最基本的单位是类。所以，我们要用类来体现事物
		C:类
			成员变量	事物属性
			成员方法	事物行为
		D:类：是一组相关的属性和行为的集合。是一个抽象的概念。
		  对象：是该类事物的具体存在，是一个具体的实例。(对象)
		  
		  举例：
			学生：类
			班长：对象
	(5)类的定义及使用
		A:类的定义
			成员变量	定义格式和以前一样，就是位置不同，在类中，方法外。
			成员方法	定义格式和以前一样，就是去掉了static。
		B:使用类的内容
			a:创建对象? 格式
				类名 对象名 =  new 类名();
			b:如何使用成员变量和成员方法呢
				对象名.成员变量
				对象名.成员方法()
	(6)案例：
		A:学生类的定义和使用
		B:手机类的定义和使用
	(7)内存图
		A:一个对象的内存图
		B:二个对象的内存图
		C:三个对象的内存图
	(8)Java程序的开发，设计和特征
		A:开发：就是不断的创建对象，通过对象调用功能
		B:设计：就是管理和维护对象间的关系
		C:特征
			a:封装
			b:继承
			c:多态
```

#### day07

```
1:成员变量和局部变量的区别(理解)
	(1)在类中的位置不同
		成员变量：类中方法外
		局部变量：方法定义中或者方法声明上
	(2)在内存中的位置不同
		成员变量：在堆中
		局部变量：在栈中
	(3)生命周期不同
		成员变量：随着对象的创建而存在，随着对象的消失而消失
		局部变量：随着方法的调用而存在，随着方法的调用完毕而消失
	(4)初始化值不同
		成员变量：有默认值
		局部变量：没有默认值，必须定义，赋值，然后才能使用
		
2:类作为形式参数的问题?(理解)
	(1)如果你看到一个方法需要的参数是一个类名，就应该知道这里实际需要的是一个具体的对象。

3:匿名对象(理解)
	(1)没有名字的对象
	(2)应用场景
		A:调用方法，仅仅只调用一次的时候。
		b:可以作为实际参数传递。
		
4:封装(理解)
	(1)隐藏实现细节，提供公共的访问方式
	(2)好处：
		A:隐藏实现细节，提供公共的访问方式
		B:提高代码的复用性
		C:提高代码的安全性
	(3)设计原则
		把不想让外界知道的实现细节给隐藏起来，提供公共的访问方式
	(4)private是封装的一种体现。
		封装：类，方法，private修饰成员变量

5:private关键字(掌握)
	(1)私有的意义，可以修饰成员变量和成员方法
	(2)特点：
		被private修饰的后的成员只能在本类中被访问
	(3)private的应用：
		以后再写一个类的时候：
			把所有的成员变量给private了
			提供对应的getXxx()/setXxx()方法

6:this关键字(掌握)
	(1)代表当前类的引用对象
		记住：哪个对象调用方法，该方法内部的this就代表那个对象
	(2)this的应用场景：
		A:解决了局部变量隐藏成员变量的问题
		B:其实this还有其他的应用，明天讲解。

7:构造方法(掌握)
	(1)作用：用于对对象的数据进行初始化
	(2)格式：
		A:方法名和类名相同
		B:没有返回值类型，连void都不能有
		C:没有返回值
		
		思考题：构造方法中可不可以有return语句呢?
		可以。而是我们写成这个样子就OK了：return;
		其实，在任何的void类型的方法的最后你都可以写上：return;
	(3)构造方法的注意事项
		A:如果我们没写构造方法，系统将提供一个默认的无参构造方法
		B:如果我们给出了构造方法，系统将不再提供默认构造方法
			如果这个时候，我们要使用无参构造方法，就必须自己给出。
			推荐：永远手动自己给出无参构造方法。
	(4)给成员变量赋值的方式
		A:setXxx()
		B:带参构造方法
	(5)标准案例
		class Student {
			private String name;
			private int age;
			
			public Student(){}
			
			public Student(String name,int age) {
				this.name = name;
				this.age = age;
			}
			
			public String getName() {
				return name;
			}
			
			public void setName(String name) {
				this.name = name;
			}
			
			public int getAge() {
				return age;
			}
			
			public void setAge(int age) {
				this.age = age;
			}
		}
		
		测试：
		class StudentDemo {
			public static void main(String[] args) {
				//方式1
				Student s1 = new Student();
				s1.setName("林青霞");
				s1.setAge(27);
				System.out.println(s1.getName()+"---"+s1.getAge());
				
				//方式2
				Student s2 = new Student("刘意",30);
				System.out.println(s2.getName()+"---"+s2.getAge());
			}
		}
		

8:代码：Student s = new Student();做了哪些事情?(理解)
	(1)把Student.class文件加载到内存
	(2)在栈内存为s开辟空间
	(3)在堆内存为学生对象申请空间
	(4)给学生的成员变量进行默认初始化。null,0
	(5)给学生的成员变量进行显示初始化。林青霞,27
	(6)通过构造方法给成员变量进行初始化。刘意,30
	(7)对象构造完毕，把地址赋值给s变量
		
9:面向对象的练习题(掌握)
	(1)标准的手机类的定义和测试
	(2)Demo类有求和方法，Test类进行测试。
		什么时候定义成员变量?
		当该变量是用来描述一个类的时候。
	(3)长方形案例
	(4)员工案例
	(5)MyMath案例(自己提供加减乘除并测试)
	
10:static关键字(理解)
	(1)静态的意思。可以修饰成员变量和成员方法。
	(2)静态的特点：
		A:随着类的加载而加载
		B:优先与对象存在
		C:被类的所有对象共享
			这其实也是我们判断该不该使用静态的依据。
			举例：饮水机和水杯的问题思考
		D:可以通过类名调用
			既可以通过对象名调用，也可以通过类名调用，建议通过类名调用。
	(3)静态的内存图
		静态的内容在方法区的静态区
	(4)静态的注意事项；
		A:在静态方法中没有this对象
		B:静态只能访问静态(代码测试过)
	(5)静态变量和成员变量的区别
		A:所属不同
			静态变量：属于类，类变量
			成员变量：属于对象，对象变量，实例变量
		B:内存位置不同
			静态变量：方法区的静态区
			成员变量：堆内存
		C:生命周期不同
			静态变量：静态变量是随着类的加载而加载，随着类的消失而消失
			成员变量：成员变量是随着对象的创建而存在，随着对象的消失而消失
		D:调用不同
			静态变量：可以通过对象名调用，也可以通过类名调用
			成员变量：只能通过对象名调用
	(6)main方法是静态的
		public:权限最大
		static:不用创建对象调用
		void:返回值给jvm没有意义
		main:就是一个常见的名称。
		String[] args:可以接收数据，提供程序的灵活性
			格式：java MainDemo hello world java
				  java MainDemo 10 20 30
```

#### day08

```
1:如何制作帮助文档(了解)
	(1)写一个类
	(2)加入文档注释
	(3)通过javadoc工具生成即可
		javadoc -d 目录 -author -version ArrayTool.java

2:通过JDK提供的API学习了Math类(掌握)
	(1)API(Application Programming Interface)
		应用程序编程接口(帮助文档)
	(2)如何使用呢?
		请参照
			day08\code\02_如何使用JDK提供的帮助文档\如何使用帮助文档.txt
	(3)Math类
		A:是针对数学进行操作的类
		B:没有构造方法，因为它的成员都是静态的
		C:产生随机数
			public static double random(): [0.0,1.0)
		D:如何产生一个1-100之间的随机数
			int number = (int)(Math.random()*100)+1;
		E:猜数字小游戏

3:代码块(理解)
	(1)用{}括起来的代码。
	(2)分类：
		A:局部代码块
			用于限定变量的生命周期，及早释放，提高内存利用率。
		B:构造代码块
			把多个构造方法中相同的代码可以放到这里，每个构造方法执行前，首先执行构造代码块。
		C:静态代码块
			对类的数据进行初始化，仅仅只执行一次。
	(3)静态代码块,构造代码块,构造方法的顺序问题?
		静态代码块 > 构造代码块 > 构造方法
	
4:继承(掌握)
	(1)把多个类中相同的成员给提取出来定义到一个独立的类中。然后让这多个类和该独立的类产生一个关系，
	   这多个类就具备了这些内容。这个关系叫继承。
	(2)Java中如何表示继承呢?格式是什么呢?
		A:用关键字extends表示
		B:格式：
			class 子类名 extends 父类名 {}
	(3)继承的好处：
		A:提高了代码的复用性
		B:提高了代码的维护性
		C:让类与类产生了一个关系，是多态的前提
	(4)继承的弊端：
		A:让类的耦合性增强。这样某个类的改变，就会影响其他和该类相关的类。
			原则：低耦合，高内聚。
			耦合：类与类的关系
			内聚：自己完成某件事情的能力
		B:打破了封装性
	(5)Java中继承的特点
		A:Java中类只支持单继承
		B:Java中可以多层(重)继承(继承体系)
	(6)继承的注意事项：
		A:子类不能继承父类的私有成员
		B:子类不能继承父类的构造方法，但是可以通过super去访问
		C:不要为了部分功能而去继承
	(7)什么时候使用继承呢?
		A:继承体现的是：is a的关系。
		B:采用假设法
	(8)Java继承中的成员关系
		A:成员变量
			a:子类的成员变量名称和父类中的成员变量名称不一样，这个太简单
			b:子类的成员变量名称和父类中的成员变量名称一样，这个怎么访问呢?
				子类的方法访问变量的查找顺序：
					在子类方法的局部范围找，有就使用。
					在子类的成员范围找，有就使用。
					在父类的成员范围找，有就使用。
					找不到，就报错。
		B:构造方法
			a:子类的构造方法默认会去访问父类的无参构造方法
				是为了子类访问父类数据的初始化
			b:父类中如果没有无参构造方法，怎么办?
				子类通过super去明确调用带参构造
				子类通过this调用本身的其他构造，但是一定会有一个去访问了父类的构造
				让父类提供无参构造
		C:成员方法
			a:子类的成员方法和父类中的成员方法名称不一样，这个太简单
			b:子类的成员方法和父类中的成员方法名称一样，这个怎么访问呢?
				通过子类对象访问一个方法的查找顺序：
					在子类中找，有就使用
					在父类中找，有就使用
					找不到，就报错
	(9)两个面试题：
		A:Override和Overload的区别?Overload是否可以改变返回值类型?
		B:this和super的区别和各自的作用?
	(10)数据初始化的面试题
		A:一个类的初始化过程
		B:子父类的构造执行过程
		C:分层初始化
	(11)案例：
		A:学生和老师案例
			继承前
			继承后
		B:猫狗案例的分析和实现
		
		
```

#### day09

```
1:final关键字(掌握)
	(1)是最终的意思，可以修饰类，方法，变量。
	(2)特点：
		A:它修饰的类，不能被继承。
		B:它修饰的方法，不能被重写。
		C:它修饰的变量，是一个常量。
	(3)面试相关：
		A:局部变量
			a:基本类型 值不能发生改变
			b:引用类型 地址值不能发生改变，但是对象的内容是可以改变的
		B:初始化时机
			a:只能初始化一次。
			b:常见的给值
				定义的时候。(推荐)
				构造方法中。
	
2:多态(掌握)
	(1)同一个对象在不同时刻体现出来的不同状态。
	(2)多态的前提：
		A:有继承或者实现关系。
		B:有方法重写。
		C:有父类或者父接口引用指向子类对象。
		
		多态的分类：
			a:具体类多态
				class Fu {}
				class Zi extends Fu {}
				
				Fu f = new Zi();
			b:抽象类多态
				abstract class Fu {}
				class Zi extends Fu {}
				
				Fu f = new Zi();
			c:接口多态
				interface Fu {}
				class Zi implements Fu {}
				
				Fu f = new Zi();
	(3)多态中的成员访问特点
		A:成员变量
			编译看左边，运行看左边
		B:构造方法
			子类的构造都会默认访问父类构造
		C:成员方法
			编译看左边，运行看右边
		D:静态方法
			编译看左边，运行看左边
			
		为什么?
			因为成员方法有重写。
	(4)多态的好处：
		A:提高代码的维护性(继承体现)
		B:提高代码的扩展性(多态体现)
	(5)多态的弊端：
		父不能使用子的特有功能。
		
		现象：
			子可以当作父使用，父不能当作子使用。
	(6)多态中的转型
		A:向上转型
			从子到父
		B:向下转型
			从父到子
	(7)孔子装爹的案例帮助大家理解多态
	(8)多态的练习
		A:猫狗案例
		B:老师和学生案例

3:抽象类(掌握)
	(1)把多个共性的东西提取到一个类中，这是继承的做法。
	   但是呢，这多个共性的东西，在有些时候，方法声明一样，但是方法体。
	   也就是说，方法声明一样，但是每个具体的对象在具体实现的时候内容不一样。
	   所以，我们在定义这些共性的方法的时候，就不能给出具体的方法体。
	   而一个没有具体的方法体的方法是抽象的方法。
	   在一个类中如果有抽象方法，该类必须定义为抽象类。
	(2)抽象类的特点
		A:抽象类和抽象方法必须用关键字abstract修饰
		B:抽象类中不一定有抽象方法,但是有抽象方法的类一定是抽象类
		C:抽象类不能实例化
		D:抽象类的子类
			a:是一个抽象类。
			b:是一个具体类。这个类必须重写抽象类中的所有抽象方法。
	(3)抽象类的成员特点：
		A:成员变量
			有变量，有常量
		B:构造方法
			有构造方法
		C:成员方法
			有抽象，有非抽象
	(4)抽象类的练习
		A:猫狗案例练习
		B:老师案例练习
		C:学生案例练习
		D:员工案例练习
	(5)抽象类的几个小问题
		A:抽象类有构造方法，不能实例化，那么构造方法有什么用?
			用于子类访问父类数据的初始化
		B:一个类如果没有抽象方法,却定义为了抽象类，有什么用?
			为了不让创建对象
		C:abstract不能和哪些关键字共存
			a:final	冲突
			b:private 冲突
			c:static 无意义

4:接口(掌握)
	(1)回顾猫狗案例，它们仅仅提供一些基本功能。
	   比如：猫钻火圈，狗跳高等功能，不是动物本身就具备的，
	   是在后面的培养中训练出来的，这种额外的功能，java提供了接口表示。
	(2)接口的特点：
		A:接口用关键字interface修饰
			interface 接口名 {}
		B:类实现接口用implements修饰
			class 类名 implements 接口名 {}
		C:接口不能实例化
		D:接口的实现类
			a:是一个抽象类。
			b:是一个具体类，这个类必须重写接口中的所有抽象方法。
	(3)接口的成员特点：
		A:成员变量
			只能是常量
			默认修饰符：public static final
		B:构造方法
			没有构造方法
		C:成员方法
			只能是抽象的
			默认修饰符：public abstract
	(4)类与类,类与接口,接口与接口
		A:类与类
			继承关系，只能单继承，可以多层继承
		B:类与接口
			实现关系，可以单实现，也可以多实现。
			还可以在继承一个类的同时，实现多个接口
		C:接口与接口
			继承关系，可以单继承，也可以多继承
	(5)抽象类和接口的区别(自己补齐)?
		A:成员区别
			抽象类：
			接口：
		B:关系区别:
			类与类：
			类与接口：
			接口与接口：
		C:设计理念不同
			抽象类：is a，抽象类中定义的是共性功能。
			接口：like a，接口中定义的是扩展功能。
	(6)练习：
		A:猫狗案例，加入跳高功能
		B:老师和学生案例，加入抽烟功能0
```

#### day10

```
1:形式参数和返回值的问题(理解)
	(1)形式参数：
		类名：需要该类的对象
		抽象类名：需要该类的子类对象
		接口名：需要该接口的实现类对象
	(2)返回值类型：
		类名：返回的是该类的对象
		抽象类名：返回的是该类的子类对象
		接口名：返回的是该接口的实现类的对象
	(3)链式编程
		对象.方法1().方法2().......方法n();
		
		这种用法：其实在方法1()调用完毕后，应该一个对象；
			      方法2()调用完毕后，应该返回一个对象。
				  方法n()调用完毕后，可能是对象，也可以不是对象。

2:包(理解)
	(1)其实就是文件夹
	(2)作用：
		A:区分同名的类
		B:对类进行分类管理
			a:按照功能分
			b:按照模块分
	(3)包的定义(掌握)
		package 包名;
		
		多级包用.分开。
	(4)注意事项：(掌握)
		A:package语句必须在文件中的第一条有效语句
		B:在一个java文件中，只能有一个package
		C:如果没有package，默认就是无包名
	(5)带包的编译和运行
		A:手动式
		B:自动式(掌握)
			javac -d . HelloWorld.java
			
3:导包(掌握)
	(1)我们多次使用一个带包的类，非常的麻烦，这个时候，Java就提供了一个关键字import。
	(2)格式：
		import 包名...类名;
		另一种：
			import 包名...*;(不建议)
	(3)package,import,class的顺序
		package > import > class
	
4:权限修饰符(掌握)
	(1)权限修饰符
					本类	同一个包下	不同包下的子类	不同包下的无关类
		private		Y
		默认		Y		Y
		protected	Y		Y			Y
		public		Y		Y			Y				Y
	(2)这四种权限修饰符在任意时刻只能出现一种。
		public class Demo {}		

5:常见的修饰符(理解)
	(1)分类：
		权限修饰符：private,默认,protected,public
		状态修饰符：static,final
		抽象修饰符：abstract
	(2)常见的类及其组成的修饰
		类：
			默认,public,final,abstract
			
			常用的：public
		
		成员变量：
			private,默认,protected,public,static,final
			
			常用的：private
			
		构造方法：
			private,默认,protected,public
			
			常用的：public
		
		成员方法：
			private,默认,protected,public,static,final,abstract
			
			常用的：public
	(3)另外比较常见的：
		public static final int X = 10;
		public static void show() {}
		public final void show() {}
		public abstract void show();

6:内部类(理解)
	(1)把类定义在另一个类的内部，该类就被称为内部类。
		举例：把类B定义在类A中，类B就被称为内部类。
	(2)内部类的访问规则
		A:可以直接访问外部类的成员，包括私有
		B:外部类要想访问内部类成员，必须创建对象
	(3)内部类的分类
		A:成员内部类
		B:局部内部类
	(4)成员内部类
		A:private 为了数据的安全性
		B:static 为了访问的方便性
		
		成员内部类不是静态的：
			外部类名.内部类名 对象名 = new 外部类名.new 内部类名();
		成员内部类是静态的：
			外部类名.内部类名 对象名 = new 外部类名.内部类名();
	(5)成员内部类的面试题(填空)
		30,20,10
		
		class Outer {
			public int num = 10;
			
			class Inner {
				public int num = 20;
				
				public viod show() {
					int num  = 30;
					
					System.out.println(num);
					System.out.println(this.num);
					System.out.println(Outer.this.num);
				}
			}
		}
	(6)局部内部类
		A:局部内部类访问局部变量必须加final修饰。
		B:为什么呢?
			因为局部变量使用完毕就消失，而堆内存的数据并不会立即消失。
			所以，堆内存还是用该变量，而改变量已经没有了。
			为了让该值还存在，就加final修饰。
			通过反编译工具我们看到了，加入final后，堆内存直接存储的是值，而不是变量名。
	(7)匿名内部类(掌握)
		A:是局部内部类的简化形式
		B:前提
			存在一个类或者接口
		C:格式:
			new 类名或者接口名() {
				重写方法;
			}
		D:本质：
			其实是继承该类或者实现接口的子类匿名对象
	(8)匿名内部类在开发中的使用
		我们在开发的时候，会看到抽象类，或者接口作为参数。
		而这个时候，我们知道实际需要的是一个子类对象。
		如果该方法仅仅调用一次，我们就可以使用匿名内部类的格式简化。
		
		interface Person {
			public abstract void study();
		}
		
		class PersonDemo {
			public void method(Person p) {
				p.study();
			}
		}
		
		class PersonTest {
			public static void main(String[] args) {
				PersonDemo pd = new PersonDemo();
				pd.method(new Person() {
					public void study() {
						System.out.println("好好学习，天天向上");
					}
				});
			}
		}
		
	(9)匿名内部类的面试题(补齐代码)
		interface Inter {
			void show();
		}
		
		class Outer {
			//补齐代码
			public static Inter method() {
				return new Inter() {
					public void show() {
						System.out.println("HelloWorld");
					}	
				};
			}
		}
		
		class OuterDemo {
			public static void main(String[] args) {
				Outer.method().show(); //"HelloWorld"
			}
		}
```

#### day11

```
1:Eclipse的概述使用(掌握)
	请参照ppt和课堂练习.txt
	
2:API的概述(了解)
	(1)应用程序编程接口。
	(2)就是JDK提供给我们的一些提高编程效率的java类。

3:Object类(掌握)
	(1)Object是类层次结构的根类，所有的类都直接或者间接的继承自Object类。
	(2)Object类的构造方法有一个，并且是无参构造
		这其实就是理解当时我们说过，子类构造方法默认访问父类的构造是无参构造
	(3)要掌握的方法：
		A:toString()
			返回对象的字符串表示，默认是由类的全路径+'@'+哈希值的十六进制表示。
			这个表示其实是没有意义的，一般子类都会重写该方法。
			如何重写呢?过程我也讲解过了，基本上就是要求信息简单明了。
			但是最终还是自动生成。
		B:equals()
			比较两个对象是否相同。默认情况下，比较的是地址值是否相同。
			而比较地址值是没有意义的，所以，一般子类也会重写该方法。
			重写过程，我也详细的讲解和分析了。
			但是最终还是自动生成。
	(4)要了解的方法：
		A:hashCode() 返回对象的哈希值。不是实际地址值，可以理解为地址值。
		B:getClass() 返回对象的字节码文件对象，反射中我们会详细讲解	
		C:finalize() 用于垃圾回收，在不确定的时间
		D:clone() 可以实现对象的克隆，包括成员变量的数据复制，但是它和两个引用指向同一个对象是有区别的。
	(5)两个注意问题；
		A:直接输出一个对象名称，其实默认调用了该对象的toString()方法。
		B:面试题 
			==和equals()的区别?
			A:==
				基本类型：比较的是值是否相同
				引用类型：比较的是地址值是否相同
			B:equals()
				只能比较引用类型。默认情况下，比较的是地址值是否相同。
				但是，我们可以根据自己的需要重写该方法。
```

#### day12

```
1:Scanner的使用(了解)
	(1)在JDK5以后出现的用于键盘录入数据的类。
	(2)构造方法：
		A:讲解了System.in这个东西。
			它其实是标准的输入流,对应于键盘录入
		B:构造方法
			InputStream is = System.in;
			
			Scanner(InputStream is)
		C:常用的格式
			Scanner sc = new Scanner(System.in);
	(3)基本方法格式：
		A:hasNextXxx() 判断是否是某种类型的
		B:nextXxx()	返回某种类型的元素
	(4)要掌握的两个方法
		A:public int nextInt()
		B:public String nextLine()
	(5)需要注意的小问题
		A:同一个Scanner对象，先获取数值，再获取字符串会出现一个小问题。
		B:解决方案：
			a:重新定义一个Scanner对象
			b:把所有的数据都用字符串获取，然后再进行相应的转换
			
2:String类的概述和使用(掌握)
	(1)多个字符组成的一串数据。
		其实它可以和字符数组进行相互转换。
	(2)构造方法：
		A:public String()
		B:public String(byte[] bytes)
		C:public String(byte[] bytes,int offset,int length)
		D:public String(char[] value)
		E:public String(char[] value,int offset,int count)
		F:public String(String original)
		下面的这一个虽然不是构造方法，但是结果也是一个字符串对象
		G:String s = "hello";
	(3)字符串的特点
		A:字符串一旦被赋值，就不能改变。
			注意：这里指的是字符串的内容不能改变，而不是引用不能改变。
		B:字面值作为字符串对象和通过构造方法创建对象的不同
			String s = new String("hello");和String s = "hello"的区别?
	(4)字符串的面试题(看程序写结果)
		A:==和equals()
			String s1 = new String("hello");
			String s2 = new String("hello");
			System.out.println(s1 == s2);// false
			System.out.println(s1.equals(s2));// true

			String s3 = new String("hello");
			String s4 = "hello";
			System.out.println(s3 == s4);// false
			System.out.println(s3.equals(s4));// true

			String s5 = "hello";
			String s6 = "hello";
			System.out.println(s5 == s6);// true
			System.out.println(s5.equals(s6));// true
		B:字符串的拼接
			String s1 = "hello";
			String s2 = "world";
			String s3 = "helloworld";
			System.out.println(s3 == s1 + s2);// false
			System.out.println(s3.equals((s1 + s2)));// true

			System.out.println(s3 == "hello" + "world");// false 这个我们错了，应该是true
			System.out.println(s3.equals("hello" + "world"));// true
	(5)字符串的功能(自己补齐方法中文意思)
		A:判断功能
			boolean equals(Object obj)
			boolean equalsIgnoreCase(String str)
			boolean contains(String str)
			boolean startsWith(String str)
			boolean endsWith(String str)
			boolean isEmpty()
		B:获取功能
			int length()
			char charAt(int index)
			int indexOf(int ch)
			int indexOf(String str)
			int indexOf(int ch,int fromIndex)
			int indexOf(String str,int fromIndex)
			String substring(int start)
			String substring(int start,int end)
		C:转换功能
			byte[] getBytes()
			char[] toCharArray()
			static String valueOf(char[] chs)
			static String valueOf(int i)
			String toLowerCase()
			String toUpperCase()
			String concat(String str)
		D:其他功能
			a:替换功能 
				String replace(char old,char new)
				String replace(String old,String new)
			b:去空格功能
				String trim()
			c:按字典比较功能
				int compareTo(String str)
				int compareToIgnoreCase(String str) 
	(6)字符串的案例
		A:模拟用户登录
		B:字符串遍历
		C:统计字符串中大写，小写及数字字符的个数
		D:把字符串的首字母转成大写，其他小写
		E:把int数组拼接成一个指定格式的字符串
		F:字符串反转
		G:统计大串中小串出现的次数
```

#### day13

```
1:StringBuffer(掌握)
	(1)用字符串做拼接，比较耗时并且也耗内存，而这种拼接操作又是比较常见的，为了解决这个问题，Java就提供了
	   一个字符串缓冲区类。StringBuffer供我们使用。
	(2)StringBuffer的构造方法
		A:StringBuffer()
		B:StringBuffer(int size)
		C:StringBuffer(String str)
	(3)StringBuffer的常见功能(自己补齐方法的声明和方法的解释)
		A:添加功能
		B:删除功能
		C:替换功能
		D:反转功能
		E:截取功能(注意这个返回值)
	(4)StringBuffer的练习(做一遍)
		A:String和StringBuffer相互转换
			String -- StringBuffer
				构造方法
			StringBuffer -- String
				toString()方法
		B:字符串的拼接
		C:把字符串反转
		D:判断一个字符串是否对称
	(5)面试题
		小细节：
			StringBuffer：同步的，数据安全，效率低。
			StringBuilder：不同步的，数据不安全，效率高。
		A:String,StringBuffer,StringBuilder的区别
		B:StringBuffer和数组的区别?
	(6)注意的问题：
		String作为形式参数，StringBuffer作为形式参数。
	
2:数组高级以及Arrays(掌握)
	(1)排序
		A:冒泡排序
			相邻元素两两比较，大的往后放，第一次完毕，最大值出现在了最大索引处。同理，其他的元素就可以排好。
			
			public static void bubbleSort(int[] arr) {
				for(int x=0; x<arr.length-1; x++) {
					for(int y=0; y<arr.length-1-x; y++) {
						if(arr[y] > arr[y+1]) {
							int temp = arr[y];
							arr[y] = arr[y+1];
							arr[y+1] = temp;
						}
					}
				}
			}
			
		B:选择排序
			把0索引的元素，和索引1以后的元素都进行比较，第一次完毕，最小值出现在了0索引。同理，其他的元素就可以排好。
			
			public static void selectSort(int[] arr) {
				for(int x=0; x<arr.length-1; x++) {
					for(int y=x+1; y<arr.length; y++) {
						if(arr[y] < arr[x]) {
							int temp = arr[x];
							arr[x] = arr[y];
							arr[y] = temp;
						}
					}
				}
			}
	(2)查找
		A:基本查找
			针对数组无序的情况
			
			public static int getIndex(int[] arr,int value) {
				int index = -1;
				
				for(int x=0; x<arr.length; x++) {
					if(arr[x] == value) {
						index = x;
						break;
					}
				}
				
				return index;
			}
		B:二分查找(折半查找)
			针对数组有序的情况(千万不要先排序，在查找)
			
			public static int binarySearch(int[] arr,int value) {
				int min = 0;
				int max = arr.length-1;
				int mid = (min+max)/2;
				
				while(arr[mid] != value) {
					if(arr[mid] > value) {
						max = mid - 1;
					}else if(arr[mid] < value) {
						min = mid + 1;
					}
					
					if(min > max) {
						return -1;
					}
					
					mid = (min+max)/2;
				}
				
				return mid;
			}
	(3)Arrays工具类
		A:是针对数组进行操作的工具类。包括排序和查找等功能。
		B:要掌握的方法(自己补齐方法)
			把数组转成字符串：
			排序：
			二分查找：
	(4)Arrays工具类的源码解析
	(5)把字符串中的字符进行排序
		举例：
			"edacbgf"
			得到结果
			"abcdefg"

3:Integer(掌握)
	(1)为了让基本类型的数据进行更多的操作，Java就为每种基本类型提供了对应的包装类类型
		byte 		Byte
		short		Short
		int			Integer
		long		Long
		float		Float
		double		Double
		char		Character
		boolean		Boolean
	(2)Integer的构造方法
		A:Integer i = new Integer(100);
		B:Integer i = new Integer("100");
			注意：这里的字符串必须是由数字字符组成
	(3)String和int的相互转换
		A:String -- int
			Integer.parseInt("100");
		B:int -- String
			String.valueOf(100);
	(4)其他的功能(了解)
		进制转换
	(5)JDK5的新特性
		自动装箱	基本类型--引用类型
		自动拆箱	引用类型--基本类型
		
		把下面的这个代码理解即可：
			Integer i = 100;
			i += 200;
	(6)面试题
		-128到127之间的数据缓冲池问题

4:Character(了解)
	(1)Character构造方法	
		Character ch = new Character('a');
	(2)要掌握的方法：(自己补齐)
		A:判断给定的字符是否是大写
		B:判断给定的字符是否是小写
		C:判断给定的字符是否是数字字符
		D:把给定的字符转成大写
		E:把给定的字符转成小写
	(3)案例：
		统计字符串中大写，小写及数字字符出现的次数
```

#### day14

```
1:正则表达式(理解)
	(1)就是符合一定规则的字符串
	(2)常见规则
		A:字符
			x 字符 x。举例：'a'表示字符a
			\\ 反斜线字符。
			\n 新行（换行）符 ('\u000A') 
			\r 回车符 ('\u000D')
			
		B:字符类
			[abc] a、b 或 c（简单类） 
			[^abc] 任何字符，除了 a、b 或 c（否定） 
			[a-zA-Z] a到 z 或 A到 Z，两头的字母包括在内（范围） 
			[0-9] 0到9的字符都包括
			
		C:预定义字符类
			. 任何字符。我的就是.字符本身，怎么表示呢? \.
			\d 数字：[0-9]
			\w 单词字符：[a-zA-Z_0-9]
				在正则表达式里面组成单词的东西必须有这些东西组成

		D:边界匹配器
			^ 行的开头 
			$ 行的结尾 
			\b 单词边界
				就是不是单词字符的地方。
				举例：hello world?haha;xixi
			
		E:Greedy 数量词 
			X? X，一次或一次也没有
			X* X，零次或多次
			X+ X，一次或多次
			X{n} X，恰好 n 次 
			X{n,} X，至少 n 次 
			X{n,m} X，至少 n 次，但是不超过 m 次 
	(3)常见功能：(分别用的是谁呢?)
		A:判断功能
			String类的public boolean matches(String regex)
		B:分割功能
			String类的public String[] split(String regex)
		C:替换功能
			String类的public String replaceAll(String regex,String replacement)
		D:获取功能
			Pattern和Matcher
				Pattern p = Pattern.compile("a*b");
				Matcher m = p.matcher("aaaaab");
				
				find():查找存不存在
				group():获取刚才查找过的数据
	(4)案例
		A:判断电话号码和邮箱
		B:按照不同的规则分割数据
		C:把论坛中的数字替换为*
		D:获取字符串中由3个字符组成的单词
	
2:Math(掌握)
	(1)针对数学运算进行操作的类
	(2)常见方法(自己补齐)
		A:绝对值
		B:向上取整
		C:向下取整
		D:两个数据中的大值
		E:a的b次幂
		F:随机数
		G:四舍五入
		H:正平方根
	(3)案例：
		A:猜数字小游戏
		B:获取任意范围的随机数
	
3:Random(理解)
	(1)用于产生随机数的类
	(2)构造方法:
		A:Random() 默认种子，每次产生的随机数不同
		B:Random(long seed) 指定种子，每次种子相同，随机数就相同
	(3)成员方法:
		A:int nextInt() 返回int范围内的随机数
		B:int nextInt(int n) 返回[0,n)范围内的随机数

4:System(掌握)
	(1)系统类,提供了一些有用的字段和方法
	(2)成员方法(自己补齐)
		A:运行垃圾回收器
		B:退出jvm
		C:获取当前时间的毫秒值
		D:数组复制

5:BigInteger(理解)
	(1)针对大整数的运算
	(2)构造方法	
		A:BigInteger(String s)
	(3)成员方法(自己补齐)
		A:加
		B:减
		C:乘
		D:除
		E:商和余数

6:BigDecimal(理解)
	(1)浮点数据做运算，会丢失精度。所以，针对浮点数据的操作建议采用BigDecimal。(金融相关的项目)
	(2)构造方法
		A:BigDecimal(String s)
	(3)成员方法：
		A:加
		B:减
		C:乘
		D:除
		E:自己保留小数几位

7:Date/DateFormat(掌握)
	(1)Date是日期类，可以精确到毫秒。
		A:构造方法
			Date()
			Date(long time)
		B:成员方法
			getTime()
			setTime(long time)
		C:日期和毫秒值的相互转换
		案例：你来到这个世界多少天了?
	(2)DateFormat针对日期进行格式化和针对字符串进行解析的类，但是是抽象类，所以使用其子类SimpleDateFormat
		A:SimpleDateFormat(String pattern) 给定模式
			yyyy-MM-dd HH:mm:ss
		B:日期和字符串的转换
			a:Date -- String
				format()
				
			b:String -- Date
				parse()
		C:案例：
			制作了一个针对日期操作的工具类。
	
8:Calendar(掌握)
	(1)日历类，封装了所有的日历字段值，通过统一的方法根据传入不同的日历字段可以获取值。
	(2)如何得到一个日历对象呢?
		Calendar rightNow = Calendar.getInstance();
		本质返回的是子类对象
	(3)成员方法
		A:根据日历字段得到对应的值
		B:根据日历字段和一个正负数确定是添加还是减去对应日历字段的值
		C:设置日历对象的年月日
	(4)案例：
		计算任意一年的2月份有多少天?
```

#### day15

```
1:对象数组(掌握)
	(1)数组既可以存储基本数据类型，也可以存储引用类型。它存储引用类型的时候的数组就叫对象数组。
	(2)案例：
		用数组存储5个学生对象，并遍历数组。

2:集合(Collection)(掌握)
	(1)集合的由来?
		我们学习的是Java -- 面向对象 -- 操作很多对象 -- 存储 -- 容器(数组和StringBuffer) -- 数组
		而数组的长度固定，所以不适合做变化的需求，Java就提供了集合供我们使用。
	(2)集合和数组的区别?
		A:长度区别
			数组固定
			集合可变
		B:内容区别
			数组可以是基本类型，也可以是引用类型
			集合只能是引用类型
		C:元素内容
			数组只能存储同一种类型
			集合可以存储不同类型(其实集合一般存储的也是同一种类型)
	(3)集合的继承体系结构?
		由于需求不同，Java就提供了不同的集合类。这多个集合类的数据结构不同，但是它们都是要提供存储和遍历功能的，
		我们把它们的共性不断的向上提取，最终就形成了集合的继承体系结构图。
		
		Collection
			|--List
				|--ArrayList
				|--Vector
				|--LinkedList
			|--Set
				|--HashSet
				|--TreeSet
	(4)Collection的功能概述(自己补齐)
		A:添加功能
		B:删除功能
		C:判断功能
		D:获取功能
		E:长度功能
		F:交集(了解)
		G:把集合转数组(了解)
	(5)Collection集合的遍历
		A:把集合转数组(了解)
		B:迭代器(集合专用方式)
	(6)迭代器
		A:是集合的获取元素的方式。
		B:是依赖于集合而存在的。
		C:迭代器的原理和源码。
			a:为什么定义为了一个接口而不是实现类?
			b:看了看迭代器的内部类实现。
	(7)Collection集合的案例(遍历方式 迭代器)
		集合的操作步骤：
			A:创建集合对象
			B:创建元素对象
			C:把元素添加到集合
			D:遍历集合
	
		A:存储字符串并遍历
			import java.util.Collection;
			import java.util.ArrayList;
			import java.util.Iterator;
			
			public class CollectionDemo {
				public static void main(String[] args) {
					//创建集合对象
					Collection c = new ArrayList();
					
					//创建并添加元素
					c.add("hello");
					c.add("world");
					c.add("java");
					
					//遍历集合
					Iterator it = c.iterator();
					while(it.hasNext()) {
						String s =(String) it.next();
						System.out.println(s);
					}
				}
			}
		
		B:存储自定义对象并遍历
			public class Student {
				private String name;
				private int age;
				
				public Student(){}
				
				public Student(String name,int age) {
					this.name = name;
					this.age = age;
				}
				
				//getXxx()/setXxx()
			}
			
			import java.util.Collection;
			import java.util.ArrayList;
			import java.util.Iterator;
			
			public class StudentDemo {
				public static void main(String[] args) {
					//创建集合对象
					Collection c = new ArrayList();
					
					//创建学生对象
					Student s1 = new Student("林青霞",27);
					Student s2 = new Student("风清扬",30);
					Student s3 = new Student("刘意",30);
					Student s4 = new Student("武鑫",25);
					Student s5 = new Student("刘晓曲",16);
					
					//添加元素
					c.add(s1);
					c.add(s2);
					c.add(s3);
					c.add(s4);
					c.add(s5);
					
					//遍历集合
					Iterator it = c.iterator();
					while(it.hasNext()) {
						Student s = (Student)it.next();
						System.out.println(s.getName()+"---"+s.getAge());
					}
				}
			}

3:集合(List)(掌握)
	(1)List是Collection的子接口
		特点：有序(存储顺序和取出顺序一致)，可重复。
	(2)List的特有功能：(自己补齐)
		A:添加功能
		B:删除功能
		C:获取功能
		D:迭代器功能
		E:修改功能
	(3)List集合的特有遍历功能
		A:由size()和get()结合。
		B:代码演示
					//创建集合对象
					List list = new ArrayList();
					
					//创建并添加元素
					list.add("hello");
					list.add("world");
					list.add("java");
					
					//遍历集合
					Iterator it = list.iterator();
					while(it.hasNext()) {
						String s =(String) it.next();
						System.out.println(s);
					}
					System.out.println("----------");
					
					for(int x=0; x<list.size(); x++) {
						String s =(String) list.get(x);
						System.out.println(s);
					}
	(4)列表迭代器的特有功能；(了解)
		可以逆向遍历，但是要先正向遍历，所以无意义，基本不使用。
	(5)并发修改异常
		A:出现的现象
			迭代器遍历集合，集合修改集合元素
		B:原因
			迭代器是依赖于集合的，而集合的改变迭代器并不知道。
		C:解决方案
			a:迭代器遍历，迭代器修改(ListIterator)
				元素添加在刚才迭代的位置
			b:集合遍历，集合修改(size()和get())
				元素添加在集合的末尾
	(6)常见数据结构
		A:栈 先进后出
		B:队列 先进先出
		C:数组 查询快，增删慢
		D:链表 查询慢，增删快
	(7)List的子类特点(面试题)
		ArrayList
			底层数据结构是数组，查询快，增删慢。
			线程不安全，效率高。
		Vector
			底层数据结构是数组，查询快，增删慢。
			线程安全，效率低。
		LinkedList
			底层数据结构是链表，查询慢，增删快。
			线程不安全，效率高。
			
		到底使用谁呢?看需求?
		分析：
			要安全吗?
				要：Vector(即使要，也不使用这个，后面再说)
				不要：ArrayList或者LinkedList
					查询多；ArrayList
					增删多：LinkedList
					
		什么都不知道，就用ArrayList。
	(8)List集合的案例(遍历方式 迭代器和普通for)
		A:存储字符串并遍历
		B:存储自定义对象并遍历
```

#### day16

```
1:List的子类(掌握)
	(1)List的子类特点
		ArrayList:
			底层数据结构是数组，查询快，增删慢
			线程不安全，效率高
		Vector:
			底层数据结构是数组，查询快，增删慢
			线程安全，效率低
		LinkedList:
			底层数据结构是链表，查询慢，增删快
			线程不安全，效率高
	(2)ArrayList
		A:没有特有功能需要学习
		B:案例
			a:ArrayList存储字符串并遍历
			b:ArrayList存储自定义对象并遍历
	(3)Vector
		A:有特有功能
			a:添加
				public void addElement(E obj)		--	add()
			b:获取
				public E elementAt(int index)		--	get()
				public Enumeration<E> elements()	--  iterator()
		B:案例
			a:Vector存储字符串并遍历
			b:Vector存储自定义对象并遍历
	(4)LinkedList
		A:有特有功能	
			a:添加
				addFirst()
				addLast()
			b:删除
				removeFirst()
				removeLast()
			c:获取
				getFirst()
				getLast()
		B:案例
			a:LinkedList存储字符串并遍历
			b:LinkedList存储自定义对象并遍历
	(5)案例：
		A:去除集合中的多个字符串的重复元素
			如果字符串的内容相同，即为重复元素
		B:去除集合中的多个自定义对象的重复元素
			如果自定义对象的成员变量值都相同，即为重复元素
		C:用LinkedList模拟一个栈数据结构的集合类，并测试。
			你要定义一个集合类，只不过内部可以使用LinkedList来实现。

2:泛型(掌握)
	(1)泛型概述
		是一种把明确类型的工作推迟到创建对象或者调用方法的时候才去明确的特殊的类型。
	(2)格式：
		<数据类型>
		注意：该数据类型只能是引用类型。
	(3)好处：
		A:把运行时期的问题提前到了编译期间
		B:避免了强制类型转换
		C:优化了程序设计，解决了黄色警告线问题，让程序更安全
	(4)泛型的前世今生
		A:泛型的由来
			Object类型作为任意类型的时候，在向下转型的时候，会隐含一个转型问题
		B:泛型类
		C:泛型方法
		D:泛型接口
		E:泛型高级通配符
			?
			? extends E
			? super E
	(5)我们在哪里使用呢?
		一般是在集合中使用。
	
3:增强for循环(掌握)
	(1)是for循环的一种
	(2)格式：
		for(元素的数据类型 变量名 : 数组或者Collection集合的对象) {
			使用该变量即可，该变量其实就是数组或者集合中的元素。
		}
	(3)好处：
		简化了数组和集合的遍历
	(4)弊端
		增强for循环的目标不能为null。建议在使用前，先判断是否为null。
 	
4:静态导入(了解)
	(1)可以导入到方法级别的导入
	(2)格式：
		import static 包名....类名.方法名;
	(3)注意事项：
		A:方法必须是静态的
		B:如果多个类下有同名的方法，就不好区分了，还得加上前缀。
			所以一般我们并不使用静态导入，但是一定要能够看懂。
	
5:可变参数(掌握)
	(1)如果我们在写方法的时候，参数个数不明确，就应该定义可变参数。
	(2)格式：
		修饰符 返回值类型 方法名(数据类型... 变量) {}
		
		注意：
			A:该变量其实是一个数组名
			B:如果一个方法有多个参数，并且有可变参数，可变参数必须在最后
	(3)Arrays工具类的一个方法
		asList()把数组转成集合。
		注意：这个集合的长度不能改变。

6:练习(掌握)
	A:集合的嵌套遍历
	B:产生10个1-20之间的随机数，要求随机数不能重复
	C:键盘录入多个数据，以0结束，并在控制台输出最大值
	
7:要掌握的代码
	集合存储元素，加入泛型，并可以使用增强for遍历。
```

#### day17

```
1:登录注册案例(理解)

2:Set集合(理解)
	(1)Set集合的特点
		无序,唯一
	(2)HashSet集合(掌握)
		A:底层数据结构是哈希表(是一个元素为链表的数组)
		B:哈希表底层依赖两个方法：hashCode()和equals()
		  执行顺序：
			首先比较哈希值是否相同
				相同：继续执行equals()方法
					返回true：元素重复了，不添加
					返回false：直接把元素添加到集合
				不同：就直接把元素添加到集合
		C:如何保证元素唯一性的呢?
			由hashCode()和equals()保证的
		D:开发的时候，代码非常的简单，自动生成即可。
		E:HashSet存储字符串并遍历
		F:HashSet存储自定义对象并遍历(对象的成员变量值相同即为同一个元素)
	(3)TreeSet集合
		A:底层数据结构是红黑树(是一个自平衡的二叉树)
		B:保证元素的排序方式
			a:自然排序(元素具备比较性)
				让元素所属的类实现Comparable接口
			b:比较器排序(集合具备比较性)
				让集合构造方法接收Comparator的实现类对象
		C:把我们讲过的代码看一遍即可
	(4)案例：
		A:获取无重复的随机数
		B:键盘录入学生按照总分从高到底输出
		
3:Collection集合总结(掌握)
	Collection
		|--List	有序,可重复
			|--ArrayList
				底层数据结构是数组，查询快，增删慢。
				线程不安全，效率高
			|--Vector
				底层数据结构是数组，查询快，增删慢。
				线程安全，效率低
			|--LinkedList
				底层数据结构是链表，查询慢，增删快。
				线程不安全，效率高
		|--Set	无序,唯一
			|--HashSet
				底层数据结构是哈希表。
				如何保证元素唯一性的呢?
					依赖两个方法：hashCode()和equals()
					开发中自动生成这两个方法即可
				|--LinkedHashSet
					底层数据结构是链表和哈希表
					由链表保证元素有序
					由哈希表保证元素唯一
			|--TreeSet
				底层数据结构是红黑树。
				如何保证元素排序的呢?
					自然排序
					比较器排序
				如何保证元素唯一性的呢?
					根据比较的返回值是否是0来决定
					
4:针对Collection集合我们到底使用谁呢?(掌握)
	唯一吗?
		是：Set
			排序吗?
				是：TreeSet
				否：HashSet
		如果你知道是Set，但是不知道是哪个Set，就用HashSet。
			
		否：List
			要安全吗?
				是：Vector
				否：ArrayList或者LinkedList
					查询多：ArrayList
					增删多：LinkedList
		如果你知道是List，但是不知道是哪个List，就用ArrayList。
	
	如果你知道是Collection集合，但是不知道使用谁，就用ArrayList。
	
	如果你知道用集合，就用ArrayList。
	
5:在集合中常见的数据结构(掌握)
	ArrayXxx:底层数据结构是数组，查询快，增删慢
	LinkedXxx:底层数据结构是链表，查询慢，增删快
	HashXxx:底层数据结构是哈希表。依赖两个方法：hashCode()和equals()
	TreeXxx:底层数据结构是二叉树。两种方式排序：自然排序和比较器排序
		
```

#### day18

```
1:Map(掌握)
	(1)将键映射到值的对象。一个映射不能包含重复的键；每个键最多只能映射到一个值。 
	(2)Map和Collection的区别?
		A:Map 存储的是键值对形式的元素，键唯一，值可以重复。夫妻对
		B:Collection 存储的是单独出现的元素，子接口Set元素唯一，子接口List元素可重复。光棍
	(3)Map接口功能概述(自己补齐)
		A:添加功能
		B:删除功能
		C:判断功能
		D:获取功能
		E:长度功能
	(4)Map集合的遍历
		A:键找值
			a:获取所有键的集合
			b:遍历键的集合,得到每一个键
			c:根据键到集合中去找值
		
		B:键值对对象找键和值
			a:获取所有的键值对对象的集合
			b:遍历键值对对象的集合，获取每一个键值对对象
			c:根据键值对对象去获取键和值
			
		代码体现：
			Map<String,String> hm = new HashMap<String,String>();
			
			hm.put("it002","hello");
			hm.put("it003","world");
			hm.put("it001","java");
			
			//方式1 键找值
			Set<String> set = hm.keySet();
			for(String key : set) {
				String value = hm.get(key);
				System.out.println(key+"---"+value);
			}
			
			//方式2 键值对对象找键和值
			Set<Map.Entry<String,String>> set2 = hm.entrySet();
			for(Map.Entry<String,String> me : set2) {
				String key = me.getKey();
				String value = me.getValue();
				System.out.println(key+"---"+value);
			}
	(5)HashMap集合的练习
		A:HashMap<String,String>
		B:HashMap<Integer,String>
		C:HashMap<String,Student>
		D:HashMap<Student,String>
	(6)TreeMap集合的练习		
		A:TreeMap<String,String>
		B:TreeMap<Student,String>
	(7)案例
		A:统计一个字符串中每个字符出现的次数
		B:集合的嵌套遍历
			a:HashMap嵌套HashMap
			b:HashMap嵌套ArrayList
			c:ArrayList嵌套HashMap
			d:多层嵌套
			
2:Collections(理解)	
	(1)是针对集合进行操作的工具类
	(2)面试题：Collection和Collections的区别
		A:Collection 是单列集合的顶层接口，有两个子接口List和Set
		B:Collections 是针对集合进行操作的工具类，可以对集合进行排序和查找等
	(3)常见的几个小方法：
		A:public static <T> void sort(List<T> list)
		B:public static <T> int binarySearch(List<?> list,T key)
		C:public static <T> T max(Collection<?> coll)
		D:public static void reverse(List<?> list)
		E:public static void shuffle(List<?> list)
	(4)案例
		A:ArrayList集合存储自定义对象的排序
		B:模拟斗地主洗牌和发牌
		C:模拟斗地主洗牌和发牌并对牌进行排序

```



