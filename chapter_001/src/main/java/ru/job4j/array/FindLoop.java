package ru.job4j.array;

/**
 * Finding an element in array.
 *
 * @author Danil Liu (shiliubei@gmail.com)
 * @version $0.1$
 * @since 22.08.18
 */
public class FindLoop {
    /**
     *  finds the required element.
     *
     * @param data array where we will find.
     * @param el   element that need to find.
     * @return rst - array index of the search element or -1 when it's has not.
     */
    public int indexOf(int[] data, int el) {
        int rst = -1;
        for (int index = 0; index <= data.length - 1; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }
}