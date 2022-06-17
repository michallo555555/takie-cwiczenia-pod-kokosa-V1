import java.util.Scanner;

class Main {
  public static void main(String[] args) {
  Scanner scan=new Scanner(System.in);
  System.out.println("kalkulator");
  System.out.println("podaj A potem podaj B");
  int A=scan.nextInt();
  int B=scan.nextInt(); 
  int wybor;
  
  
    System.out.println("1- suma A i B");
    System.out.println("2- A do potęgi B");
    System.out.println("3-suma pierwiastkow");
    System.out.println("4-porownanie ktora lcizba wieksza");
    
    wybor=scan.nextInt();
    switch(wybor)
      {
      case 1:
          {
      int C=(A+B);
         System.out.println(C);
          break;
          }

        case 2:
         double C = A;
        for (double i=1;i<B;i++) 
        {
          C = C*A;
        }
        System.out.println(C);

          case 3:
          {
          double z=Math.sqrt(A);
          double y=Math.sqrt(A);
          double v=z+y;
          System.out.println(v);
          }
          
        case 4:
          {
            if (A>B)
            {
            System.out.println("A jest wieksze od B");
            } else if (A<B)
            {
              System.out.println("A jest mniejsze od B");
            }
          }
          
      }



  }
}
