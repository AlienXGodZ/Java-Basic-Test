// this is a program reverse the array using string

public class Test15{
    public static void main (String[] args){
        String[] arr = {"a","b","c","c","d","e"};

        int start = 0;
        int end = arr.length-1;

        while(start < end){

            String temp = arr[start];
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