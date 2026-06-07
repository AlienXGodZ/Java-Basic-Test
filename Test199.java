public class Test199 {
    static int count = 0;
    public static void main(String[] args){

        myMethod(0,0,"");
        System.out.println(count);

    }

    public static void myMethod(int col,int row,String path){

        if(row == 2 && col == 2){
            count++;
            return;
        }

        if(row < 2){
            myMethod(col,row+1,path+"R");
        }

        if(col < 2){
            myMethod(col+1,row,path+"D");
        }

    }



}
