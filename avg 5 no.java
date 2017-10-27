import java.util.Scanner;
class demo
{
int a,b,c,d,e,sum,avg;
void anum()
{
Scanner sc=new Scanner(System.in);
System.out.println("enter a no");
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();
d=sc.nextInt();
e=sc.nextInt();
sum=a+b+c+d+e;
System.out.println(sum);
avg=sum/5;
System.out.println(avg);
}
}class test
{
public static void main(String[]aa)
{
demo obj=new demo();
obj.anum();
}
}
