public class binary_octel {
    public static void main(String[] ar)
    {
        int n = 1111;
        int base = 1;
        int sum = 0;
        while(n>0)
        {
            int rem = n%10;
            sum = sum +(rem*base);
            base = base*2;
            n= n/10;
        }
        System.out.print("octal : "+sum);
    }
}