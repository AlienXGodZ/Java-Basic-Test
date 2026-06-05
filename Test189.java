public class Test189 {
    static int count = 0;
    public static void main(String[] args){

        myMethod("education" , 0);
        System.out.println(count);


    }
    public static  void myMethod(String str,int ch){

        if(str.length() == ch){
            return ;
        }

        int ch1 = str.charAt(ch);

        if(ch1 == 'a' || ch1 == 'e' || ch1 == 'i' || ch1 == 'o' || ch1 == 'u'){
            count++;
        }

        myMethod(str,ch+1);



    }
}
