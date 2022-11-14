package methodoverloading;
/*
В этой задаче тебе предстоит создать универсальный инструмент для поиска
минимальных и максимальных чисел.
В классе MinMaxUtil создай публичные статические методы min() и max(),
которые в качестве аргументов принимают целочисленные (тип int) значения
и возвращают минимальное и максимальное из них соответственно.

Каждый из методов должен быть перегружен так, чтобы была возможность
вызвать метод с двумя, тремя, четырьмя и пятью параметрами.
В общем, необходимо создать 8 методов, — 4 для min() и 4 для max().
Все аргументы методов должны быть типа int.

Требования:
•	В классе MinMaxUtil должно быть создано 4 перегруженных метода min() в
соответствии с условием задания.
•	В классе MinMaxUtil должно быть создано 4 перегруженных метода max() в
соответствии с условием задания.
•	Методы min() должны возвращать минимальное из переданных чисел.
•	Методы max() должны возвращать максимальное из переданных чисел.
 */
public class MinMaxUtil {

    public static int min(int a, int b) {
        return a < b ? a : b;
    }

    public static int min(int a, int b, int c) {
        int[] array = new int [] {a, b, c};
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static int min(int a, int b, int c, int d) {
        int[] array = new int [] {a, b, c, d};
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static int min(int a, int b, int c, int d, int e) {
        int[] array = new int [] {a, b, c, d, e};
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static int max(int a, int b) {
        return a > b ? a : b;
    }

    public static int max(int a, int b, int c) {
        int[] array = new int [] {a, b, c};
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static int max(int a, int b, int c, int d) {
        int[] array = new int [] {a, b, c, d};
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static int max(int a, int b, int c, int d, int e) {
        int[] array = new int [] {a, b, c, d, e};
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}
    class Test extends MinMaxUtil {
        public static void main(String[] args) {
            System.out.println(min(2,3));
            System.out.println(min(2,3,4));
            System.out.println(min(2,3,4,5));
            System.out.println(min(2,3,4,5,6));
            System.out.println(max(2,3));
            System.out.println(max(2,3,4));
            System.out.println(max(2,3,4,5));
            System.out.println(max(2,3,4,5,6));
        }
    }

