import java.util.Scanner;
public class science
{
 String name;
 String id;
Scanner sin=new Scanner(System.in);
public void display()
{
System.out.println("enter name");
name=sin.nextLine();
System.out.println("enter id");
id=sin.nextLine();
}
}
class maths extends science
{
public maths()
{
System.out.println("marks");
}
}
 class biology extends science
{
public biology()
{
System.out.println("biology");
}
class botany extends biology
{
 public botany()
{
System.out.println("it is botany");
}
}
class zoology extends biology
{
 public zoology()
{
System.out.println("it is zoology");
}
}
}
 class computer extends science
{
 public computer()
{
System.out.println("computer");
}
class hardware extends computer
{
public hardware()
{
System.out.println("copy");
}
}
class software extends computer
{
 public software()
{
System.out.println("paste");
}
}
}
 class electronics extends science
{
 public electronics()
{
System.out.println("aaa");
}
} 

class test
{
public static void main(String[] aa)
{
electronics obj=new electronics();
maths obj1=new maths();
botany obj2=new botany();
software obj3=new software();
obj.display();
}
}
























