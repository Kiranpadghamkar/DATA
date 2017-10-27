
//3.Write a program to create a class that stores the train reservation details. In addition, define a method that will display the stored details.
//(Hint : Create a class and its respective method. you should create Object to call the method)




import java.util.Scanner;
class Train
{
String name,age,seatnumber;
void Details()
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the name");
name=sc.nextLine();
System.out.println("enter the age");
age=sc.nextLine();
System.out.println("enter the seatnumber");
seatnumber=sc.nextLine();
}
}
class Reserve
{
public static void main(String[]args)
{
Train ab=new Train();
ab.Details();
}
}



