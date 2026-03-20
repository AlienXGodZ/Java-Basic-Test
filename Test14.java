// this is a correct program reverse the array while comparing to test13.java

public class Test14{
    public static void main (String[] args){
        int[] arr = {10,20,30,40,50,60};

        int start = 0;
        int end = arr.length-1;

        while(start < end){

            int temp = arr[start];
            arr[start] =  arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        for(int i = 0; i <= arr.length -1; i++){
            System.out.print(arr[i] + " ");
        }
    }
}