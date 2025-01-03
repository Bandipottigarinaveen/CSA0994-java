public class lcm {
    public static void main(String[]ar)
    {
        int n1=4;
        int n2=6;
        int lcm=(n1>n2)?n1:n2;
        while(true)
        {
            if(lcm%n1==0&&lcm%n2==0)
            {
                System.out.println("lcm"+" " +n1+","+n2+"="+lcm);
                break;
            }
            ++lcm;
        }
    }
}
