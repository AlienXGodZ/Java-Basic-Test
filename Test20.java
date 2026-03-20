// this program check which is odd and which even even and print the odd and even.

public class Test20 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};

        int counteven = 0;
        int countodd = 0;

        for (int i = 0; i <= arr.length -1 ; i++) {
            if (arr[i] % 2 == 0) {
                counteven = counteven + 1;
            } else {
                countodd = countodd + 1;
            }
        }
        int[] even = new int[counteven];
        int[] odd = new int[countodd];

        int evenindex = 0;
        int oddindex = 0;

        for (int i = 0; i <= arr.length -1 ; i++) {
            if(arr[i]% 2 == 0){
                even[evenindex] = arr[i];
                evenindex = evenindex + 1;
            }else{
                odd[oddindex] = arr[i];
                oddindex = oddindex + 1;
            }
        }
        System.out.print(" Even : ");
        for(int neweven : even){
            System.out.print(neweven + " ");
        }
        System.out.println();
        System.out.print(" Odd : ");
        for(int newodd : odd){
            System.out.print(newodd + " ");
        }
    }
}