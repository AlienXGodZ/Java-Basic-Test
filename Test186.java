public class Test186 {
    static int count = 0;
    public static void main(String[] args){

        myMethod("java",0);
        System.out.println(count);

    }

    public static void myMethod(String str , int index){

        if(index == str.length()){
            return;
        }

        count++;
        myMethod(str,index+1);

    }
}
