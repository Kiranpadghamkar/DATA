import java.util.Scanner;
class addition
{
int a,b,c;
void add()
{
Scanner sc=new Scanner(System.in);
System.out.println("enter a no");
a=sc.nextInt();
b=sc.nextInt();
c=a+b;
System.out.println(c);
}
}
class test
{
public static void main(String[] args)
{
demo obj=new demo();
obj.add();
}
}

