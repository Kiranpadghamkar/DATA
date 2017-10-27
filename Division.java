//6. Write a program to check if the first number is divisible by the second number or not. In addition, display appropriate messages according to the input given by the //user

import java.util.Scanner;
class Division
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
int a,b;
System.out.println("enter the first number");
a=sc.nextInt();
System.out.println("enter the second number");
b=sc.nextInt();
if(a/b==0)
{
  System.out.println("a is divided by b");
}
else
{
System.out.println("a is not divided by b");
}
}
}


