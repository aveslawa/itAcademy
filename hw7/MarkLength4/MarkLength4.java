package MarkLength4;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Viachaslau.
 */
public class MarkLength4 {

    private static List<String> markLength4(List<String> wordList) {
        List<String> stringArrayList = new ArrayList<>();
        for (String aWordList : wordList) {
            if (aWordList.length() == 4) {
                stringArrayList.add("****");
                stringArrayList.add(aWordList);
            } else {
                stringArrayList.add(aWordList);
            }
        }
        return stringArrayList;
    }

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("this");
        stringList.add("is");
        stringList.add("lots");
        stringList.add("of");
        stringList.add("fun");
        stringList.add("for");
        stringList.add("every");
        stringList.add("Java");
        stringList.add("programmer");

        System.out.println(markLength4(stringList));

    }
}
