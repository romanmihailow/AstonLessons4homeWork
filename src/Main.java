//#Lessons4

//#Task1
public class Main {
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void main(String[] args) {
        Main.printThreeWords();
    }
}

//#Task2
public class Main {
    public int checkSumSign(int a, int b) {
        if (a + b >= 0) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Main check = new Main();
        int result = check.checkSumSign(-10, 20);
        if (result == 0) {
            System.out.println("Сумма отрицательная");
        } else {
            System.out.println("Сумма положительная");
        }
    }
}

//#Task3
public class Main {

    public int printColour() {
        int value;
        value = 200;
        return value;
    }

    public static void main(String[] args) {

        Main check = new Main();
        int result = check.printColour();


        if (result <= 0) {
            System.out.println("Красный");

        } else if (result > 0 && result <= 100) {
            System.out.println("Желтый");

        } else if (result > 100) {
            System.out.println("Зеленый");
        }
    }
}

//#Task4
public class Main {
    public void compareNumbers() {
        int a = 1000;
        int b = 100;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
            ;
        }

    }


    public static void main(String[] args) {
        Main obj = new Main();
        obj.compareNumbers();


    }

}

//#Task5
public class Main {
    public boolean compNumbers(int a, int b) {

        boolean equals;
        if (a + b >= 10 && a + b <= 20) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        Main compNumbers = new Main();

        System.out.println(compNumbers.compNumbers(10, 8)); // по условию задачи нужно только вернуть, но не выводить
    }


}

//#Task6
public class Main {
    public String checkSign(int a) {

        if (a >= 0) {
            return "Число положительное";
        } else {
            return "Число отрицательное";
        }

    }

    public static void main(String[] args) {
        Main check = new Main();

        System.out.println(check.checkSign(0));
    }


}

//#Task7
public class Main {
    public boolean checkSign(int a) {

        if (a >= 0) {
            return false;
        } else {
            return true;
        }

    }

    public static void main(String[] args) {
        Main check = new Main();

        System.out.println(check.checkSign(0));
    }


}

//#Task8
public class Main {
    public static String printN(String input, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(input);

        }
        return input;
    }

    public static void main(String[] args) {
        Main check = new Main();

        System.out.println(printN("d", 50));
    }


}

//#Task9
public class Main {
    public boolean leapYear(int year) {
        int n = 10000;
        boolean[] leapYears = new boolean[n];
        for (int i = 100; i < n; i = i + 4) {
            if (i % 100 == 0 && i % 400 != 0) {
                leapYears[i] = false;
                continue;
            }
            leapYears[i] = true;
        }
        return leapYears[year];
    }

    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.leapYear(145));
    }
}

//#Task10
public class Main {
    public static void main(String[] args) {
//int i = 10;
        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            } else {
                array[i] = 0;
            }

            System.out.print(array[i]);

        }

    }
}

//#Task11
public class Main {
    public static void main(String[] args) {
        int n = 100;
        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;

            System.out.print(array[i]);

        }

    }
}

//#Task12
public class Main {
    public static void main(String[] args) {

        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] = array[i] * 2;
            }

            System.out.print(array[i]);

        }

    }
}

//#Task13
public class Main {
    public static void main(String[] args) {

        int n = 100;
        int i = n;
        int j = n;
        int[][] array = new int[i][j];
        for (i = 0; i < array.length; i++) {
            for (j = 0; j < array[i].length; j++) {
                if ((i == j) || (j + 1 == n - i)) {
                    array[i][j] = 1;


                }
                System.out.print(array[i][j]);

            }
            System.out.println();

        }


    }
}

//#Task14
public class Main {
    public static int[] getArray(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < len - 1; i++) {
            array[i] = initialValue;
            System.out.print(array[i]);
        }

        return array;

    }


    public static void main(String[] args) {
        int[] array = getArray(30, 7);