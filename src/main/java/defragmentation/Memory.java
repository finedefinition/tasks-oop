package defragmentation;

import java.util.Arrays;
import java.util.Objects;

/*
Дефрагментация памяти
*/

public class Memory {

    public static void main(String[] args) {
        String[] memory = {"object15", null, null, "object2", null, null, null, "object32", null, "object4"};
        executeDefragmentation(memory);
        System.out.println(Arrays.toString(memory));
    }

    public static void executeDefragmentation(String[] array) {

        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                array[counter] = array[i];
                counter++;
                if(i != 0){
                    array[i] = null;
                }
            }
        }
    }
}
