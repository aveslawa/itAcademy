import java.util.*;

/**
 * Created by Viachaslau.
 */
public class FrequencyOfDifferentWords {
    public static void main(String[] args) {
        String string = "A big black bug bites a big black bear but big black bear hits a big black bug";
        String[] arrayStrings = string.split(" ");
        List<String> arrayList = new ArrayList<>(Arrays.asList(arrayStrings));
        Set<ArrayList> arrayListSet = new HashSet<>(new ArrayList(arrayList));
        System.out.println("Всего слов в тексте = " + arrayStrings.length);
        System.out.println("Различных слов в тексте = " + arrayListSet.size());

        Map<String, Integer> resultMap = new HashMap<>();
        for (String arrayString : arrayStrings) {
            resultMap.put(arrayString, resultMap.containsKey(arrayString) ? resultMap.get(arrayString) + 1 : 1);
        }

        for (Map.Entry<String, Integer> entry : resultMap.entrySet()) {
            System.out.println("Слово " + entry.getKey() + " встречается в тексте " + entry.getValue() + " раз");
        }
    }
}













