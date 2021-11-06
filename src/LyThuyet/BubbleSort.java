package LyThuyet;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {1, 8, 5, 3, 9, 12, 2};
        bs(arr);
    }

    public static void bs(int[] arr){
        for(int i=0; i < arr.length-1; i++){
            for(int j=0; j < arr.length-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("Bảng sắp xếp tăng dần");
        for(int i=0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
