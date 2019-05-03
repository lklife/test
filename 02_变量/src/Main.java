
public class Main {

	public static void main(String[] args) {
	
		//数据类型转换规则:从小到大自动转,从大到小强制转
		//byte->short(char)->int->long->float->double,
		//注意虽然char和short都是占16位,但是他们之间仍然需要强制转换
		short a = 2;
		short b = 1;
		System.out.println(a + b);
		System.out.println("主方法块");
//		普通块代码又叫构造代码块。作用：可以给所有对象进行初始化。   表达形式   ： { 执行语句 ; }
//		静态代码块 随类加载有且只进行一次，作用：给类进行初始化  表达形式：  static {     执行语句 ; }
	     {//普通块
	         System.out.println("普通块");
	     }
	}
	static {//静态块
        System.out.println("静态块");
    }

}
