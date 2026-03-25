public class Test92 {
    public static void main(String[] args) {

        String str1 = "abcd";
        String str2 = "cdab";

        if(str1.length() != str2.length()){
            System.out.println("FALSE");
            return;
        }

        int n = str1.length();
        boolean isRotation = false;

        for(int i = 0; i < n; i++){
            String rotated = str1.substring(i) + str1.substring(0, i);

            if(rotated.equals(str2)){
                isRotation = true;
                break;
            }
        }

        System.out.println(isRotation ? "TRUE" : "FALSE");
    }
}