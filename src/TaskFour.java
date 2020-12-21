import java.util.Scanner;

public class TaskFour {

    public static void main(String [] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a string");
        String firstString = input.nextLine();

        String secondString = firstString.substring(0, 2);
        String lastTwoLetter = firstString.substring(firstString.length()-2);

        if (secondString.equalsIgnoreCase(lastTwoLetter)) {
            System.out.println(firstString.substring(2));

        }
    }

}


//Given a string, if a length 2 substring appears at both its
//beginning and end, print a string without the substring at the
//beginning, so "HelloHe" yields "lloHe". The substring may overlap
//with itself, so "Hi" yields "". Otherwise, print the original string unchanged.

//Example
//"TestTe" --> print stTe
//"TestTi" --> print TestTi