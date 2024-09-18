package miscellaneous;

import java.util.List;
import java.util.Optional;

@SuppressWarnings("unused")
public class _Optional {

    public static void main(String[] args) {
        
        //* "Optional" is a wrapper class that can contain a value or be empty
        //! It is meant to be used as a return type for methods that may or may not return a value
        List<String> vowels = List.of("a", "e", "i", "o", "u");
        Optional<String> optional = vowels.stream().findFirst();

        //* To check if there's a value, use "isPresent"
        if (optional.isPresent()) {

            //* To get the contained value, use "get"
            String value = optional.get();
        }
    }
}
