import java.util.Scanner;
class Main {
  public static void main (String[] args)
  {
    String choinka = "*";
    int x = 4;
    for(int k=0;k<3;k++)
      {
    for(int i=0;i<x;i++)
      {
        for(int j=0;j<=x;j++)
          {
            if(j<(x-i) || j>(x+i))
            {
              System.out.print(" ");
            }
            else
            {
              System.out.print(choinka);
            }
          }
        System.out.println("");
        }
      }
  }
}