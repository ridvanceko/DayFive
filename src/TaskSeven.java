import java.util.Scanner;

public class TaskSeven {
    public static void main(String [] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Your favorite city? ");
        String city1 = input.nextLine();

        System.out.println("Your favorite city? ");
        String city2 = input.nextLine();

        System.out.println(city1.contains(city2));

//ask the tutor

    }
}


//Using scanner enter two string input. Print true first input contains the second string
//or
//second input contains the first input.
//Example 1:
//Please enter First String value:
//Amazon Product
//Please enter Second String value:
//Product
//Result : True
//Example 2:
//Please enter First String value:
//Product
//Please enter Second String value:
//Amazon Product
//Result: True