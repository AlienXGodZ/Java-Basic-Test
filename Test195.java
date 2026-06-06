public class Test195 {

    static int count = 0 ;

    public static void main(String[] args){

        myMethod("ABC","",0);
        System.out.println(count);
    }

    public static void myMethod(String str,String ans,int index){

        if(index == str.length()){
            count++;
            return;
        }

        myMethod(str,ans+str.charAt(index),index+1);


        myMethod(str,ans,index+1);


    }

}
