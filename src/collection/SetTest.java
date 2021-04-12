package collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetTest {
    public void SetTesting(){
        // INSTANSIASI OBJECT
            Set<String> setName= new HashSet<>();

        // MENAMBAH DATA
            setName.add("Andi");
            setName.add("Andi");
            setName.add("Budi");
            setName.add("Sandika");

        // SORTING
        List<String> listnama = new ArrayList<>();
        listnama.addAll(setName);

        Collections.sort(listnama);
        System.out.println("sorted:" + listnama);

        // MENAMPILKAN DATA
        System.out.println("Orang: ");
            for(String element: setName){
                System.out.println(element);
            }
    }

    public static void main(String[] args) {
        SetTest st = new SetTest();
        st.SetTesting();
    }
}
