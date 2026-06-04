public class Test184 {
    static int find = 2;
    public static void main(String[] args){

        int[] arr = {1,3,2,2,5,6};
        System.out.println(myMethod(arr,0));


    }

    public static int myMethod(int[] arr , int index){

        if(index == arr.length){
            return -1;
        }

        int result = myMethod(arr,index+1);

        if(result != -1){
            return result;
        }

        if(find == arr[index]){
            return index;
        }

        return -1;


    }

}