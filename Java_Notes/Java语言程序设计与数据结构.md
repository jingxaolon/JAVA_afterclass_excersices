# 第一章：计算机、程序和Java概述

## **比特和字节**

~~~shell
# 计算机中字节（byte）是最小的存储单元。每个字节由8个比特构成。
~~~

## **操作系统**

~~~shell
# 操作系统的主要任务：
1、控制和监视系统活动
   例如，识别来自键盘的输入，跟踪存储设备中文件和文件夹的动态等
2、分配和调配系统资源
   确定一个程序需要使用哪些计算机资源，例如：CPU、内存等资源，并进行资源分配。
3、调度操作
   负责调度程序的活动，以便更有效地利用资源
   目前很多操作系统都支持像多道程序设计、多线程和多处理这样的技术。
~~~

## Java语言规范、API、JDK、JRE和IDE

~~~shell
1、Java语言规范是对Java程序设计语言的语法和语义的技术定义。

2、应用程序接口（API）也称为库，包含了为开发Java程序而预定义的类和接口。

3、jdk：Java开发工具包（Java development toolkit）

4、运行Java程序的程序称为jre（Java runtime environment）

5、ide（集成开发环境，integrated development environment）
~~~

## 编译Java程序

~~~shell
# Java是从类中的main方法开始执行的

# Java源程序保存为.java文件，编译为.class文件，.class文件由Java虚拟机（JVM）执行
# 注意：源文件的扩展名必须是.java，而且文件名必须与公共类名完全相同。

编译命令：
javac Welcome.java

# 编译结束后会生成Welcome.class
# 运行时，不需要在文件名后面加.class
java Welcome
~~~

## 程序设计风格和文档

**正确的注释和注释风格**

~~~shell
在程序的开头增加一条注释，解释一下这个程序是做什么的，其主要特点以及用到的技术。

# 行注释
//

# 块注释
/**/

# Java文档注释（放在类或者方法头的前面）
/** */

~~~

**正确的缩进和空白**

~~~shell
# 内层的代码或组成部分相比于外层，需要进行缩进

# 二元操作符的两边应该各加一个空格
例如：3 + 4 * 4
~~~

**块的风格**

~~~shell
# 次行风格

# 行尾风格（Java api源代码采取这个格式）
~~~



****

# 第二章：基本程序设计

## **加号（+）有两种含义：**

~~~shell
1、做加法
2、做字符串的连接（合并）
如果一个数值和一个字符串连接，会将数值转化为字符串再和字符串相连。

