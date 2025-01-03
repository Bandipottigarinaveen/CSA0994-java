public class transpose {
    public static void main (String[] ar)
    {
        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int n = arr.length;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.print("\n");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(arr[j][i]+" ");
            }
            System.out.println();
        }
    }
}