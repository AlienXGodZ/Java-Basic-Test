public class Test173{
    public static void main (String[] args){

        int[] array = {10,20,30,40,50};

        System.out.println(greater(array,0));
    }

    public static int greater(int[] array, int n){

        if(n == array.length - 1){
            return array[n];
        }

        int resultmax = greater(array,n+1);

        if(array[n] < resultmax){
            return resultmax;
        }

        return array[n];



    }

}