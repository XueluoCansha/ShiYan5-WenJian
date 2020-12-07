# ShiYan5-WenJian
实验五-文件

##
实验目的
```
1.掌握Java中抽象类和抽象方法的定义；
2.掌握Java中接口的定义，熟练掌握接口的定义形式以及接口的实现方法；
3.了解异常的使用方法，并在程序中根据输入情况做异常处理。
```

##
实验内容
```
某学校为了给学生提供勤工俭学机会，也减轻授课教师的部分压力，准许博士研究生参与课程的助教工作。此时，该博士研究生有双重身份：学生和助教教师；
1.设计两个管理接口：学生管理接口和教师管理接口。学生接口必须包括缴纳学费、查学费的方法；教师接口包括发放薪水和查询薪水的方法；
2.设计博士研究生类，实现上述的两个接口，该博士研究生应具有姓名、性别、年龄、每学期学费、每月薪水等属性；
3.编写测试类，并实例化至少两名博士研究生，统计他们的年收入和学费。根据两者之差，算出每名博士研究生的年应纳税金额。
```

##
实验要求
```
1.在博士研究生类中实现各个接口定义的抽象方法；
2.对年学费和年收入进行统计，用收入减去学费，求得纳税额；
3.国家最新纳税标准（系数），属于某一时期的特定固定值，与实例化对象没有关系，考虑如何用static  final修饰定义；
4.实例化研究生类时，可采用运行时通过main方法的参数args一次性赋值，也可采用Scanner类实现运行时交互式输入；
5.根据输入情况，要在程序中做异常处理。
```

##
实验过程
```
1.根据博士生同时拥有两个身份：学生、助教，建立两个接口类Jiekou、Jiekou02，一个Doctor类和一个Test主类。
2.由于要求系统可以用来缴纳学费、查询缴费、领取薪水、查询薪水，声明函数pay()、check()、pay02()和check02()。
3.将声明的四个函数在Doctor类中实现。
4.在主类中设计界面。
5.设计while语句，并调用函数实现系统。
```

##
核心代码
```
public interface Jiekou {
    public abstract void pay();
    public abstract void check();
}
接口代码，访问修饰符一定要是public。
```

```
Scanner sc = new Scanner(System.in);
Scanner sc1 = new Scanner(System.in);
建立两个Scanner对象，一个用来装int型变量，一个用来装String型变量。
```

```
void jianru() {
    try {
	System.out.println("信息依次为：名字 性别 年龄 学费 薪水");
	name = sc.nextLine();
	sex = sc.nextLine();
	age = sc.nextInt();
	cost6 = sc.nextInt();
	earn1 = sc.nextInt();
	cost = 2*cost6;
	earn = 12*earn1;
	}catch(Exception e) {
	    System.out.print("请输入正确的信息！！！");
	}
}
键入函数：将键入的信息放到对应的位置。
try-catch报错语句：当用户键入了错误类型的信息时（如在月薪处键入中文），停止程序运行并报错。
```

```
public void pay() {
    if(sex.equals("男")) {
	System.out.println("欢迎"+name+"先生进入学校缴费系统");
	if(shifoujiaofei.equals("否")) {
	System.out.println("当前您尚未进行缴费，请在学期开始前完成缴费！");
	}else {
	    System.out.println("你已成功缴费，祝您生活愉快！");
	}
	}else {
	    System.out.println("欢迎"+name+"女士进入学校缴费系统");
	    if(shifoujiaofei.equals("否")) {
	    System.out.println("当前您尚未进行缴费，请在学期开始前完成缴费！");
	}else {
	    System.out.println("你已成功缴费，祝您生活愉快！");
	}
	}
	System.out.println("缴费请输入1，退出请输入9");
	int jianru = sc.nextInt();
	if(jianru == 1) {
	    if(money < cost6) {
		System.out.println("缴费失败，您的余额不足！");
	    }else {
		shifoujiaofei = "是";
		money -= cost6;
		System.out.println("缴费成功，当前余额为："+money+"，祝您生活愉快！");
		}
	}
}
缴费函数：可判断是先生还是女士，并判断是否进行了缴费，后面三个函数类似，但并没有判断性别方法。
```

