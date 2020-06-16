public class SelecttionSort {
    public static int[] SelectSort(int[] arr){
        int small = arr[0];
        int smallindex = 0;

        for(int i = 0; i < arr.length; i++){
            if(small > arr[i]){
                small = arr[i];
                smallindex = i;
            }
        }

        arr[smallindex] = arr[0];
        arr[0] = small;

        return arr;
    }
    public static void main (String[] arg){
        int[] arr = {2, 5, 9, 7, 3};
        int[] newarr = SelectSort(arr);
        for(int i : newarr){
            System.out.print(i);
        }
    }
}
