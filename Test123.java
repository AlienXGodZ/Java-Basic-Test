//Detect Cycle in Array (Floyd’s cycle logic idea)


public class Test123 {
    public static void main(String[] args) {

        int[] arr = {1, 3, 0, 2};

        int slow = 0;
        int fast = 0;

        boolean hasCycle = false;

        while (true) {

            slow = arr[slow];          // move 1 step
            fast = arr[arr[fast]];     // move 2 steps

            if (slow == fast) {
                hasCycle = true;
                break;
            }
        }

        if (hasCycle) {
            System.out.println("Cycle Detected");
        } else {
            System.out.println("No Cycle");
        }
    }
}