public class Test194{
    public static void main(String[] args){

        myMethod("ABC"," ",0);

    }
    public static void myMethod(String str,String ans,int index){

        if(index == str.length()){
            System.out.println(ans);
            return;
        }

        char ch = str.charAt(index);

        myMethod(str,ans+ch,index+1);


        myMethod(str,ans,index+1);



    }
}