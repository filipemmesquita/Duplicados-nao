import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class App {
    public static void main(String[] args) throws Exception {
        String[] Array1 = new String[]{"Morango", "Uva", "Acerola", "Manga"};
        String[] Array2 = new String[]{"Pera", "Caju", "Morango", "Kiwi"};
        List<String> resultArray = new ArrayList<String>();
        List<String> list2 = new ArrayList<String>(Arrays.asList(Array2));

        for(int i=0;i< Array1.length;i++){
            if(list2.contains(Array1[i])){
                resultArray.add(Array1[i]);
            }
        }
        System.out.println(resultArray);
    }
}
