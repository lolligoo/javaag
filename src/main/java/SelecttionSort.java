public class SelecttionSort {
    public static int[] SelectSort(int[] arr){
        int small;
        int small_index = 0;
        for(int j = 0; j < arr.length; j++){
            small = arr[j];
            for(int i = j; i < arr.length; i++){
                if(small >= arr[i]){
                    small = arr[i];
                    small_index = i;
                }
            }
            arr[small_index] = arr[j];
            arr[j] = small;
        }
        return arr;
    }
    public static void main (String[] arg){
        int[] arr = {2, 5, 9, 7, 3,78, 76, 56, 34, 80, 12,4343, 54547, 89653};
        int[] newarr = SelectSort(arr);
        for(int i : newarr){
            System.out.print(i+" ");
        }
    }
}
