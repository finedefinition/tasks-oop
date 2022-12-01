package methodoverloading;

public class Solution {
    public static void main(String[] args) {
        Integer a = new Integer(6);
        print(a);
        print(5);
    }

    public static void print(int a) {
        System.out.println(a);
    }

    public static void print(Integer a) {
        System.out.println(a);
    }


}