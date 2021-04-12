package tugas_4;
import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import tugas_5.Menu;

public class Main {    

    static Scanner scan= new Scanner(System.in);
    static Student mhs= new Student();
    static List <Matakuliah> simpan= new ArrayList<>();
    static Map<Integer, Matakuliah> planstudi= new HashMap<>();
    
    public static void main(String[] args) {
        int i;
        boolean menu =true;
        
        Matakuliah data= new Matakuliah();

        planstudi.put(1, new Matakuliah("Aljabar        ", "Hardianto   ", 20));
        planstudi.put(2, new Matakuliah("Mtk Lanjutan   ", "Rudi        ", 40));
        planstudi.put(3, new Matakuliah("Kalkulus       ", "Martin      ", 80));
        planstudi.put(4, new Matakuliah("kalkulus 2     ", "Yahyan      ", 40));
        planstudi.put(5, new Matakuliah("Algoritma      ", "Supratno    ", 70));
        planstudi.put(6, new Matakuliah("Skripsi        ", "Sugiono     ", 10));
        // System.out.println();
        // System.out.println(planstudi);
        // System.out.println();
        // System.out.println(planstudi.get(1));
        // System.out.println(planstudi.get(1).getDosen());
        // System.out.println(planstudi.get(1).getNamamatkul());
        // System.out.println(planstudi.get(1).getSks());
        // System.out.println();

        while(menu){
            System.out.println("1. Daftar mahasiswa");
            System.out.println("2. Daftar matakuliah");
            System.out.println("3. Lihat data mahasiswa");
            System.out.println("4. keluar");
            System.out.print("Masukan pilihan: ");
            i=scan.nextInt();
            switch(i){
                case 1:
                    System.out.println();
                    System.out.println("================== INPUT DATA ==================");
                    System.out.print("Nama depan: ");
                    String f= scan.next();
                    mhs.setFname(f);
                    System.out.print("Nama belakang: ");
                    String l= scan.next();
                    mhs.setLname(l);
                    System.out.print("Npm: ");
                    int nim=scan.nextInt();
                    mhs.setNpm(nim);
                    System.out.print("Domisili: ");
                    String domisili=scan.next();
                    mhs.setDomisili(domisili);
                    System.out.println("DATA BERHASIL DI TAMBAHKAN");
                    System.out.println();
                break;
                case 2:
                    while(menu){
                        input();
                        System.out.print("Tambah MataKuliah: (y/n)");
                        String cek= scan.next();
                        if(cek.equalsIgnoreCase("y")){
                            menu = true;
                        }else if(cek.equalsIgnoreCase("n")){
                            break;
                        }
                    }
                break;
                case 3:
                    lihatdata();
                break;
                case 4:
                    System.exit(0);
                break;
            }
        }
    }

    public static void input(){
        System.out.println();
        System.out.println("================= Daftar matakuliah =================");
        System.out.println("|     Matakuliah     ||     Dosen    || SKS |");
        // pemanggilan dengan map
        for(int a: planstudi.keySet()){
            System.out.println(a+ ". " + planstudi.get(a).getNamamatkul()+ "     " 
            + planstudi.get(a).getDosen()+ "    " + planstudi.get(a).getSks());
        }
        System.out.println("=====================================================");
        System.out.print("Masukan pilihan: ");
        int input= scan.nextInt();
        simpan.add(planstudi.get(input));
        // System.out.println(simpan);
        // System.out.println(simpan.get(0));

        // pemanggilan matakuliah yang dipilih
        for(int i=0; i<simpan.size(); i++){
            System.out.println(simpan.get(i).getNamamatkul());
        }
        System.out.println();
    }

    public static int hitungsks(){
        int sum =0;
        for(int i =0; i < simpan.size(); i++){
            sum += simpan.get(i).getSks();
        }
        return sum;
    }

    public static void lihatdata(){
        System.out.println();
        System.out.println("================== Data Mahasiswa ==================");
        if(hitungsks() >= 144){
            mhs.fullname(mhs.getFname(), mhs.getLname() + ". S.Kom");
        }else{
            mhs.fullname(mhs.getFname(), mhs.getLname());
        }
        mhs.npm(mhs.getNpm());
        mhs.domisili(mhs.getDomisili());
        System.out.println("============= Matakuliah yang di ambil =============");
        for(int i=0; i < simpan.size(); i++){
            System.out.println(i+1 + " " + simpan.get(i).getNamamatkul() + "   " + simpan.get(i).getDosen() + " " + simpan.get(i).getSks());
        }
        System.out.println("====================================================");
        System.out.println("Jumlah sks:                     " + hitungsks());
        System.out.println("====================================================");
        System.out.println();
    }
}
