public class triplet{
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        int target = 8;
        int count=0;
        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] == target) {
                        System.out.println("Triplet: " + arr[i] + ", " + arr[j] + ", " + arr[k]);
                        count = count + 1;
                    }
                }
            }
        }
        System.out.println("triplet:" + count);
        }
    }