package edu.boychuk;

/**
 * Created by Sergey on 19-Feb-16.
 */
public class MyMath {
    public static void main(String[] args){
      int array[] = new int[] {2,4,63,6,-8,8,6};
     int result =   MyMath.findMin(array);
     System.out.println(result);
        result = MyMath.findMax(array);
        System.out.println(result);
    }
    public static int findMin(int[] arr){
        int min = arr[0];
        for (int element:arr) {


            if (element < min){
                min = element;
            }


        }
        return  min;
    }

    public static int findMax(int[] arr ){
        int max = arr[0];

        for (int element:arr) {
            if(element > max){
                max = element;
            }
        }
        return max;
    }
}
