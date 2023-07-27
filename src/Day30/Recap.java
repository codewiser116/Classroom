package Day30;

import Day29.Student;

import java.util.*;

public class Recap {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Hi1");
        hashSet.add("Hi2");
        hashSet.add("Hi3");
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Hi1");
        linkedHashSet.add("Hi2");
        linkedHashSet.add("Hi3");
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Batch3");
        treeSet.add("Abc");
        treeSet.add("Claim");
        treeSet.add("JavaProgrammer");
        treeSet.add("America");
        treeSet.add("Programmer");
        System.out.println(hashSet);
        System.out.println(linkedHashSet);
        System.out.println(treeSet);
    }
}
