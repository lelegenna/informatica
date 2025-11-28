package gennaiolidavidepuntocerchio;
import java.util.Scanner;
public class Test {
   public  void avviaTest() {
    Scanner s = new Scanner(System.in);
    System.out.println("dammi le coordinate del primo punto:");
    int x1 =s.nextInt();
    int y1 =s.nextInt();
    Punto p1 = new Punto(x1,y1 );
    System.out.println("dammi le coordinate del secondo punto:");
    int x2 =s.nextInt();
    int y2 =s.nextInt();
    Punto p2 = new Punto(x2, y2);

        System.out.println("Distanza tra p1 e p2: " + p1.distanzaAltroPunto(p2));
        System.out.println("dammi le coordinate del cerchio e il raggio:");
        int xc = s.nextInt();
        int yc = s.nextInt();
        int raggio = s.nextInt();
        Cerchio cerchio = new Cerchio(xc, yc, raggio);
         System.out.println("dammi le coordinate del cerchio e il raggio:");
        int xc1 = s.nextInt();
        int yc1= s.nextInt();
        int raggio1 = s.nextInt();
        Cerchio cerchio1= new Cerchio(xc1, yc1, raggio1);
        
        System.out.println("c1 contiene p1: " + cerchio.contienePunto(p1));
        System.out.println("c1 interseca c2: " + cerchio.intersecaCerchio(cerchio1));
       
    }
}
