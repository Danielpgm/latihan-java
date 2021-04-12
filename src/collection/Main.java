package collection;
// import java.util.HashMap;

public class Main {
    
    public static void main(String[] args) {
        MapTes map= new MapTes();
        map.getOrang();

        int i= map.getOrang().get("aldo");
        int j= map.getOrang().get("rena");
        int k= i*j;

        System.out.println(k);
    }
}
