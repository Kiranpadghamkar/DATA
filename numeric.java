//5.Write a program to display the following numeric pattern: 
//12345
//1234
//123
//12
//1

class numeric
{
 public static void main(String[] args) 
{
               
     for(int i=5; i>0 ;i--)
{
                       
      for(int j=0; j < i; j++)
{
        System.out.print(j+1);
 }
                       
   System.out.println("");
  }
 
  }
}