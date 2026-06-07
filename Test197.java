public class Test197 {

    static int find = 7;

    public static void main(String[] args) {

        int[] numbers = {10,9,7,4,8,3,1,2};

        for(int i = 0; i < numbers.length; i++){
            for(int j = i + 1; j < numbers.length; j++){

            if(numbers[i] > numbers[j]){
                int temp = numbers[i];
                numbers[i] = numbers[j];
                numbers[j] = temp;
            }
            }
        }

        int result = myMethod(numbers, 0, numbers.length - 1);

        if(result == -1){
            System.out.println("Not Found");
        }else{
            System.out.println("Found at index " + result);
        }
    }

    public static int myMethod(int[] numbers, int start, int end){

        if(start > end){
            return -1;
        }

        int mid = (start + end) / 2;

        if(numbers[mid] == find){
            return mid;
        }

        if(find < numbers[mid]){
            return myMethod(numbers, start, mid - 1);
        }

        return myMethod(numbers, mid + 1, end);
    }
}