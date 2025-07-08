import java.util.Scanner;

public class Palindrom extends Reverse {
  public boolean isPalindrome() {
        String original = getString();
        char[] chars =  getString().toCharArray();
        reverseString(chars);
        String reversed = new String(chars);
        return original.equals(reversed);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Palindrom obj = new Palindrom();

        System.out.print("Enter the String: ");
        String input = sc.nextLine();
        obj.setString(input);

        if (obj.isPalindrome()) {
            System.out.println("The string is a Palindrome.");
        } else {
            System.out.println("The string is NOT a Palindrome.");
        }
         sc.close();
    }
}
