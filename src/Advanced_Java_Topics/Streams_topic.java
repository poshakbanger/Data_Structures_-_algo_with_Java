package Advanced_Java_Topics;

import java.util.Arrays;
import java.util.List;

public class Streams_topic {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Uane", "Jack");
        names.stream()
                .filter(name -> name.startsWith("J"))
                .map(String :: toUpperCase)
                .forEach(System.out::println);
    }
}
