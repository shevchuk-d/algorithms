package sort;

public class Sort {

    public static void bubbleSort(int[] arr){
        for(int i = arr.length - 1; i > 1; i--){
            for(int j = 0; j < i; j++){
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public void binarySearchForValue(int[] arr, int value){
        int min = 0;
        int max = arr.length - 1;
        while(min <= max){
            int middleIndex = (max + min) / 2;
            if(arr[middleIndex] < value) min = middleIndex + 1;
            else if(arr[middleIndex] > value) max = middleIndex - 1;
            else {
                min = max + 1;
            }
        }
    }

    public static void selectionSort(int[] arr){
        for(int i = 0; i < arr.length; i++){
            int min = i;
            for(int j = i; j < arr.length; j++){
                if(arr[min]>arr[j]){
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }

    public static void insertionSort(int[] arr){
        for (int i = 1; i < arr.length; i++){
            int j = i;
            int toInsert = arr[i];
            while ((j > 0) && (arr[j-1] > toInsert)){
                arr[j] = arr[j-1];
                j--;
            }
            arr[j] = toInsert;
        }
    }

}
