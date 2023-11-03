package java101;
import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Fibonacci serisi ne kadar devam etsin: ");
        int sayi = inp.nextInt();
        int a = 0, b=1;

        for(int i=0 ; i<sayi ; i++){
            int toplam = a+b;
            a=b;
            b=toplam;
            System.out.println(toplam );

        }
    }
}
