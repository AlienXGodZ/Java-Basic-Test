public class Test121 {
    public static void main(String[] args) {

        String[] arr = {"flower", "flow", "flight", "slow"};

        String prefix = arr[0]; // take first word

        for (int i = 1; i < arr.length; i++) {

            String current = arr[i];
            String temp = "";

            int minLength;

            if (prefix.length() < current.length()) {
                minLength = prefix.length();
            } else {
                minLength = current.length();
            }

            for (int j = 0; j < minLength; j++) {

                if (prefix.charAt(j) == current.charAt(j)) {
                    temp = temp + prefix.charAt(j);
                } else {
                    break;
                }
            }

            prefix = temp; // update prefix

            if (prefix.equals("")) {
                break;
            }
        }

        System.out.println("Longest Common Prefix: " + prefix);
    }
}