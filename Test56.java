// this program merge the two arrays

public class Test56 {
    public static void main(String[] args){
        int[] merge1 = {1,2,3,4,5};
        int[] merge2 = {5,6,7,8,9};
        int index = 0;

        int[] merge = new int [merge1.length + merge2.length];

        for(int i = 0; i < merge1.length ; i++){
            merge[index] = merge1[i];
            index++;
        }

        for(int i = 0; i < merge2.length ; i++){
            merge[index] = merge2[i];
            index++;
        }


        System.out.print(" { ");
        for(int i = 0 ; i < merge.length ; i++){
            if(i == 9) {
                System.out.print(merge[i]);
                break;
            }else{
            System.out.print(merge[i] + " , ");
            }
        }
        System.out.print("  }");
    }
}
