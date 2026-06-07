public class Test198{
    public static void main(String[] args){

        myMethod(0,0,"");

    }
    public static void myMethod(int col,int row ,String path){

        if(col == 2 && row == 2){
            System.out.println(path);
            return;
        }

        if(col < 2){
            myMethod(col+1,row,path+"R");
        }

        if(row < 2){
            myMethod(col,row+1,path+"D");
        }





    }
}