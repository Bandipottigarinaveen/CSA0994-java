public class missing {
    public static void main(String[] ar)
    {
        int arr[] = {1,2,4,5};
        int len = arr.length;
        int n = arr[len-1];
        int total = (n*(n+1)) /2;
        int sum =0 ;
        for(int i=0;i< arr.length;i++)
        {
            sum = sum+arr[i];
        }
        int missing = total - sum;
        System.out.println("missing element : "+missing);
    }
}