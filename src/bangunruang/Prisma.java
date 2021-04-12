package bangunruang;
import java.util.Scanner;

public class Prisma extends Segitiga {

        Scanner scan= new Scanner(System.in);

        public int luas(){

        // System.out.println("masukan alas: ");
        // alas=scan.nextInt();

        // System.out.println("masukan tinggi: ");
        // tinggi=scan.nextInt();

            int luas = alas * tinggi / 2;
            return luas;
        }

        public int volume(){
            int volume= this.luas() * tinggi;
            return volume;
        }
}
