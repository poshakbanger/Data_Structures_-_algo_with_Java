package Advanced_Java_Topics;

import java.util.Optional;

public class Optional_topic {
    public static void main(String[] args) {
        Optional<String> name = Optional.of("");

        if (name.isPresent()){
            System.out.println("Hiii " + name.get());
        }

        Optional<String> emptyName = Optional.empty();
        System.out.println("Empty " + emptyName.isEmpty());

        //Optional<String> email = Optional.ofNullable(getUserEmail());

    }
}
