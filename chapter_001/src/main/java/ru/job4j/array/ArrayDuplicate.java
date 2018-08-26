package ru.job4j.array;

import java.util.Arrays;
/**
 * Array duplicate.
 *
 * @author Danil Liu (shiliubei@gmail.com)
 * @version $0.1$
 * @since 22.08.18
 */
public class ArrayDuplicate {
    /**
     * remuve duplicates method .
     *
     * @param array initial array of String.
     * @return array - shorter array with unique elements.
     */
    public String[] remuveDuplicates(String[] array) {
        int endIndex = array.length;
        if (array.length > 1) {
            for (int out = 0; out < endIndex; out++) {
                for (int in = out + 1; in < endIndex; in++ ){
                    if(array[out].equals(array[in])){
                        array[in] = array[endIndex-1];
                        endIndex--;
                    }
                }

            }
        }
        return Arrays.copyOf(array,endIndex);
    }
}
