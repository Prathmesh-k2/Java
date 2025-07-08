import java.util.Scanner;
public class Reverse {
    private String a;

    public void setString(String a){
        this.a=a;
    }
    public String getString(){
        return a;
    }

  public void reverseString(char[] s) {
    int l = 0;
    int r = s.length - 1;

    while (l < r) {
      char temp = s[l];
      s[l++] = s[r];
      s[r--] = temp;
    }
  }

  public static void main (String[]args){
    Scanner sc=new Scanner(System.in);
    Reverse str=new Reverse();
    System.out.print("Enter the String : ");
   String input = sc.nextLine();
        str.setString(input);

        char[] chars = str.getString().toCharArray();
        str.reverseString(chars);

        System.out.println("Reversed String: " + new String(chars));
        sc.close();
    }
    
  }


