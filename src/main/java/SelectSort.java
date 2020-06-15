public class SelectSort {
    public static int findSmallest(int[] arr){
        int smallest_index = 0;
        int smallest  = arr[0];
        for (int i : arr){
            if(smallest < arr[i]){
                smallest = arr[i];
                smallest_index = i;
            }
        }
        return smallest_index;
    }
    public static int[] selection(int[] arr){
        int[] newarr = new int[6];
        int smallest = findSmallest(arr);
        newarr[smallest] = arr[smallest];
        return newarr;
    }
    public static void main(String[] arg){
        int[] arr = {1, 5, 7, 3, 9, 6};
        System.out.println(selection(arr).toString());
    }
}
