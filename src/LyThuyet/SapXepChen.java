package LyThuyet;

public class SapXepChen {
    public static void main(String[] args) {
        int[] arr = {1, 8, 5, 3, 9, 12, 2};
        sxchen(arr);
    }
    public static void sxchen(int[] arr){
        int n = arr.length;
        for(int i=1; i < n; ++i){
            int key = arr[i];
            int j = i - 1;
            while(j >= 0 && arr[j] > key){
                arr[j+1] = arr[j];
                j = j -1;
            }
            arr[j+1] = key;
        }
        System.out.println("Bảng sắp xếp tăng dần");
        for(int i=0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
