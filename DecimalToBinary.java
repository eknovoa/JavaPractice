import java.util.Scanner;

class DecimalToBinary {
    public static void main(String[] args) {
        
        Scanner scnr = new Scanner(System.in);
        
        System.out.println("Enter a decimal number: ");
        int num = scnr.nextInt();
        
        String binary = "";
        
        while (num > 0) {
            int remainder = num % 2;
            binary = Integer.toString(remainder) + binary;
            num = num / 2;
        }
        
        System.out.println(binary);
        
    }
}
