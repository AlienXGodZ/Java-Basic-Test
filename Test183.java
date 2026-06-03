public class Test183 {

    static int find = 7;
    public static void main(String[] args) {

        int[] arr = {5, 2, 9, 7};
        System.out.println(myMethod(arr,0));

    }
    public static int myMethod(int[] arr,int index){

        if(index == arr.length) return -1;


        if(arr[index] == find) return index;

        return myMethod(arr,index+1);
    }
}
