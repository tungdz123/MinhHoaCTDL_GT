package LyThuyet;

public class TimKiem {
    public static void main(String[] args) {
        int[] arr = {1, 8, 5, 3, 9, 10, 2};
        int x = 10;
        int result = search(arr, x);
        if(result == 1)
            System.out.println("Không tìm thấy x");
        else
            System.out.println("Tìm thấy x tại vị trí số " + result);
    }
    public static int search(int arr[], int x){
        int n = arr.length;
        for(int i=0; i<n; i++){
            if(arr[i] == x)
            return i;
        }
        return -1;
    }
}
