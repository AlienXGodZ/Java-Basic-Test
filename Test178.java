public class Test178 {
    public static void main (String[] args){

        int a = 12;
        int b = 18;
        int x = a;
        int y = b;

        int total = (x * y) / myMethod(12,18);
        System.out.println("lcm " + " " + total);




    }
    public static int myMethod(int a,int b){

        if(b == 0 ){
            return a;
        }

        return myMethod(b , a % b);







    }
}
