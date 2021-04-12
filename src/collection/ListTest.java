package collection;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ListTest {
    public void listTest(){
        String[] mkn={"soto", "uduk"};
        String[] min={"jus jeruk", "es teh"};

        // List<String> makanan2 = new ArrayList<>(Arrays.asList(arr));
        List<String> makanan = new ArrayList<>(Arrays.asList(mkn));
        List<String> minuman = new ArrayList<>(Arrays.asList(min));
        
        // MENAMBAH ISI ARRAY LIST MAKANAN
            makanan.add("burung");
            makanan.add("Mie goreng");
        // END
        
        // MENAMBAH ARRAY MINUMNA
            // makanan.addAll(minuman);
        // END

        // menambahkan berdasarkan index
            // makanan.add(1, "uduk");
        // end

        // DELETE DATA
            // by index
            // makanan.remove(1);

            // menghapus array minuman saja yang ada di dalam array makanan
            // makanan.remove(minuman.get(0));

            // by value
            // makanan.remove("burung");
        // END
        
        System.out.println("Makanan: " + makanan);

        // SORTING
            Collections.sort(makanan);
            System.out.println("sorted: " + makanan);
        // END

        // UKURAN ARRAY
            // System.out.println("ukuran array: " + makanan.size());
        // END
        
        // System.out.println("Makanan: " + makanan2);
        // System.out.println("Minuman: " + minuman);

        // pemanggilan dengan for each
        // System.out.println("Minuman:");
        // for(String element: minuman){
        //     System.out.println(element);
        // }
    }

    public static void main(String[] args) {
        ListTest lt= new ListTest();
        lt.listTest();
    }
}
