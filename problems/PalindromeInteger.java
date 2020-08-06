//To check whether the number is a Palindrome or not 
// We can check if first and last digits match
//Check and repeat and reduce the number after matching first and last digits
import java.util.*;
class PalindromeInteger{

    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to check whether the number entered is palindrome or not");
        int num = scanner.nextInt();    
        boolean result = palindrome(num);
        if(result == true)
        System.out.println("This number is a palindrome");
        else
        System.out.println("This number is not a palindrome");
    }

    public static boolean palindrome(int num){
        int divisor= 1;
       
        while(num/divisor >= 10)
            divisor *= 10;

            while(num!=0){
                int firstDigit = num/divisor;
                int lastDigit = num % 10;

                if(firstDigit != lastDigit){
                    return false;
                }

                num = (num % divisor)/ 10;
                divisor = divisor/100;
            }
            return true;
    }
}


