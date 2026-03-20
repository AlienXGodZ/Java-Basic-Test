// reverse string

public class Test3 {
    public static void main(String[] args) {
        String letter = "Allen Harvey";
        String store = "";

        for (int last = letter.length() -1; last >= 0;last-- ){
            store = store + letter.charAt(last);


        }
          System.out.print("\"");
          System.out.print(store);
          System.out.println("\"");
    }
}