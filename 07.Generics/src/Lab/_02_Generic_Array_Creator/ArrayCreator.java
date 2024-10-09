package Lab._02_Generic_Array_Creator;

import java.lang.reflect.Array;

public class ArrayCreator {

    public static <T> T[] create(int length, T item) {
        T[] array = (T[]) Array.newInstance(item.getClass(), length);

        for (int i = 0; i < length; i++) {
            array[i] = item;
        }
        return array;
    }

    public static <T> T[] create(Class<?> clazz, int length, T item) {
        T[] array = (T[]) Array.newInstance(clazz, length);
        for (int i = 0; i < length; i++) {
            array[i] = item;
        }
        return array;
    }
}
