package abstrac_bangundatar;

public interface BangunDatar {
    
//  method dengan body
    default void setMenggambar(String gambar, String ciriciri){
        System.out.println("Menggambar " + gambar);
        setkarakteristik(ciriciri);
    }

//  static method yang tidak bisa digunkan pada kelas lain
    static void setkarakteristik(String ciri){
        System.out.println("Karakteristik: " + ciri);
    }
}
