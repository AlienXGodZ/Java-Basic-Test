public class Test191 {
    public static void main(String[] args){

        myMethod("banana",'a','x',0);
    }
    public static void myMethod(String str, char str1,char replace ,int index){

        if(str.length() == index ){
            return;
        }

        if(str.charAt(index) != str1){
            System.out.print(str.charAt(index));
        }else{
            System.out.print(replace);
        }

        myMethod(str,str1,replace,index+1);



    }

}