```
final double a = 0.03;
final double b = 0.1;
final double c = 0.2;
final double d = 0.25;
final double e = 0.3;
final double f = 0.35;
final double g = 0.45;
用final方法定义固定的税率。
```

```
System.out.println("请输入第一位博士的信息");
doctor01.jianru();
System.out.println("请输入第二位博士的信息");
doctor02.jianru();
调用jianru()函数
```

```
if(xunhuan == 1) {
    while(true) {
	System.out.println("请输入您的名字");
        mingzi = sc1.nextLine();			
	if (mingzi.equals(doctor01.name)) {
        doctor01.pay();
	break;
	}
	if (mingzi.equals(doctor02.name)) {
		doctor02.pay();
		break;
		}
	}
}
判断用户键入的数字，进入相应的操作（函数），后三个与之相似。
```

```
if(doctor01.earn - doctor01.cost > 0 && doctor01.earn - doctor01.cost <= 5000) {
	doctor01.tax = 0;
	System.out.println("您需要缴纳的纳税额为："+doctor01.tax);
}else if(doctor01.earn - doctor01.cost > 5000 && doctor01.earn - doctor01.cost <= 8000) {
	doctor01.tax = a*(doctor01.earn - doctor01.cost - 5000);
	System.out.println("您需要缴纳的纳税额为："+doctor01.tax);
}else if(doctor01.earn - doctor01.cost > 8000 && doctor01.earn - doctor01.cost <= 17000) {
	doctor01.tax = 90 + b*(doctor01.earn - doctor01.cost - 8000);
	System.out.println("您需要缴纳的纳税额为："+doctor01.tax);
}else if(doctor01.earn - doctor01.cost > 17000 && doctor01.earn - doctor01.cost <= 30000) {
	doctor01.tax = 90 + 900 + c*(doctor01.earn - doctor01.cost - 17000);
	System.out.println("您需要缴纳的纳税额为："+doctor01.tax);
}else if(doctor01.earn - doctor01.cost > 30000 && doctor01.earn - doctor01.cost <= 40000) {
	doctor01.tax = 90 + 900 + 2600 + d*(doctor01.earn - doctor01.cost - 30000);
	System.out.println("您需要缴纳的纳税额为："+doctor01.tax);
}else if(doctor01.earn - doctor01.cost > 40000 && doctor01.earn - doctor01.cost <= 60000) {
	doctor01.tax = 90 + 900 + 2600 + 2500 + e*(doctor01.earn - doctor01.cost - 40000);
	System.out.println("您需要缴纳的纳税额为："+doctor01.tax);
}else if(doctor01.earn - doctor01.cost > 60000 && doctor01.earn - doctor01.cost <= 85000) {
	doctor01.tax = 90 + 900 + 2600 + 2500 + 6000 + f*(doctor01.earn - doctor01.cost - 60000);
	System.out.println("您需要缴纳的纳税额为："+doctor01.tax);
}else if(doctor01.earn - doctor01.cost > 85000) {
	doctor01.tax = 90 + 900 + 2600 + 2500 + 6000 + 8750 + g*(doctor01.earn - doctor01.cost - 60000);
	System.out.println("您需要缴纳的纳税额为："+doctor01.tax);
}else {
	System.out.println("当薪水低于学费时，您不用缴纳税款！");
}
计算纳税额。
```

##
系统运行截图

![result](https://github.com/sTormfroNT-TNT/ShiYan4-JieKou/blob/main/Img/1.png)
![result](https://github.com/sTormfroNT-TNT/ShiYan4-JieKou/blob/main/Img/2.png)

##
编程感想
```
本次实验主要考查对接口与报错的方法的运用。
本次实验的难度比较适中，在学过的基础上其实更是针对性的强化，但在接口和继承的综合应用时有难度的提升。
本次实验中，确实提高了我的有关Java的代码能力，同时对理论知识的掌握也在实践的过程中不断深化，实验课是十分有效果的。
```
