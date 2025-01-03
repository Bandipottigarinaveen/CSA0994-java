public class Middle_element {
    public static void main(String[] ar)
    {
        int arr[] = {1,2,3,4,8,6,7,4,9};
        int n = arr.length;
        int mid = n/2;
        System.out.println("middle element in the array : "+arr[mid]);
        int count_even = 0 , count_odd = 0;
        for(int i=0;i<n;i++)
        {
            if(arr[i] % 2 == 0)
            {
                count_even += 1;
            }
            else {
                count_odd += 1;
            }
        }
        System.out.println("middle element of even: "+count_even +" ");
        System.out.println("middle element of odd: "+count_odd +" ");
    }
}