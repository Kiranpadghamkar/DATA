import java.util.Scanner;
class increment
{
int a,b,c;
void inc()
{
Scanner sc=new Scanner(System.in);
System.out.println("enter a no");
a=sc.nextInt();
b=a+1;
c=a+7;
System.out.println(b);
System.out.println(c);
}
}
class test
{
public static void main(String[] args)
{
increment obj=new increment();
obj.inc();
}
}