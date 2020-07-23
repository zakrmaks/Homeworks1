package HomeWork_20;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{3, 5, 7, 9, 15, 16, 20};
        HashMap array = new HashMap();
        for (int i = 0; i < arr.length; i++) {
            array.put(arr[i],i);
        }
        int num1 = 0;
        Object num2 = null;
        int num = 20;
        for (int i = 0; i < arr.length; i++) {
            int dimens = num - arr[i];
            if (array.containsKey(dimens) == true){
                num1 = i;
                num2 = array.get(dimens);
            }
        }
        System.out.println(num1 +"   "+num2.toString());

    }
}

