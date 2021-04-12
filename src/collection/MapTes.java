package collection;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTes {
    public void mapTesting(){
        Map<String, Integer> nilai = new HashMap<>();
        Map<String, List <Integer>> nilai2  = new HashMap<>();

        // MENGINPUT DATA DI MAP
            nilai.put("Ronald", 60);
            nilai.put("Abdul", 85);
            nilai.put("Abdul", 50);
            nilai.put("Rohim", 42);
            nilai.put("Rohi", 12);

        System.out.println("Object map:" + nilai);
    }

    Map<String, Integer> org = new HashMap<>();

    public Map<String, Integer> getOrang(){
        org.put("aldo", 10);
        org.put("rena", 10);
        return org;
    }


    public static void main(String[] args) {
        MapTes map= new MapTes();
        map.mapTesting();

        map.getOrang();
        int i= map.getOrang().get("aldo");
        int j= map.getOrang().get("rena");
        int k= i*j;
        System.out.println(k);
        System.out.println(map.getOrang());
    }
}