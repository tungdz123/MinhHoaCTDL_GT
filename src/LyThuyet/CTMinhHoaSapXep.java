package LyThuyet;

public class CTMinhHoaSapXep {
    public static void main(String[] args) {
        int[] arr = {5, 9, -5, 12, 25, 1, 3};
        selectionSort(arr);
    }
    public static void selectionSort(int[] arr){
        for(int i=0; i < arr.length-1; i++){
            int index = i;
            for(int j = i+1; j < arr.length; j++){
                if(arr[j] < arr[index]){
                    index = j;
                }
            }
            int smallerNum = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNum;
        }
        System.out.println("Mảng sắp xếp tăng dần");
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
