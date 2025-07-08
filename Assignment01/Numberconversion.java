import java.util.Scanner;

public class Numberconversion {
    public static void main(String[]args){

        Scanner sc= new Scanner (System.in);
        System.out.print("Enter the Number :");
        int  num = sc.nextInt();
        String binary,octal,hexadecimal;
        binary=Integer.toBinaryString(num);
        octal=Integer.toOctalString(num);
        hexadecimal=Integer.toHexString(num);

        System.out.println("Binary :"+binary);
        System.out.println("Ocatal:"+octal);
        System.out.println("Hexadecimal:"+hexadecimal);
    }
    
}
