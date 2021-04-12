package tugas_5;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {    

    static Scanner scan= new Scanner (System.in);
    static Menu m= new Menu();
    static Map<Integer, Menu> makan= new HashMap<>();
    static Map<Integer, Menu> minum= new HashMap<>();
    static Map<Integer ,Menu> paket= new HashMap<>();
    static List<Menu> simpan = new ArrayList<>();

    public static void main(String[] args) {
        boolean menu= true;
        int i;
        String cek;

        makan.put(1, new Menu("Ayam Bakar   ", 20000));
        makan.put(2, new Menu("Ayam Goreng  ", 15000));
        makan.put(3, new Menu("Nasi Goreng  ", 14000));
        makan.put(4, new Menu("Soto Lamongan", 25000));

        minum.put(1, new Menu("Es Teh Manis ", 7000));
        minum.put(2, new Menu("Es Jeruk     ", 10000));
        minum.put(3, new Menu("Jeruk Panas  ", 8000));
        minum.put(4, new Menu("Jus Alpukat  ", 15000));

        paket.put(1, new Menu("Ayam Bakar + Nasi  ", 18000));
        paket.put(2, new Menu("Ayam Goreng + Nasi  ", 13000));
        paket.put(3, new Menu("Lele Goreng + Nasi  ", 13000));

        while(menu){
            System.out.println("======== Menu RM Serba Ada ========");
            System.out.println("= 1. Makanan");
            System.out.println("= 2. Minuman");
            System.out.println("= 3. Paket");
            System.out.println("= 4. Lihat pesanan");
            System.out.println("= 5. Keluar");
            System.out.println("===================================");
            System.out.print("Masukan pilihan: ");
            i= scan.nextInt();
            switch(i){
                case 1:
                    while(menu){
                        makanan();
                        System.out.println();
                        System.out.print("Tambah Pesanan: (y/n)");
                        cek= scan.next();
                        if(cek.equalsIgnoreCase("y")){
                            menu = true;
                        }else if(cek.equalsIgnoreCase("n")){
                        break;
                    }
                }
                    // System.out.println();
                    // makanan();
                    // System.out.println();
                break;
                case 2:
                    while(menu){
                        minuman();
                        System.out.println();
                        System.out.print("Tambah Pesanan: (y/n)");
                        cek= scan.next();
                        if(cek.equalsIgnoreCase("y")){
                            menu = true;
                        }else if(cek.equalsIgnoreCase("n")){
                            break;
                        }
                    }
                    // System.out.println();
                    // minuman();
                    // System.out.println();
                break;
                case 3:
                    while(menu){
                        paketan();
                        System.out.println();
                        System.out.print("Tambah Pesanan: (y/n)");
                        cek= scan.next();
                        if(cek.equalsIgnoreCase("y")){
                            menu = true;
                        }else if(cek.equalsIgnoreCase("n")){
                            break;
                        }
                    }
                    // System.out.println();
                    // paketan();
                    // System.out.println();
                break;
                case 4:
                    System.out.println();
                    lihatdata();
                    System.out.println();
                break;
                default:
                    System.exit(0);
                break;
            }
        }
    }

    public static void makanan(){
        System.out.println();
        System.out.println("========= Menu Makanan =========");
        for(int a: makan.keySet()){
            System.out.println(a+ ". " + makan.get(a).getMenu() + " " + makan.get(a).getHarga());
        }
        System.out.println("================================");
        System.out.print("Masukan pilihan anda: ");
        int input= scan.nextInt();
        simpan.add(makan.get(input));
    }

    public static void minuman(){
        System.out.println();
        System.out.println("========= Menu Minuman =========");
        for(int a: minum.keySet()){
            System.out.println(a+ ". " + minum.get(a).getMenu() + " " + minum.get(a).getHarga());
        }
        System.out.println("================================");
        System.out.print("Masukan pilihan anda: ");
        int input= scan.nextInt();
        simpan.add(minum.get(input));
    }

    public static void paketan(){
        System.out.println();
        System.out.println("======== Menu paket Hemat ========");
        for(int a: paket.keySet()){
            System.out.println(a+ ". " + paket.get(a).getMenu() + " " + paket.get(a).getHarga());
        }
        System.out.println("==================================");
        System.out.print("Masukan pilihan anda: ");
        int input= scan.nextInt();
        simpan.add(paket.get(input));
    }

    public static void lihatdata(){
        for(int i=0; i < simpan.size(); i++){
            System.out.println(i+1 + ". " + simpan.get(i).getMenu() + "     " + simpan.get(i).getHarga());
        }
        System.out.println("====================================");
        System.out.println("Total harga:        " + total());
        System.out.println("Bayar: ");
        double pay= scan.nextDouble();
        double kembalian= pay - total();
        System.out.println("Kembalian: " + kembalian);
        System.out.println("=================== Terimakasih ===================");
        System.exit(0);
    }

    public static int harga(){
        int sum =0;
        for(int i =0; i < simpan.size(); i++){
            sum += simpan.get(i).getHarga();
        }
        return sum;
    }

    public static double total(){
        double ppn;
        double totalh;
        ppn= harga() * 0.1;
        totalh= harga() + ppn;
        return totalh;
    }
}
