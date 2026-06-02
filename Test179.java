public class Test179 {
    public static void main (String[] args){

      int num = 13;
      String store = "" ;
      int remainingstore = 0 ;


          while (num > 0){
              remainingstore = num / 2;
              store = (num % 2) + store;

              num = remainingstore;
          }
        System.out.println(store);
      }
    }

