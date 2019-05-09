public class CountingSortRun {

    public static void main(String[] args) {


        CountingSort ob = new CountingSort();

        int arr[] = {0,5,3,5,7,3,3,1,4};

        System.out.print("Start array: ");
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]);
        }

        ob.sort(arr);

        System.out.print("\nSorterede char array bliver til: ");
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]);
        }
    }
}
