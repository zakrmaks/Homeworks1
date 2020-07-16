package HomeWork_20;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{3,5, 7,9,15, 16,20};
int num = 16;
int left = 0;
int right = arr.length-1;
while (left!=right){
    int summ = arr[left] + arr[right];
    if (summ>num){
        right--;
    }else if(summ<num){
        left++;
    }else {
        System.out.println(left+" "+ right);
        return;
    }
}
    }

}
