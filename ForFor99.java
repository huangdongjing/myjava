/*
需求: 我们现在需要进行一下for循环的嵌套联系
酒酒乘法表
思路
1.定义类
2.定义主函数
3.定义定义行数
4.定义列
5.输出结果
\n:回车
\t:制表符
\r:按下回车键
\b:退格
windows系统种回车符其实是由2个符号组成的\r\n.
linux中回车符就是\n
 */
class ForFor99
{
	public static void main(String[] agrs)
	{
		for(int x=1;x<=9;x++)
		{
			for(int y=1;y<=x;y++)
			{
				System.out.print(y+"*"+x+"="+y*x+"\t");
			}
			System.out.println("\n");
		}
		System.out.println("\"你好\n世界\"");	
	}
}