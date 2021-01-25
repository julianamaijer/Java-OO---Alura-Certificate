import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class StringsInOrder {

    public static void main(String[] args) {

        List<String> words = new ArrayList<String>();
        words.add("alura online");
        words.add("codes's house");
        words.add("caelum");


        //Collections.sort(words, comparator);
/*        words.sort((o1, o2) -> {
                if(o1.length() < o2.length())
                    return -1;
                if(o1.length() > o2.length())
                    return 1;
                return 0;
            });*/

        //words.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));

        words.sort(Comparator.comparing(String::length));



        System.out.println(words);

/*        Consumer<String> press = s -> System.out.println(s);
        words.forEach(press);*/

/*        for (String string : words ){
            System.out.println(string);
        }*/

        //words.forEach(s -> System.out.println(s));
        words.forEach(System.out::println);
        //The target type of this expression must be a functional interface

        new Thread(() -> System.out.println("Executando um Runnable")).start();

    }
}

