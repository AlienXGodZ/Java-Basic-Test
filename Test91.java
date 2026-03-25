//Check if Two Strings are Rotations using built in
public class Test91 {
    public static void main(String[] args) {

        String str1 = "abcd";
        String str2 = "cdab";

        if(str1.length() != str2.length()){
            System.out.println("FALSE");
        } else {
            String temp = str1 + str1;

            if(temp.contains(str2)){
                System.out.println("TRUE");
            } else {
                System.out.println("FALSE");
            }
        }
    }
}