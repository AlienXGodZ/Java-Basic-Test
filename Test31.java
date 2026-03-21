//finding the duplicate or same number .

public class Test31 {
    public static void main(String[] args) {
        int[] numbers = {1 , 2 , 3 , 2 , 4 ,5};

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    System.out.println("Duplicate Number is :" + numbers[i]);
                }


            }
        }
        }
    }