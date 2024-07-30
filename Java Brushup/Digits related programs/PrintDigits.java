public class PrintDigits
{
    public static void main(String args[]){
        int num = 123;
        int d = -1;

        System.out.println("Digits are");
        while(num != 0)
        {
            d = num % 10;
            System.out.println(d);
            num /= 10;
        }
    }
}