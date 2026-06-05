public class Test190 {
    public static void main(String[] args){

        String str1 = "Java Is Fun";
        myMethod(str1,0,' ');
    }
    public static void myMethod(String str1,int index,char str2){

        if(str1.length() == index){
            return;
        }

        if(str1.charAt(index) != str2){
            System.out.print(str1.charAt(index));
        }

        myMethod(str1,index+1,str2);



    }


}
