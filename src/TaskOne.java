
import java.util.Scanner;

public class TaskOne {
    public static void main (String [] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("What is your fav song name? ");
        String song = input.nextLine();

        int length = song.length();
        System.out.println("First char of the son is: " + song.charAt(0));
        System.out.println("Last char of the song is: " + song.charAt(length-1));
        System.out.println("Length of the song is: " + song.length());
        System.out.println("Index number of 'k' is: " + song.indexOf("k"));
        System.out.println("Char of indexNumber of '3' is: " + song.charAt(3));
        System.out.println("Song in UPPER case: " + song.toUpperCase());
        System.out.println("Song in LOWER case: " + song.toLowerCase());
    }}

    //Using Scanner ask user to enter one of the song name
    //Print first char of given song name
    //Print last char of given song name
    //Print length of given song name
    //Print index number of "k" in this song name
    //Print char from index number of 3
    //Print song name upper case
    //Print song name lower case
    //U

