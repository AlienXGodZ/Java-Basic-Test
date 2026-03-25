//Count Occurrence of Each Word.

public class Test77 {
    public static void main(String[] args) {
        String letters = "java java is easy java";

        String[] word = letters.split(" ");

        boolean[] condition = new boolean[word.length];

        for (int i = 0; i < word.length; i++) {
            if (condition[i] == true) {
                continue;
            }

            int count = 1;
            for (int j = i + 1; j < word.length; j++) {
                if (word[i].equals(word[j])) {
                    count = count + 1;
                    condition[j] = true;
                }
            }
            System.out.println(word[i] + " = " + count);
        }
    }
}
