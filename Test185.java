public class Test185 {
   public static void main(String[] args){

       String str = "JAVA";
       myMethod(str,0);


   }
   public static void myMethod(String str,int index){

       if(str.length() == index) {
           return ;
       }

      System.out.println(str.charAt(index));
       myMethod(str,index+1);


   }

}

