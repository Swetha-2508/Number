import java.util.Scanner;
class Custommultiplicationtable
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number");
    int num=sc.nextInt();
    for(int i=1;i<=10;i++)
    {
      if(i==10||i==1)
      {
        continue;
      }
      if(i!=10||i!=1)
      {
        int result=num*i;
        System.out.println(num+" x "+i+" = "+result);
      }
    }
  }
}
