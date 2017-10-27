import java.util.Scanner;
class vehicle
{
public static void main(String[]args)
{
Scanner sin=new Scanner(System.in);
int a,u,t,D;
System.out.println("enter the velocity");
u=sin.nextInt();
System.out.println("enter the acceleration");
a=sin.nextInt();
System.out.println("enter the time");
t=sin.nextInt();
D=u*t+(a*t*2)/2;
System.out.println("distance is"+D);
}
}


