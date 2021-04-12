package abstrac_bangundatar;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean menu = true;
        int i;

        Lingkaran lkr= new Lingkaran();
        Persegi prsg= new Persegi();
        Segitiga sgtg= new Segitiga();

        while(menu){
            System.out.println("1. Lingkaran");
            System.out.println("2. Persegi");
            System.out.println("3. Segitiga");
            System.out.println("4. Tampilkan semua");
            System.out.println("5. Keluar");
            System.out.print("Masukan pilihan: ");
            i=new Scanner(System.in).nextInt();
            switch(i){
                case 1:
                    System.out.println();
                    System.out.println("Lingkaran");
                    lkr.setMenggambar("Lingkaran", "memiliki jari-jari, memiliki diameter, memiliki jumlah sudut 180 derajat");
                    System.out.println();
                break;
                case 2:
                    System.out.println();
                    System.out.println("Persegi");
                    prsg.setMenggambar("Persegi", "memiliki 4 sudut memiliki 4 sudut sebesar 90 derajat");
                    System.out.println();
                break;
                case 3:
                    System.out.println();
                    System.out.println("Segitiga");
                    sgtg.setMenggambar("Segitiga", "memiliki 3 sisi, empunyai 3 sudut yang jumlah besarnya 180 derajat, Mempunyai 3 sisi.");
                    System.out.println();
                break;
                case 4:
                    System.out.println();
                    System.out.println("Lingkaran");
                    lkr.setMenggambar("Lingkaran", "memiliki jari-jari, memiliki diameter, memiliki jumlah sudut 180 derajat");

                    System.out.println();
                    System.out.println("Persegi");
                    prsg.setMenggambar("Persegi", "memiliki 4 sudut memiliki 4 sudut sebesar 90 derajat");

                    System.out.println();
                    System.out.println("Segitiga");
                    sgtg.setMenggambar("Segitiga", "memiliki 3 sisi, empunyai 3 sudut yang jumlah besarnya 180 derajat, Mempunyai 3 sisi.");
                    System.out.println();
                break;
                case 5:
                    System.exit(0);
                    System.out.println();
                break;
            }
        }

    }
}