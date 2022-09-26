import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

        public static void main(String[] args) {

            //degiskenleri tanimliyoruz.
            double a,b,c,alan,cevre,u;
            Scanner inp=new Scanner(System.in);

            //Kullanicidan verileri aliyoruz.
            System.out.print("1. kenari giriniz: ");
            a = inp.nextDouble();

            System.out.print("2. kenari giriniz: ");
            b = inp.nextDouble();

            c = Math.sqrt((a*a)+(b*b));
            u=(a+b+c)/2;
            cevre=2*u;
            alan=Math.sqrt(u*(u-a)*(u-b)*(u-c));

            System.out.println("Hipotenus: "+new DecimalFormat("##.##").format(c));
            System.out.println("Ucgenin cevresi: "+new DecimalFormat("##.##").format(cevre));
            System.out.println("Ucgenin alani: "+new DecimalFormat("##.##").format(alan));


        }
    }