字符串常量不能跨行！
# 错误示例
System.out.println("Introduction to Java Programming,
by Y. Daniel Liang");

# 正确示例
System.out.println("Introduction to Java Programming, " + 
"by Y. Daniel Liang");
~~~

## **从控制台读取输入**

~~~shell
# System.in表示标准输入设备
# System.out表示标准输出设备

获得控制台输入的方式：
Scanner input = new Scanner(System.in);		# 创建了一个Scanner类型的对象，对象可以调用方法

对象调用方法
double radius = input.nextDouble();

使用Scanner类需要提前导入：
import java.util.Scanner

如果不导入包，用java.util.Scanner替换Scanner也是可以的。
java.util.Scanner input = new Scanner(System.in);

包的导入方式：
1、明确导入
import java.util.Scanner

2、通配符导入
import java.util.*
两者无性能差别


从控制台输入数据时：
1、可以用空格符分开数据
2、输入一个数据后按下回车键，再次输入下一个数据
~~~

## **标识符命名规则：**

~~~shell
1、标识符是由字母、数字、下划线（_）和美元符号（$）构成的字符序列。
2、标识符必须由字母、数字、下划线（_）或美元符号（$）开头，不能以数字开头。
3、标识符不能是保留字
4、标识符可以为任意长度
~~~

## **命名习惯**

~~~shell
# 1、使用小写字母命名变量和方法
如果一个命名包含多个单词，第一个单词的字母小写，后面每个单词的首字母大写
例如，变量numberOfStudents
这种命名方法为驼峰命名法。

# 2、类名中的每个单词的首字母大写
例如，类名ComputerArea
命名类时，不要使用Java库中已经使用的名称

# 3、常量中的所有字母都大写，两个单词间用下划线连接。
例如，常量PI，常量MAX_VALUE
~~~

## 数据类型

~~~shell
# 数据类型
byte
short
int
long
float
double

Scanner类对每个数据类型都有获取它的方法：
int：nextInt()

# 注：为了实现浮点数的除法，其中一个操作数必须是浮点数：
例如：5.0 / 2
~~~

## **数值型字面值**

~~~shell
# 1、整型字面值
整形字面值默认是int类型的，为了表示一个long型的整型字面值，需要在值后面加上字母L或l
例如，2147483648L

注意：默认情况下，整型字面值是一个十进制整数，要
表示一个二进制整型字面值，在数字前使用0b或者0B（零B）
表示一个八进制整型字面值，在数字前使用0（零）
表示一个十六进制整型字面值，在数字前使用0x或0X（零x）

Java允许在数值型字面值的两个数字间使用下划线，
例如：long ssn = 232_45_4519
下划线必须置于两个数字之间

# 2、浮点型字面值
浮点型字面值带小数点，默认情况下是double型的，例如，5.0被认为是double型而不是float型。
可以通过在数字后面加字母f或F表示该数为float型字面值。
也可以在数字后面加d或D表示该数为double型字面值。

# 3、科学计数法
浮点字面值也可使用科学计数法表示，例如
123.456可以表示为1.23456x10^2，0.0123456可以表示为1.23456x10^-2

Java中科学计数法的语法：1.23456x10^2可以写成1.23456E2或者1.23456E+2
E既可以用大写，也可以用小写。

浮点数在计算机中都是以科学计数法的方式存储的，所以称为浮点数。
~~~

## **示例学习：显示当前时间**

~~~shell
# 1、可以通过调用System.currentTimeMillis()返回当前时间。
currentTimeMillis返回从GMT 1970年1月1日 00:00:00 开始到当前时刻的毫秒数。
~~~

## 数值类型转换

~~~shell
# 1、如果一个数为整数，另一个数为浮点数，那么二元运算中，Java会把整数自动转换为浮点数，再进行计算

# 2、总是可以将一个值赋给支持数值范围更大的变量，例如，可以将long赋给float
但是，如果不进行类型转换，就不能将一个值赋给范围较小的类型的变量。

数据类型转换：将一种类型的值转换为另一种类型的值。
将范围较小的类型转换为范围较大的类型称为：扩展类型。
将范围较大的类型转换为范围较小的类型称为：缩小类型。
# 注：Java将自动扩展一个类型，但缩小类型必须显示完成。

Java中，x1 op= x2形式的增强赋值表达式实现为 x1 = (T)(x1 op x2)，这里T是x1的类型。

# 3、保留小数点后两位
(int)(x1 * 100) / 100.0
向下四舍五入保留小数点后两位。x1如果等于3.456，那么转换后，x1等于3.45

向上保留小数点后两位：
任意double值可以使用(int)(x1 + 0.5)来向上四舍五入，
上面的值可以写成(int)(x1 * 100 + 0.5) / 100.0来向上四舍五入。
~~~



java.lang包中的所有类都是隐式导入的，所以使用Math类不需要导入包。



## 损失精度

~~~shell
double型转换为int型可能会损失精度：
例如double型数值10.03，那么10.03 * 100 可能会变成1002.999999999999，那么转换为int型就不太准确了。
~~~

## **整数溢出**

~~~shell
Java不会给出关于溢出的警告或者错误，因此，当处理一个与给定类型的最大和最小范围很接近的数值时，要特别小心。
~~~

## **舍入错误**

~~~shell
涉及浮点数的计算都是近似的。
整数运算得到的是精确的整数结果值。
~~~



****

# 第三章：选择

## 随机数的生成方法

~~~shell
# 1、使用System.currentTimeMillis()%10

# 2、Math.random()来获得一个0.0到1.0之间的随机double值，不包括1.0
这样，(int)(Math.random() * 10)会返回一个随机的一位整数(即0-9之间的数)。
~~~

## 常见错误

### **两个浮点数的相等测试**

~~~shell
# 浮点数具有有限的计算精度；设计浮点数的计算可能会引入舍入错误。
# 因此两个浮点数的相等计算并不可靠。

# 可以通过计算两个数的差值是否小于某个阈值，来比较他们是否足够接近。
通常将10^-14作为阈值比较两个double型的值，10^-7作为阈值比较两个float型的值。
final double EPSILON = 10E-14
if (Math.abs(x - 0.5) < EPSILON) {};
~~~

## 逻辑操作符

~~~shell
# 德摩根定律
!(condition1 && condition2) 等效于 !condition1 || !condition2

!(condition1 || condition2) 等效于 !condition1 && !condition2
~~~

## 判定闰年

~~~shell
# 如果某年可以被4整除而不能被100整除，或者可以被400整除，那么这一年是闰年。
(year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)
~~~

## 条件操作符

~~~shell
#条件操作符也称为三元操作符
条件操作符语法：
boolean-expression?expression1:expression2
~~~



****

# 第四章：数学函数、字符和字符串

## 常用数学函数

### Math类中的三角函数方法

~~~shell
sin(radians)
cos(radians)
tan(radians)
toRadians(degree)
toDegree(radians)
asin(a)
acos(a)
atan(a)
~~~

### 指数函数方法

~~~shell
exp(x)
log(x)
log10(x)
pow(a, b)
sqrt(x)
~~~

### 取整方法

~~~shell
ceil(x)		# 向上取整为它最接近的整数，返回双精度值
floor(x)	# 向下取整为它最接近的整数，返回双精度值
rint(x)		# 取整为它最接近的整数。如果x与两个整数的距离相等，返回偶数
round(x)	# 如果x是单精度数，返回(int)Math.floor(x + 0.5)
			# 如果x是双精度数，返回(long)Math.floor(x + 0.5)
~~~

## 字符数据类型和操作

~~~shell
将字符映射到它的二进制形式的过程称为编码。编码表定义该如何编码每个字符。

一个16位的Unicode占两个字节，用以\u开头的4位十六进制数表示。范围从'\u0000'到'\uFFFF'

Unicode包含ASCII
~~~

### 特殊字符的转义序列

~~~shell
# 转义序列
\b
\t
\n
……等等

反斜杠\被称为转义字符，显示它要用\\
~~~

### 字符型数据与数值型数据之间的转换

~~~shell
# 当一个char型数据转换成数值型时，这个字符的Unicode就被转换成某个指定的数值类型。
~~~

### 字符的比较和测试

~~~shell
两个字符可以用关系操作符比较。这是通过比较两个字符的Unicode实现的。

# Character类中的方法：
isDigit(ch)
isLetter(ch)
……
~~~

## String类型

~~~shell
# 声明字符串
String message = "Welcome to Java";

String实际上是Java库中一个预定义的类，String类型不是基本类型，而是引用类型。
使用引用类型声明的变量称为引用变量
~~~

### String类的方法

~~~shell
length()
charAt(index)
……

以上的方法只能从一个特定的字符串实例来调用，因此这些方法称为实例方法。
非实例方法称为静态方法。

# 实例方法的调用语法
reference-Variable.methodName(arguments)

# 静态方法的调用语法
ClassName.methodName(arguments)

# Java允许在不新建变量的情况下，使用字符串字面值直接引用字符串
"Welcome to Java".length()
~~~

### 从控制台读取字符串

~~~shell
# 调用Scanner对象上的next()方法
next()方法读取以空白字符结束的字符串（即''、'\t'、'\f'、'\r'、'\n'）

# 调用Scanner对象上的nextLine()方法
nextLine()方法读取一整行文本。

# 注：next()、nextInt()等属于基于标记的输入，因为它们读取采用空白字符分割的单个元素。
# nextLine()方法称为基于行的输入。
~~~

### 从控制台读取字符

~~~shell
String s = input.nextLine();
char ch = s.charAt(0);
~~~

### 字符串比较

~~~shell
# String类中的比较方法
equals(s1)
equalsIgnoreCase(s1)
compareTo(s1)
……
~~~

### 获得子字符串

~~~shell
# String类包含的获取字串的方法
substring(beginIndex)
substring(beginIndex, endIndex)
~~~

### 获取字符串中的字符或者字串

~~~shell
indexOf(ch)
indexOf(ch, fromIndex)
indexOf(s)
indexOf(s, fromIndex)
lastIndexOf(ch)
……
~~~

### 字符串和数字间的转换

~~~shell
# 可以将数值型字符串转换为数值
int intValue = Integer.parseInt(intString);

# 要将字符串转换为double值
int doubleValue = Double.parseDouble(doubleString);
~~~

## 格式化控制台输出

~~~shell
System.out.printf(format, item1, item2, ……, itemk);

#常用格式限定符
%b		# 布尔值
%c
%d
……

# 如果要显示一个带有逗号的数字，可以在数字限定符前面添加一个逗号
System.out.printf("%,8d %,10.1f\n", 12345678, 12345678.263);
12,345,678 12,345,678.3

# 如果要在数字前面添加0，可以在数字限定符前面添加0
System.out.printf("%08d %08.1f\n", 1234, 5.63);
00001234 000005.6

# 默认情况下，输出是右对齐的。可以在格式限定符中放一个减号(-)，指定该项在指定输出域中的输出是左对齐的。

# 注
可以使用%.2f来指定一个小数点后两位的浮点数值，使用%0.2f是不正确的！
~~~

# 第五章：循环

~~~shell
# 注
不要比较浮点值是否相等来进行循环控制！

# do-while循环中，需要分号来结束这个循环
do{

}while();
~~~

## 最小化数值错误

~~~shell
在循环继续条件中使用浮点数将导致数值错误。
~~~



****

# 第六章：方法

## 定义方法

~~~shell
# 定义方法的语法如下：
修饰符		返回值类型		方法名(参数列表){
//方法体;
}

方法头：指的是方法的修饰符、返回值类型、方法名和方法的参数。

方法有返回值，称为带返回值的方法；否则称为void方法。
注：带返回值的方法必须要使用return语句。

定义在方法头里的变量称为形式参数。

方法签名：方法名和参数列表构成方法签名。
~~~

## 调用方法

~~~shell
如果方法返回void。对方法的调用必须是一条语句。

带返回值的方法也可以当作语句调用，这种情况下，忽略返回值即可。
~~~

~~~shell
可以调用相同类中的方法，也可以调用其他类中的方法。

调用其他类中的方法：类名.方法名
~~~

## void方法与返回值方法

~~~shell
return语句对于void方法不是必须的，但它能用于终止方法。
~~~

## 按值传参

~~~shell
# 调用方法的时候是通过传值的方式将实参传递给方法的。

实参必须与方法签名中定义的形参在次序和类型以及数量上相匹配。类型的话需要相互兼容。

形参和实参同名是不会有任何影响的。形参是方法中具有自身存储空间的变量。
~~~

## 重载方法

~~~shell
# 重载方法使得你可以使用同样的名字来定义不同的方法。它们的参数列表必须是不同的。

Java会根据方法签名决定使用哪个方法。
有时调用一个方法时，有两个或多个可能的匹配，但是Java编译器无法判断哪个方法最精确，此时会产生歧义调用。可能会导致编译错误。
~~~

## 变量的作用域

~~~shell
# 变量的作用域指的是变量可以在程序中被引用的范围。

可以在同一个方法中的不同块里声明同名的变量，但是不能在嵌套块或同一块中声明同一个局部变量。
~~~

## 生成随机字符

~~~shell
生成一个随机字符的表达式：
(int)(Math.random() * 65535 + 1)

(int)'a'到(int)'z'之间的随机整数是：
(int)((int)'a' + Math.random() * ((int)'z' - (int)'a' + 1))
简化：
'a' + Math.random() * ('z' - 'a' + 1)

随机的小写字母：
(char)('a' + Math.random() * ('z' - 'a' + 1))

由此，可以生成任意两个字符ch1到ch2之间的随机字符，其中ch1<ch2：
(char)(ch1 + Math.random() * (ch2 - ch1 + 1))
~~~

## 方法抽象和逐步求精

~~~shell
信息隐藏、封装：
用户不知道方法是如何实现的情况下，就可以使用方法。方法的实现封装在方法内，对使用改方法的用户是隐藏的。
~~~

~~~shell
自顶向下：
存根方法：一个简单但不完整的方法。

自底向上：
从下往上每次实现构造图中的一个方法。对每个方法都写一个测试程序(称为驱动器(driver))进行测试。
~~~



****

# 第七章：一维数组

## 声明数组变量

~~~shell
# 声明数组变量的语法：
1、int[] array;	# 推荐使用
2、int array[];
~~~

## 创建数组

~~~shell
# 声明一个数组变量时并不给数组分配存储空间，它只是创建一个对数组的引用的存储位置。
# 数组变量被声明以后，使用下面的语法创建数组：
array = new int[arraySize];
~~~

## 数组的大小和默认值

~~~shell
# 获取数组大小
array.length得到数组的大小。

# 数组默认值
创建数组后，数组元素被赋予默认值：
1、数值型默认值为0
2、char型默认值为'\u0000'
3、boolean型的默认值为false
~~~

## 数组初始化简写方式

~~~shell
# 数组初始化简写方式
double[] myList = {1, 2, 3, 4, 5};

注：数组初始化简写方式中不能使用new操作符。
~~~

## foreach循环

~~~shell
# Java支持一个简便的循环，称为foreach循环。
# 不使用下标变量就可以顺序地遍历整个数组。

用法如下：
for (double e: myList) {
	System.out.println(e);
}
此代码读作：对myList中的每个元素e进行以下操作。
~~~

## 复制数组

~~~shell
# 复制数组有三种方法：
1、使用循环语句逐个地复制数组的元素
2、使用System类中的静态方法arraycopy
例：System.arraycopy(sourceArray, 0, targetArray, 0, sourceArray.length);
3、使用clone方法复制数组
~~~

## 将数组传递给方法

~~~shell
# 当一个数组传递给方法时，数组的引用被传递给方法。

匿名数组：
printArray(new int[]{1, 2, 3, 4, 5});
~~~

## 方法返回数组

~~~shell
# 当方法返回一个数组时，数组的引用被返回。
~~~

## 可变长参数列表

~~~shell
# 可以把类型相同但数目可变的参数传递给方法。方法中的参数声明如下：
typeName... parameterName

例如：public static void printMax(double... numbers) {}
调用：printMax(34, 3, 3, 2, 56.5)		# 将一个可变长参数列表传给数组numbers。
~~~

## 数组的查找

~~~shell
# 线性查找法
p231 LinearSearch

# 二分查找法
p233 BinarySearch
~~~

## 数组的排序

~~~shell
# 选择排序
p235 SelectionSort
~~~

## Arrays类

~~~shell
#java.util.Arrays类包含一些实用的方法用于常见的数组操作。

# 排序
java.util.Arrays.sort(numbers)		# 对整个数组排序
java.util.Arrays.sort(chars, 1, 3)	# 从chars[1]到chars[3 - 1]的部分数组排序
如果计算机有多个处理器，parallelSort将更加高效。

# 查找
# 二分查找法，前提是数组已排好序
java.util.Arrays.binarySearch(list, 11)
注：若数组中不存在关键字，方法返回-(insertionIndex + 1)

# 判断是否相等
java.util.Arrays.equals(list1, list2)

# 填充
# fill方法填充整个或部分数组
java.util.Arrays.fill(list1, 5)			// Fill 5 to the whole array
java.util.Arrays.fill(list2, 1, 5, 8)	// Fill 8 to a partial array

# 可以使用toString方法来返回一个字符串，该字符串代表了数组中的所有元素。
java.util.Arrays.toString(list)
~~~

## 命令行参数

~~~shell
# main方法可以从命令行接收字符串参数。

# 向main方法传递字符串
java TestMain arg0 arg1 arg2

java TestMain "First num" alpha 53
#注：如果字符串包含空格，就必须用双引号括住。数字会被当做字符串处理。
~~~



***

# 第八章：多维数组

## 声明二维数组变量并创建二维数组

~~~shell
#声明二维数组的语法：
数据类型[][] 数组名；

例：int[][] matrix;

#创建二维数组
matrix = new int[5][5];
~~~

## 获取二维数组的长度

~~~shell
# 二维数组实际上是一个其中每一个元素都是一个一维数组的数组。
数组x的长度是里面元素的个数，可以用x.length来获取该值。
元素x[0]、x[1]……x[x.length - 1]也是数组，可以使用x[0].length、x[1].length……x[x.length - 1].length来获取他们的长度。
~~~

## 不规则数组

~~~shell
# 二维数组中的每一行本身就是数组，因此，各行的长度就可以不同。这样的数组称为不规则数组。

例子：
int[][] triangleArray = {
{1, 2, 3, 4, 5},
{1, 2, 3, 4},
{1, 2, 3},
{1, 2},
{1},
};

# 如果事先不知道不规则数组的值，但知道它的长度，可以用如下的方法创建不规则数组。
int[][] triangleArray = new int[5][];
triangleArray[0] = new int[5];
triangleArray[1] = new int[4];
triangleArray[2] = new int[3];
triangleArray[3] = new int[2];
triangleArray[4] = new int[1];
~~~

## 多维数组

~~~shell
# 二维数组是由一个一维数组的数组组成，而一个三维数组可以认为是由一个二维数组的数组所组成。

三维数组：
double[][][] scores = new double[6][5][2];
~~~



****

# 第九章：对象和类

## 为对象定义类

~~~shell
# 面向对象程序设计使用对象进行程序设计。
# 对象代表现实世界中可以明确标识的一个实体，如一个学生，一张桌子等。

- 一个对象的状态
	由数据域及其当前值来表示
	
- 一个对象的行为
	由方法定义。调用对象的一个方法就是要求对象完成一个动作
	
~~~

~~~shell
# 使用一个通用类来定义同一类型的对象。
- 类是一个模板、蓝本
- 对象是类的实例
- 一个类可以有多个实例，创建实例的过程称为实例化
~~~

## 定义类和创建对象

~~~shell
# 定义类的例子
public class TestCircle {
  /** Main method */
  public static void main(String[] args) {
    // Create a circle with radius 1
    Circle circle1 = new Circle();
    System.out.println("The area of the circle of radius "
      + circle1.radius + " is " + circle1.getArea());

    // Create a circle with radius 25
    Circle circle2 = new Circle(25);
    System.out.println("The area of the circle of radius "
      + circle2.radius + " is " + circle2.getArea());

    // Create a circle with radius 125
    Circle circle3 = new Circle(125);
    System.out.println("The area of the circle of radius "
      + circle3.radius + " is " + circle3.getArea());

    // Modify circle radius
    circle2.radius = 100; // or circle2.setRadius(100)
    System.out.println("The area of the circle of radius "
      + circle2.radius + " is " + circle2.getArea());
  }
}

class Circle {
  double radius;												# 数据域

  /** Construct a circle with radius 1 */
  Circle() {													# 构造方法
    radius = 1;
  }

  /** Construct a circle with a specified radius */
  Circle(double newRadius) {									# 构造方法
    radius = newRadius;
  }
																# 方法
  /** Return the area of this circle */
  double getArea() {
    return radius * radius * Math.PI;
  }

  /** Return the perimeter of this circle */
  double getPerimeter() {
    return 2 * radius * Math.PI;
  }

  /** Set a new radius for this circle */
  void setRadius(double newRadius) {
    radius = newRadius;
  }
}
~~~

注：

1、包含main方法的称为主类

2、一个文件中只能有一个公共（public）类，公共类必须与文件同名。

3、上述代码编译后，会生成两个.class文件（TestCircle.class、Circle.class）



> 方法2：
>
> # 可以将两个类组合成一个

~~~shell
public class AlternativeCircle {
  /** Main method */
  public static void main(String[] args) {
    // Create a circle with radius 1
    AlternativeCircle circle1 = new AlternativeCircle();
    System.out.println("The area of the circle of radius "
      + circle1.radius + " is " + circle1.getArea());
  
    // Create a circle with radius 25
    AlternativeCircle circle2 = new AlternativeCircle(25);
    System.out.println("The area of the circle of radius "
      + circle2.radius + " is " + circle2.getArea());
  
    // Create a circle with radius 125
    AlternativeCircle circle3 = new AlternativeCircle(125);
    System.out.println("The area of the circle of radius "
      + circle3.radius + " is " + circle3.getArea());
  
    // Modify circle radius
    circle2.radius = 100;
    System.out.println("The area of the circle of radius "
      + circle2.radius + " is " + circle2.getArea());
  }
  
  double radius; 
 
  /** Construct a circle with radius 1 */
  AlternativeCircle() {
    radius = 1;
  }
  
  /** Construct a circle with a specified radius */
  AlternativeCircle(double newRadius) {
    radius = newRadius;
  }
  
  /** Return the area of this circle */
  double getArea() {
    return radius * radius * Math.PI;
  }
  
  /** Return the perimeter of this circle */
  double getPerimeter() {
    return 2 * radius * Math.PI;
  }
  
  /** Set a new radius for this circle */
  void setRadius(double newRadius) {
    radius = newRadius;
  }
}
~~~

## 使用构造方法构造对象

~~~shell
# 构造方法有以下三个特殊之处：
- 构造方法必须和所在类名字相同
- 构造方法没有返回值类型，甚至连void也没有
- 构造方法是在创建一个对象时由new操作符调用的。构造方法的作用是初始化对象。

# 构造方法也可以重载

通常会提供一个没有参数的构造方法。这样的构造方法称为无参构造方法。

在一个类中，如果用户没有定义构造方法，类会隐式定义一个方法体为空的无参构造方法。
~~~

## 通过引用变量访问对象

~~~shell
# 新创建的对象在内存中被分配空间，它们可以通过引用变量来访问。
# 对象的数据和方法可以运用点操作符（.）通过对象的引用变量进行访问。
~~~

### 引用变量和引用类型

~~~shell
# 声明引用变量：
Classname objectRefer;
如Circle myCircle;

# 创建对象
myCircle = new Circle();

# 变量myCircle中存放的是对Circle对象的引用。
~~~

### 访问对象的数据和方法

~~~shell
# 在创建一个对象后，它的数据访问和方法调用可以使用点操作符（.）来进行，该操作符也称为对象成员访问操作符

# 对象的数据域称为实例变量，因为它依赖于某个具体的实例。
# 对象的方法称为实例方法，因为只能在具体的实例上调用方法。
# 实例方法被调用的对象称为实例对象。

# 有时候，对象在创建后并不需要引用，在这种情况下，可以创建一个对象，而不将它明确地赋值给一个变量，如下所示：
new Circle();
或者
System.out.println("Area is " + new Circle(5).getArea());
这种方式创建的对象称为匿名对象。
~~~

### 引用数据域和null值

~~~shell
# 数据域也可能是引用型的，如下
class Student {
	String name;
}
如果一个引用类型的数据域没有引用任何对象，那么这个数据域就有一个特殊的Java值null。
null是引用类型字面值。

char类型数据域的默认值是'\u000'

Java没有给方法中的局部变量赋默认值

警告：
调用值为null的引用变量上的方法会报错误：NullPointerException
~~~

### 基本类型变量和引用类型变量的区别

~~~shell
# 基本类型变量存储的是基本类型值

# 引用类型变量存储的是对象的存储地址
如果你不再需要某个对象，可以显示地给该对象的引用变量赋null值。
~~~

## 使用Java库中的类

~~~shell
# Java包含了丰富的类的集合
Data类
p288

Random类
p289

Point2D类
p290
~~~

## 静态变量、常量和方法

~~~shell
# 实例变量是属于类的某个特定实例的，不能被同一个类的不同对象所共享。
如果想让一个类的所有实例共享数据，就要使用静态变量，也称为类变量。

静态变量将变量值存储在一个公共的内存地址，任何一个对象修改了静态变量的值，那么同一个类的所有对象都会受到影响。

无需创建类的实例就可以调用静态方法。

# 要声明一个静态变量或定义一个静态方法，就要在这个变量和方法的声明中加上修饰符static。
类中的常量是被该类的所有对象所共享的，因此，常量应该声明为final static。

# main方法也是静态方法。

# 静态变量和静态方法可以通过引用变量或者它们的类名来调用。

# 静态方法不能调用实例方法或者访问实例数据域，因为静态方法和静态数据域不属于某个特定的对象。
~~~

## 可见性修饰符

~~~shell
# 在类、方法、数据域前面使用public可见性修饰符，表示他们可以被任何其他的类访问，如果没有使用可见性修饰符，那么默认类、方法和数据域是可以被同一个包中的任何一个类访问。
如果定义类时没有声明包，就表示把它放在默认包中。

# private修饰符限定方法和数据域只能在它自己的类中被访问。
~~~

## 数据域封装

~~~shell
# 为了避免对数据域的直接修改，应该使用private修饰符将数据域声明为私有的，这称为数据域封装。
为了访问私有数据域，可以提供一个获取方法返回数据域的值，获取方法也称为访问器。
为了更新私有数据域，可以提供一个设置方法给数据域设置新值，设置方法也称为修改器。

注：除非特别的原因而另外指定，否则所有的数据域都应该被声明为私有的，并且所有的构造方法和方法应该被声明为公共的。
~~~

## 向方法传递对象参数

~~~shell
# 给方法传递一个对象，是将对象的引用传递给方法。
~~~

## 对象数组

~~~shell
# 数组既可以存储基本类型值，也可以存储对象。
Circle circleArray = new Circle[10];

# 当使用new操作符创建对象数组后，这个数组中的每个元素都是默认值为null的引用变量。
~~~

## 不可变对象和类

~~~shell
# 创建一个对象后，它的内容是之后允许改变的。
有时候也需要创建一个一旦创建其内容就不能再改变的对象。称这种对象为不可变对象，而它的类就成为不可变类。

# 比如把Circle类的设置方法删掉，该类就变成不可变类，因为半径是私有的，所以如果没有设置方法，它的值就不能再改变。

# 如果一个类是不可变的，那么它的所有数据域必须都是私有的，而且没有对任何一个数据域提供公共的设置方法。

# 要使一个类成为不可变的，必须满足下面的要求：
- 所有数据域是私有的
- 没有修改器方法
- 没有返回一个指向可变数据域的引用的访问器方法
~~~

## 变量的作用域

~~~shell
# 局部变量的声明和使用都在一个方法的内部。

# 类的变量和方法可以在类中以任意顺序出现。除非例外情况（一个数据域是基于对另一个数据域的引用）
类变量只能声明一次！

# 如果一个局部变量和一个类变量具有相同的名字，那么局部变量优先，而同名的类变量将被隐藏。
因此，除了方法中的参数，不要将实例变量或静态变量的名字作为局部变量名。
~~~

## this引用

~~~shell
# 关键字this是一个对象可以用来引用自身的引用名。
可以用this关键字引用对象的实例成员。

然而在引用被方法或构造方法的参数所隐藏的数据域以及调用一个重载的构造方法时，this引用是必需的。

# Java要求，在构造方法中语句this(arg-list)应在任何其他可执行语句之前出现。
~~~























****

# 练习题遗留

~~~shell
p131 4.6
---
p168 5.8	5.9
p169 5.16	解法：https://blog.csdn.net/lanxuepiaoling/article/details/44599827
---
p208 6.30	运行结果比较奇怪
p209 6.31
p210 6.32	与6.30相关
---
p241 7.6
p243 7.17	已经写完，但有明显bug，待优化
p243 7.18
p244 7.24
p245 7.28	已写完，但如何去重
p245 7.32
p246 7.35
p246 7.36
p246 7.37
---
p267 8.12	待完善
p271 8.24
p274 8.35
p274 8.37	与美国州有关，不是美国人，不做
---
p314 9.9

~~~











































