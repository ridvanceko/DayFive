import java.util.Scanner;

public class TaskTwo {

    public static void main(String []args) {

        Scanner input = new Scanner(System.in);


        System.out.println("What is your First and Last Name? ");
        String name = input.nextLine();

        System.out.println("What is your age? ");
        int age = input.nextInt();

        System.out.println("What is your state code? ");
       String  stateCode = input.nextLine();

        System.out.println("What is your city name? ");
        String cityName = input.nextLine();

        System.out.println("What is your gender (F,M)? ");
        String gender= input.nextLine();


        boolean result = name.startsWith("A") && name.endsWith("V") && age>=18 && gender.equalsIgnoreCase("M") && cityName.length()<=10
               && stateCode.equalsIgnoreCase("AZ");

        System.out.println(result);

    }
}

//1: Write the program to check Am I able to vote?
//1. Create a class with main method.
//2. Create a Scanner object inside main method
//3. Ask user to enter following input
//a. Age
//b. Full Name
//c. State Code
//d. City
//e. Gender ( F, M)
//f. State Code
//4. If Age is more than 18 and Full Name is Staring with ‘A’ and last name is ending
//with ‘V’ and state code is Starting with ‘I’ and Ending with ‘L’ and City length is not
//more than 10, and gender is equals to ‘M’
//, I am able to vote. Print true If I am able to
//vote, Print False if I am not able to vote