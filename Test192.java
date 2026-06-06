public class Test192 {
    public static void main(String[] args){

        String str = "java";
        for (int i = 0; i < str.length(); i++) {
            System.out.println(myMethod(str,i, 1+i));
            System.out.println();
        }
    }
    public static String myMethod(String str,int startindex,int lastindex){

        if(str.length() == lastindex){
            return str.substring(startindex,lastindex);
        }

        System.out.println(str.substring(startindex,lastindex));


        return myMethod(str,startindex,lastindex+1);


    }
}
