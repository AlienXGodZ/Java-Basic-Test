public class Test105 {
    public static void main(String[] args) {

        String s1 = "egg";
        String s2 = "ada";

        if (isIsomorphic(s1, s2)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

        public static boolean isIsomorphic (String s1,String s2){
            if(s1.length() != s2.length()){
                return false;
            }
            char[] map1 = new char [256];
            char[] map2 = new char [256];

            for(int i = 0 ; i < s1.length() ; i++){
                char c1 = s1.charAt(i);
                char c2 = s2.charAt(i);

                if(map1[c1] == 0) {
                    map1[c1] = c2;
                }else if(map1[c1] != c2){
                             return false;
                    }

                    if(map1[c2] == 0) {
                        map1[c2] = c1;
                    }else if(map1[c2] != c1){
                        return false;
                    }
                    }
                return true;
            }
        }

