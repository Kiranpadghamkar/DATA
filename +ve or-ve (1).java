import java.util.Scanner;
class demo
{
int a;
void even()
{
Scanner sc=new Scanner(System.in);
System.out.println("enter a no");
a=sc.nextInt();
if(a>0)
{
System.out.println("no. is positive");
}
else if(a<0)
{
System.out.println("no. is negative");
}
else
{
System.out.println("no. is zero");
}
}
}
class test
{
public static void main(String[]aa)
{
demo obj=new demo();
obj.even();
}
}
