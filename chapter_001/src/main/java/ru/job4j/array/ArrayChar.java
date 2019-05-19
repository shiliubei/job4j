package ru.job4j.array;

public class ArrayChar {
    private char[] data;

    public ArrayChar(String line) {
        this.data = line.toCharArray();
    }

    /**
     * Проверяет. что слово начинается с префикса.
     * @param prefix префикс.
     * @return если слово начинается с префикса
     */
    public boolean startWith(String prefix) {
        boolean result = true;
       // char[] value = prefix.toCharArray();
       // if(value.startsWith(value) )
        // проверить. что массив data имеет первые элементы одинаковые с value
        return result;
    }
}