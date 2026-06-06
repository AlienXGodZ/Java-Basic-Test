public class Test194{
    public static void main(String[] args){

        myMethod("ABC"," ",0);

    }
    public static void myMethod(String str,String ans,int index){

        if(index == str.length()){
            System.out.println(ans);
            return;
        }

        myMethod(str,ans+str.charAt(index),index+1);


        myMethod(str,ans,index+1);



    }
}