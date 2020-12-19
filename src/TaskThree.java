
import java.util.Scanner;
public class TaskThree {

public static void main(String [] args) {

    Scanner input = new Scanner(System.in);

    System.out.println("Write a random word! ");
    String randomWord = input.nextLine();

    System.out.println("How many letters in this word? ");
    int numberOfLetter = input.nextInt();

    int length = randomWord.length();

    boolean equalLetter = length == numberOfLetter;
    System.out.println(equalLetter);

    System.out.println("Find the IndexOf --> ");
    String findIndexOF = input.nextLine();

    //System.out.println(randomWord.indexOf());


}}

//Create a class with main method.
//2. Create a Scanner object inside main method
//3. Ask the user to enter random word
//4. Then ask the user to input number of letters that word consist
//5. Your code should print True if user entered right number of letters in
//word, False if wrong number is entered.
//6. Then code should ask to enter a letter that user wants to find index of.
//7. Your code should print index of entered letter, if word doesn’t consist
//the letter then code should print -1