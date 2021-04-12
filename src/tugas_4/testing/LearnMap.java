package tugas_4.testing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LearnMap {
    
    public static void main(String[] args) {
        
        //deklarasi variable
        boolean lagi= true;

        // deklarasi Map
        Map<Integer, String> student= new HashMap<>();
        Scanner scan= new Scanner(System.in);

        do{
            // memasukan id mahasiswa
            System.out.print("Masukan Nim anda: ");
            int nim= scan.nextInt();
            // memasuka nama mahasiswa
            System.out.print("Masukan nama anda: ");
            String name= scan.next();

            // memasukan data nim dan nama yang telah diinput ke mapping untuk disimpan
            String data=student.put(nim, name);

            // pengecekan apakah data sudah ada atau belum
            if(data!=null){
                System.out.println("Mahasiswa dengan Nim: " + nim + " adalah " + data + " telah diganti menjadi " + name );
            }

            // bertanya untuk memasukan data kembali
            System.out.print("Masukan data lagi? (y/n)");
            String jawab= scan.next();

            // kondisi untuk memasukan data lagi atau tidak
            if(jawab.equalsIgnoreCase("y")){
                continue;
            }else{
                break;
            }

        }while(lagi);
        // scan.close();

        System.out.println();
        System.out.println("================ Data mahasiswa ================");
        System.out.println("Nomor Induk Mahasiswa " + " Nama");
        // pemanggilan data yang telah disimpan dalam map
        // id digunakan sebagai variable pengganti untuk memanggil nim yang adalah key dalam map
        // pendeklarasian id harus di dalam for dan harus sesuai dengan tipe data yang digunaan di map
        for(int id:student.keySet()){
            System.out.println("        " + id + "        " + student.get(id));
        }
    }

}
