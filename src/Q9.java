import java.util.Scanner;

//Password Program
public class Q9 {

    public static void main(String[] args) {
        final String IDENTIFIER="[a-zA-z0-9]{8,} && [a-z]{1,} && [/W]{1,}";
        System.out.print("Please enter your password: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        if(input == IDENTIFIER){
            System.out.println("Valid Password");
        }
        else{
            System.out.println("Invalid Password");
        }


    }
}
