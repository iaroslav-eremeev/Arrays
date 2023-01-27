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

    /**
     * 27. frequent
     * Дан массив целых чисел. Не изменяя массива определить, какое число в этом массиве встречается чаще всего.
     * Если таких чисел несколько, выведите см. способы реализации.
     * Решение оформить двумя способами:
     * -Вернуть первый элемент, удовлетворяющий условиям задачи
     * -Вернуть все элементы, удовлетворяющие условиям задачи, используя дополнительный массив
     */
    public int frequent(int[] array){
        if (array.length > 0){
            int frequent = array[0];
            int frequentCount = 1;
            boolean atLeastTwoFrequents = false;
            for (int i : array) {
                int iCount = 0;
                for (int j : array) {
                    if (i == j) iCount++;
                }
                if (iCount > frequentCount) {
                    frequent = i;
                    frequentCount = iCount;
                    atLeastTwoFrequents = false;
                }
                else if (iCount == frequentCount) atLeastTwoFrequents = true;
            }
            if (atLeastTwoFrequents) throw new IllegalArgumentException("There are at least two frequents in the array. " +
                    "\nYou should use multipleFrequent(array) instead");
            return frequent;
        }
        else throw new IllegalArgumentException("Array is empty!");
    }

    public int[] multipleFrequent(int[] array){
        int frequentCount = 1;
        for (int i : array) {
            int iCount = 0;
            for (int j : array) {
                if (i == j) iCount++;
            }
            if (iCount > frequentCount) {
                frequentCount = iCount;
            }
        }
        int frequentsNumber = 0;
        for (int i = 0; i < array.length; i++) {
            int iCount = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) iCount++;
            }
            if (iCount == frequentCount) {
                boolean repeat = false;
                for (int k = 0; k < i; k++) {
                    if (array[k] == array[i]){
                        repeat = true;
                    }
                }
                if (!repeat) frequentsNumber++;
            }
        }
        if (frequentsNumber < array.length){
            int[] frequentsArray = new int[frequentsNumber];
            for (int i = 0, frArI = 0; i < array.length; i++) {
                int iCount = 0;
                for (int j = 0; j < array.length; j++) {
                    if (array[i] == array[j]) iCount++;
                }
                if (iCount == frequentCount) {
                    boolean repeat = false;
                    for (int k = 0; k < i; k++) {
                        if (array[k] == array[i]){
                            repeat = true;
                        }
                    }
                    if (!repeat) {
                        frequentsArray[frArI] = array[i];
                        frArI++;
                    }
                }
            }
            return frequentsArray;
        }
        else return array;
    }

    /**
     * 39. equalItems
     * Дан массив. Найдите элементы, равные друг другу.
     * Использовать массив для хранения элементов
     * (для определения количества равных использовать метод из задачи  23)
     */
    public int[][] equalItems(int[] array){
        int[][] answer = new int[countEqualPairs(array)][2];
        for (int i = 0, k = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    answer[k][0] = array[i];
                    answer[k][1] = array[j];
                    k++;
                }
            }
        }
        return answer;
    }
}
