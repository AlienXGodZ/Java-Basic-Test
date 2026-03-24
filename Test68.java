// reverse the word

public class Test68{
    public static void main(String[] args) {
        String letters = "Java is fun";
        String store = "";
        int count = 0;


        for (int i = letters.length() - 1; i >= 0; i--) {
            if (letters.charAt(i) != ' ') {
                store = store + letters.charAt(i);
            } else {
                if (store.length() > 0) {
                    for (int k = store.length()-1; k >= 0; k--) {
                        System.out.print (store.charAt(k));
                    }
                    System.out.print(" ");
                    store = "";
                }
            }
        }
        if(store.length() > 0){
            for(int k = store.length()-1 ; k >= 0 ; k--){
                System.out.print(store.charAt(k));
            }
        }
    }
}


