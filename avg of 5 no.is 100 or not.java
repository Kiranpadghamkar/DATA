import java.util.Scanner;
class demo
{
int a,b,c,d,e,sum,avg;
void num()
{
Scanner sc=new Scanner(System.in);
System.out.println("enter a no");
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();
d=sc.nextInt();
e=sc.nextInt();
sum=a+b+c+d+e;
avg=sum/5;
if(avg==100)
{
System.out.println("avg of five no is 100");
}
else
{
System.out.println("avg of five no is not 100");
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
