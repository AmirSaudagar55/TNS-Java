public class Palindrome{
    public static void main(String args[]){
        int num1 = 151;
        int num2 = 0;
        int temp = num1;
        int d = -1;

        while(temp != 0){
            d = temp % 10;

            num2 = num2 * 10 + d;

            temp /= 10;
        }

        System.out.println(num2);
        if(num1 == num2)    System.out.println("Number is Palindrome.");
        else    System.out.println("Number is not palindrome.");

    }
}