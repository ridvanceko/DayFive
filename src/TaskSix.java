import java.util.Scanner;

public class TaskSix {
    public static void main(String []args) {

        Scanner input = new Scanner (System.in);

        System.out.println("Write a words: ");
        String word1 = input.nextLine();

        System.out.println("Write a words: ");
        String word2 = input.nextLine();

        System.out.println("Write a words: ");
        String word3 = input.nextLine();

        System.out.println("First letter of the word1 is: " + word1.charAt(0));
        System.out.println("First letter of the word2 is: " + word2.charAt(0));
        System.out.println("First letter of the word3 is: " + word3.charAt(0));

        System.out.println("First letter of the words are: " + (word1).charAt(0)+(word2).charAt(0)+(word3).charAt(0));


        int length1 = word1.length();
        int length2 = word2.length();
        int length3 = word2.length();

        System.out.println("First word length is: " + word1.length());
        System.out.println("Second word length is: " + word2.length());
        System.out.println("Third word length is: " + word3.length());

                char firstEndLetter = word1.charAt(word1.length()-1);
                char secondEndLetter=word2.charAt(word2.length()-1);
                char thirdEndLetter=word3.charAt(word3.length()-1);
                System.out.print(firstEndLetter);
                System.out.print(secondEndLetter);
                System.out.print(thirdEndLetter);
        // System.out.println("Last char of the words are: " + (word1).charAt(length1-1)+
        //(word2).charAt(length2-1)+(word3).charAt(length3-1));


        //String day="Saturday";
        //String result = day.substring(day.length()-3);



    }
}

//Using Scanner ask user to enter one string value with three word
//1- Print first letter of each word
//2- Print last letter of each word
//3- Print length of each word (BONUS QUESTION)
//Example:
//Please enter value:
//"Java String Test"
//Output:
//JST
//agt
//4
//6
//4