import java.util.Scanner;
class demo
{
int a;
void num()
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the no");
a=sc.nextInt();
if(a==20)
{
System.out.println("no is 20");
}
else
{
System.out.println("no is not 20");
}
}
}
class test
{
public static void main(String[]aa)
{
demo obj=new demo();
obj.num();
}
}