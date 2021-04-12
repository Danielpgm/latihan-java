package tugas_5;

import java.util.HashMap;
import java.util.Map;

public class Menu {
    
    private String menu;
    private int harga;
    
    public Menu() {
    }

    public String getMenu() {
        return menu;
    }
    public void setMenu(String menu) {
        this.menu = menu;
    }
    public int getHarga() {
        return harga;
    }
    public void setHarga(int harga) {
        this.harga = harga;
    }
    public Menu(String menu, int harga) {
        this.menu = menu;
        this.harga = harga;
    }

    // public static void makanan(){
    //     Map<Integer, Menu> makan= new HashMap<>();
    //     makan.put(1, new Menu("Ayam Bakar   ", 20000));
    //     makan.put(2, new Menu("Ayam Goreng  ", 15000));
    //     makan.put(3, new Menu("Nasi Goreng  ", 14000));
    //     makan.put(4, new Menu("Soto Lamongan", 25000));

    //     for(int i: makan.keySet()){
    //         System.out.println(i + ". " + makan.get(i).getMenu() + "  " + makan.get(i).getHarga());
    //     }

    //     // for(int i=0; i< makan.size(); i++){
    //     //     // System.out.println(i+1 + ". " + makan.get(i).getMenu()+ "          " + makan.get(i));
    //     // }
    // }

    // public static void minuman(){
    //     Map<Integer, Menu> minum= new HashMap<>();
    //     minum.put(1, new Menu("Es Teh Manis ", 7000));
    //     minum.put(2, new Menu("Es Jeruk     ", 10000));
    //     minum.put(3, new Menu("Jeruk Panas  ", 8000));
    //     minum.put(4, new Menu("Jus Alpukat  ", 15000));

    //     for(int i: minum.keySet()){
    //         System.out.println(i + ". " + minum.get(i).getMenu() + "  " + minum.get(i).getHarga());
    //     }
    // }

    // public static void paket(){
    //     Map<Integer, Menu> mp= new HashMap<>();
    //     mp.put(1, new Menu("Ayam Bakar + Nasi  ", 18000));
    //     mp.put(2, new Menu("Ayam Goreng + Nasi  ", 13000));
    //     mp.put(3, new Menu("Lele Goreng + Nasi  ", 13000));
        
    //     for(int i: mp.keySet()){
    //         System.out.println(i + ". " + mp.get(i).getMenu() + "  " + mp.get(i).getHarga());
    //     }
    // }
    

}
