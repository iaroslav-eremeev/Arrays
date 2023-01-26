package com.iaroslaveremeev.arrays;

public class ArrayUtil {

    /**
     * 23. countEqualPairs без использования ArrayList
     * Дан массив целых чисел. Посчитайте, сколько в нем пар элементов, равных друг другу.
     * Считается, что любые два элемента, равные друг другу образуют одну пару, которую необходимо посчитать.
     */
    public int countEqualPairs(int[] array){
        int pairsNumber = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) pairsNumber++;
            }
        }
        return pairsNumber;
    }

    /**
     * 24. countDifferent
     * Дан массив целых чисел. Посчитайте, сколько в нем различных элементов, не изменяя самого массива.
     * Указание:
     * Необходимо считать те элементы, которые встретились нам впервые.
     * Чтобы проверить, встретился ли нам элемент A[i] впервые,
     * необходимо проверить, встречается ли значение A[i] среди элементов с индексами, меньшими i.
     */
    public int countDifferent(int[] array){
        if (array.length > 0){
            int diffNumbers = 1;
            for (int i = 1; i < array.length; i++) {
                boolean found = false;
                for (int j = i - 1; j >= 0; j--) {
                    if (array[i] == array[j]) {
                        found = true;
                        break;
                    }
                }
                if (!found) diffNumbers++;
            }
            return diffNumbers;
        }
        else return 0;
    }

    /**
     * 26. unique
     * Дан массив целых чисел. Выведите те его элементы, которые встречаются в массиве только один раз.
     * Элементы нужно выводить в том порядке, в котором они встречаются в массиве.
     * Использовать вспомогательный массив для хранения элементов
     */
    public int[] unique(int[] array){
        if (array.length > 0){
            int answerArraySize = 0;
            int[] uniqueRepo = new int[array.length];
            for (int i = 0; i < array.length; i++) {
                boolean found = false;
                for (int j = i + 1; j < array.length; j++) {
                    if (array[i] == array[j]) {
                        found = true;
                        break;
                    }
                }
                for (int j = i - 1; j >= 0; j--) {
                    if (array[i] == array[j]) {
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    uniqueRepo[answerArraySize] = array[i];
                    answerArraySize++;
                }
            }
            if (answerArraySize < array.length){
                int[] uniqueAnswerArray = new int[answerArraySize];
                System.arraycopy(uniqueRepo, 0, uniqueAnswerArray, 0, answerArraySize);
                return uniqueAnswerArray;
            }
            else return array;
        }
        else return null;
    }
}
