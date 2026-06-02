public class Test182 {
   public static void main(String[] args){

       int[] array = {10,20,30,40,50};

       System.out.println(myMethod(array,0));


   }

   public static int myMethod(int[] array,int index){

       if(index == array.length-1){
           return array[index];
       }

       int minscore = myMethod(array,index+1);

       if(minscore < array[index]){
           return minscore;
       }
       return array[index];



   }
}
