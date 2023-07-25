package Day28;

import java.util.ArrayList;

public class PracticeArrayList {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(10);
        numbers.add(7);
        numbers.add(15);
        numbers.add(2);

        System.out.println(getSumOfEvens(numbers));


        ArrayList<String> words = new ArrayList<>();
        words.add("apple");
        words.add("hello");
        words.add("bye");
        words.add("open");

        System.out.println(getLengthOfString(words, 0)); //5
        System.out.println(getLengthOfString(words, 2)); //3


        findElement(words, "open");
        findElement(words, "closed");

    }


    /*
    write a method which accepts arraylist of integers
    and returns the sum of all even numbers from the arraylist
     */

    public static int getSumOfEvens(ArrayList<Integer> numbers){
        /*
        1. create int sum
        2. create for loop, iterate thru all elements
        3. inside loop, create if condition to check if number is even
        4. if number is even, sum+=number
        5. go outside of loop and return sum
         */

        int sum = 0;

        for (int i = 0; i < numbers.size(); i++){
            if (numbers.get(i) % 2 == 0){
                sum += numbers.get(i);
            }
        }

        return sum;
    }








    /*
    write a method which accepts arraylist of strings, int index
    and returns the length of string at given index
     */
    public static int getLengthOfString(ArrayList<String> words, int index){

        return words.get(index).length();
    }

    /*
        write a method to search for an element in arraylist.
        We should print a message:
        Found at index: indexNumber
        Not Found!
     */

    public static void findElement(ArrayList<String> list, String wordToSearch){
        if (list.contains(wordToSearch)){
            System.out.println("Found the word at index: " + list.indexOf(wordToSearch));
        }else{
            System.out.println("Not found!");
        }
    }

    /*
    PUT THIS IN MAIN METHOD
        findElement(words, "open");
        findElement(words, "closed");
     */





}
