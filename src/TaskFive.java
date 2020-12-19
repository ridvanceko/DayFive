import java.util.Scanner;

public class TaskFive {

    public static void main (String [] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Write a words: ");
        String word1 = input.nextLine();

        System.out.println("Write a words: ");
        String word2 = input.nextLine();

        System.out.println("Write a words: ");
        String word3 = input.nextLine();

        int length1 = word1.length();
        int length2 = word2.length();
        int length3 = word2.length();

      boolean equalLength = length1 == length2 && length1 == length3;


        System.out.println("First letter of the word1 is: " + word1.charAt(0));
        System.out.println("First letter of the word2 is: " + word2.charAt(0));
        System.out.println("First letter of the word3 is: " + word3.charAt(0));
        System.out.println("First char of the words are: " + (word1).charAt(0)+(word2).charAt(0)+(word3).charAt(0));
        System.out.println("Last char of the words are: " + (word1).charAt(length1-1)+
                (word2).charAt(length2-1)+(word3).charAt(length3-1));

        System.out.println("Are each of the string length are equals? " + equalLength);


    }}


//Using Scanner ask user to enter one of the three string value.
//1- Print first char of those three string together.
//2- Print last char of each string together
//3- Print true if each of the string length are equals to each other.
//Example:
//Input -1 : We
//Input -2: Love
//Input -3: Java
//Output:
//WLJ
//eea
//false (since each string length is not equals to each other)