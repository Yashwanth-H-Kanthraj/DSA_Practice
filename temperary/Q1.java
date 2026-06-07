public class Q1 {
    public static void main(String[] args) {
        Q1 obj = new Q1();
        obj.pattern(4);

    }
    public void pattern(int n) {
        int leftNum = 1;
        int rightStart = n * (n + 1) / 2 + n + 3;  // 17 for n=4


            for (int j = 0; j < numsInRow; j++) {
                System.out.print((rightStart + j) + " ");
            }

            // FIXED: Update rightStart
            rightStart = rightStart - numsInRow + 1;  // Changed here!

            System.out.println();
        }
    }
}
