package miscellaneous;

import java.util.*;

public class Sorting {

    public static void main(String[] args) {
        //* There are different ways to sort a list of objects
        List<Word> words = new ArrayList<>();
        words.add(new Word("cold"));
        words.add(new Word("Old"));
        words.add(new Word("ld"));
        words.add(new Word("d"));
        System.out.println(words);

        //* You can use the "sort" method of the "Collections" class and pass in the list
        //! The objects in the list however must implement the "Comparable" interface
        Collections.sort(words);
        System.out.println(words);
        
        //* You can also create a class that implements the "Comparator" interface
        //* And then pass an instance of that class to the "sort" method of the list
        WordComparator wordComparator = new WordComparator();
        words.sort(wordComparator);
        System.out.println(words);
        
        //* Or you could just pass a lambda expression to the "sort" method of the list
        //! You can use "compareToIgnoreCase" to make the sorting case-insensitive
        words.sort((w1, w2) -> w2.title.compareToIgnoreCase(w1.title));
        System.out.println(words);
    }
}

//* You pass the class that implements the "Comparable" interface as a type argument
class Word implements Comparable<Word> {
    String title;
    
    public Word(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }

    //! You must implement the "compareTo" method of the "Comparable" interface
    //* It should return a negative integer, zero, or a positive integer
    @Override
    public int compareTo(Word w) {
        //* If you're comparing string instances, you can use the "compareTo" method of the "String" class
        //! With "compareTo", uppercase letters come before lowercase ones
        return title.compareTo(w.title);
    }
}

//* Create a comparator class, and pass the sortable class to "Comparator" as a type argument
class WordComparator implements Comparator<Word> {
    //! You must implement the "compare" method of the "Comparator" interface
    @Override
    public int compare(Word w1, Word w2) {
        //* Its logic is similar to the "compareTo" method
        //* You can define other ways to sort the objects
        return w1.title.length() - w2.title.length();
    }
}
