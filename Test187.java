public class Test187 {
    public static void main(String[] args){

        myMethod("JAVA",0);


    }
    public static void myMethod(String str,int index){

        if(index == str.length()){
            return;
        }

        myMethod(str,index+1);
        System.out.println(str.charAt(index));

    }
}
