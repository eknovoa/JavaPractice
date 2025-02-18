import java.util.Scanner;

class ReverseString {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        
        System.out.println("Enter a string:");
        String str = scnr.nextLine();
        
        String reverseStr = "";
        
        for (int i=str.length()-1; i >= 0; i--) {
            reverseStr += str.charAt(i);
        }
        
        System.out.println(reverseStr);
        
    }
}
