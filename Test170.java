public class Test170{

    static int reverse = 0;

    public static void main(String[] args){

      int num = 121;
      int originalNumber = num;

      reverseNumber(num);

      if(reverse == originalNumber){
          System.out.println("PALINDROME");
      }else{
          System.out.println("NOT PALINDROME");
      }

    }

    public static void reverseNumber(int num){

        if(num == 0){
            return;
        }

        reverse = reverse * 10 + (num % 10);
        reverseNumber(num/10);


    }

}