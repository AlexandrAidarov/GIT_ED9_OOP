package HomeWorckOOP_03;

import java.util.LinkedList;

// LinkedList<>
public class Main {
    public static void main(String[] args) {
        
        IterableList<String> listLinked = new IterableList<>();
        IterableList.add("str1");
        IterableList.add("str2");
        IterableList.add("str3");
        IterableList.add("str4");
        IterableList.add("str5");
     
        System.out.printf("list size: %d\n", listLinked.size());
        
        for (String value : listLinked) {
            System.out.println(value);
        }



    }

}
