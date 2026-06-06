public class Test196{
    public static void main(String[] args){

        myMethod("ABC","" );

    }
    public static void myMethod(String remaining, String ans){

        if(remaining.length() == 0){
            System.out.println(ans);
            return;
        }

        for(int i = 0 ; i < remaining.length(); i++){

            char cut = remaining.charAt(i);

            String ultraremaining = remaining.substring(0, i) + remaining.substring(i+1);

            myMethod(ultraremaining,ans+cut);



        }





    }

}