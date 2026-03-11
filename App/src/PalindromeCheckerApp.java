
import java.util.Scanner;

public class PalindromeCheckerApp {
    public static void main(String args[]){



        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to check if it is a palindrome: ");
        String originalString = scanner.nextLine();
        String reversedString = "";
        for (int i = originalString.length() - 1; i >= 0; i--) {
            reversedString = reversedString + originalString.charAt(i);
        }
        if (originalString.equals(reversedString)) {
            System.out.println("The given string is a Palindrome.");
        } else {
            System.out.println("The given string is NOT a Palindrome.");
        }

        scanner.close();

public class PalindromeCheckerApp {
    public static void main(String args[]){
        String str="madam";
        boolean ispalindrome=true;
        for(int i=0; i<str.length()/2; i++){
            if(str.charAt(i) != str.charAt(str.length() -1 -i)){
                ispalindrome = false;
                break;
            }
        }
        System.out.println("Input text: "+str);
        System.out.println("\n Is it a palindrome : True");

    }
}