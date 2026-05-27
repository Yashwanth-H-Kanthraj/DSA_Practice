package com.f09_patterns;

public class Pattern {

    static void main(String[] args) {
        Pattern obj = new Pattern();
        obj.pattern17(5);
    }

    public void pattern1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void pattern2(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void pattern3(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void pattern4(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public void pattern5(int n) {
        for (int i = 1; i <= 2 * n - 1; i++) {
            int stars;
            if (i > n) stars = 2 * n - i;
            else stars = i;

            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void pattern6(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = n - i + 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void pattern7(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void pattern8(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }

    }

    public void pattern9(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * (n - i) - 1; j++) {
                System.out.print('*');
            }
            for (int j = 0; j < i + 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public void pattern10(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            int stars = 2 * i + 1;
            for (int j = 0; j < stars; j++) {
                if (j % 2 == 1) System.out.print(" ");
                else System.out.print("*");
            }
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public void pattern11(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * (n - i) - 1; j++) {
                if (j % 2 == 1) System.out.print(" ");
                else System.out.print("*");
            }
            for (int j = 0; j < i + 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public void pattern12(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * (n - i) - 1; j++) {
                if (j % 2 == 1) System.out.print(" ");
                else System.out.print("*");
            }
            for (int j = 0; j < i + 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                if (j % 2 == 1) System.out.print(" ");
                else System.out.print("*");
            }
            for (int j = 0; j < n + -i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public void pattern12A(int n) {
        for (int i = 0; i < 2 * n - 1; i++) {
            int row = i < n ? i : 2 * n - 2 - i;
            System.out.print(" ".repeat(row));
            for (int j = 0; j < n - row; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public void pattern13(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(" ".repeat(n - i));
            if (i == n - 1) System.out.print("*".repeat(2 * n - 1));
            else {
                for (int j = 0; j < 2 * i + 1; j++)
                    if (j == 0 || j == 2 * i) System.out.print("*");
                    else System.out.print(" ");
            }
            System.out.print(" ".repeat(n - i));
            System.out.println();
        }
    }

    public void pattern14(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(" ".repeat(i + 1));

            if (i == 0) System.out.print("*".repeat(2 * n - 1));
            else {
                for (int j = 0; j < 2 * (n - i) - 1; j++) {
                    if (j == 0 || j == 2 * (n - i) - 2) System.out.print("*");
                    else System.out.print(" ");
                }
            }
            System.out.print(" ".repeat(i + 1));
            System.out.println();
        }
    }

    public void pattern15(int n) {
        for (int i = 0; i < 2 * n - 1; i++) {
            int starsCount = i < n ? i : 2 * n - i - 2;

            System.out.print("_".repeat(n - starsCount - 1));

            for (int j = 0; j < 2 * starsCount + 1; j++) {
                if (j == 0 || j == 2 * starsCount) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.print("_".repeat(n - starsCount - 1));

            System.out.println();
        }
    }

    public void pattern16() {

    }

    public void pattern17(int n) {
        for (int i = 0; i < 2 * n - 1; i++) {
            int space = i < n ? n - i - 1 : i - n + 1;
            int starsCount = i < n ? 2 * i + 1 : 4 * n - 2 * i - 3;

            System.out.print(" ".repeat(space));

            for (int j = 1; j <= starsCount; j++) {
                System.out.print(j);
            }
            System.out.print(" ".repeat(space));
            System.out.println();
        }

    }

    public void pattern18(int n) {
        for (int i = 0; i < 2 * n; i++) {
            int stars = i < n ? n - i : i - n + 1;
            System.out.print("*".repeat(stars));

            int space = i < n ? 2 * i : 4 * n - 2 * i - 2;
            System.out.print(" ".repeat(space));

            System.out.print("*".repeat(stars));

            System.out.println();

        }
    }

    public void pattern19(int n) {
        for (int i = 0; i < 2 * n - 1; i++) {

            int stars = i < n ? i + 1 : 2 * n - i - 1;
            System.out.print("*".repeat(stars));

            int space = i < n ? 2 * (n - i) - 2 : 2 * (i - n) + 2;
            System.out.print(" ".repeat(space));

            System.out.print("*".repeat(stars));

            System.out.println();
        }
    }

    public void pattern20(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0 || i == n - 1 || j == n - 1) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }

    public void pattern21(int n) {
        int num = 1;
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < i + 1; j++) {
                System.out.print(" " + num);
                num++;
            }
            System.out.println();
        }
    }

    public void pattern22(int n) {
        int num = 1;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) num = 1;
            else num = 0;
            for (int j = 0; j < i + 1; j++) {
                System.out.print(num + " ");
                num = 1 - num;
            }
            System.out.println();
        }
    }

    public void pattern23(int n) {
        for (int i = 0; i < 3; i++) {
        }

    }


}