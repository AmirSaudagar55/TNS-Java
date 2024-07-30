public class IsArmstrong{
    public static void main(String args[]){
        int num = 153;
        int temp = num;
        int digit;
        int armstrongProduct = 1;

        while(temp != 0){
            digit = temp % 10;

            armstrongProduct += digit * digit * digit;

            temp /= 10;
        }

        if(num == armstrongProduct) System.out.println("Given number is Armstrong number.");
        else System.out.println("Given number is Armstrong number.");

    }
}