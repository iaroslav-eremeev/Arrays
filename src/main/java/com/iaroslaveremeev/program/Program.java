package com.iaroslaveremeev.program;

import com.iaroslaveremeev.arrays.ArrayUtil;

import java.util.Arrays;
import java.util.Collections;

public class Program {
    public static void main(String[] args) {
        /**
         * 1.	В среде разработки IntelliJ Idea создать новый maven проект с названием ArraysWork
         * 2.	Проверить, чтобы структура проекта была следующая: com.вашНик.program.Program, com.вашНик.arrays.ArrayUtil.
         * Если нет, то создать
         * 3.	Проверить, есть ли в классе запускающий метод main. Если нет, то создать
         * 4.	Документируемым комментарием в методе main показать данный текст задания
         * Написать методы для решения следующих задач:
         * 5.	Решить задачи из файла Arrays.docx, отправленного ранее, с номерами 23, 24, 26, 27, 39 не используя ArrayList
         * 6.	Дан массив типа Integer. Отсортировать его в порядке убывания. Использовать стандартные методы из языка
         * 7.	Дан массив. Произвести его копирование с указанием новой длины. Использовать стандартные методы из языка
         * 8.	Используя System.arrayCopy скопировать массив в новый массив, вставляя данные с позиции k.
         * Размер массива результата должен быть явно больше размера исходного массива
         * 9.	Отсортировать массив и найди индекс вхождения заданного ключа в отсортированном массиве.
         * Использовать только стандартные методы языка
         */

        /**
         * 23. countEqualPairs без использования ArrayList
         * Дан массив целых чисел. Посчитайте, сколько в нем пар элементов, равных друг другу.
         * Считается, что любые два элемента, равные друг другу образуют одну пару, которую необходимо посчитать.
         */
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] array23 = new int[]{1, 1, 1, 2, 2, 3};
        System.out.println("countEqualPairs for " + Arrays.toString(array23));
        System.out.println(arrayUtil.countEqualPairs(array23));

        /**
         * 24. countDifferent
         * Дан массив целых чисел. Посчитайте, сколько в нем различных элементов, не изменяя самого массива.
         * Указание:
         * Необходимо считать те элементы, которые встретились нам впервые.
         * Чтобы проверить, встретился ли нам элемент A[i] впервые,
         * необходимо проверить, встречается ли значение A[i] среди элементов с индексами, меньшими i.
         */
        int[] array24 = new int[]{1, 1, 2, 6, 6, 7, 7, 8, 1, 2, 1};
        System.out.println("countDifferent for " + Arrays.toString(array24));
        System.out.println(arrayUtil.countDifferent(array24));

        /**
         * 26. unique
         * Дан массив целых чисел. Выведите те его элементы, которые встречаются в массиве только один раз.
         * Элементы нужно выводить в том порядке, в котором они встречаются в массиве.
         * Использовать вспомогательный массив для хранения элементов
         */
        int[] array26 = new int[]{9, 1, 1, 2, 6, 6, 7, 8, 1, 2, 1, 15};
        System.out.println("unique for " + Arrays.toString(array26));
        System.out.println(Arrays.toString(arrayUtil.unique(array26)));

        /**
         * 27. frequent
         * Дан массив целых чисел. Не изменяя массива определить, какое число в этом массиве встречается чаще всего.
         * Если таких чисел несколько, выведите см. способы реализации.
         * Решение оформить двумя способами:
         * -Вернуть первый элемент, удовлетворяющий условиям задачи
         * -Вернуть все элементы, удовлетворяющие условиям задачи, используя дополнительный массив
         */
        int[] array27 = new int[]{9, 1, 2, 6, 6, 7, 8, 1, 2};
        /*System.out.println("frequent for " + Arrays.toString(array27));
        System.out.println(arrayUtil.frequent(array27));*/
        System.out.println("multiple frequent for " + Arrays.toString(array27));
        System.out.println(Arrays.toString(arrayUtil.multipleFrequent(array27)));

        /**
         * 39. equalItems
         * Дан массив. Найдите элементы, равные друг другу.
         * Использовать массив для хранения элементов
         * (для определения количества равных использовать метод из задачи  23)
         */
        int[] array37 = new int[]{1, 1, 1, 2, 2, 3, 5, 5};
        System.out.println("equalItems for " + Arrays.toString(array37));
        System.out.println(Arrays.deepToString(arrayUtil.equalItems(array37)));

        /**
         * 6. Дан массив типа Integer. Отсортировать его в порядке убывания. Использовать стандартные методы из языка
         */
        Integer[] array6 = new Integer[]{1, 11, 5, 7, 2, 3, 15, 25};
        System.out.println("Descending sorting for " + Arrays.toString(array6));
        Arrays.sort(array6, Collections.reverseOrder()); // descending sorting
        System.out.println(Arrays.toString(array6));

        /**
         * Quick sort
         */
        int[] arrayQS = new int[]{1, 11, 5, 7, 2, 3, 15, 25};
        System.out.println("Quick sort for " + Arrays.toString(arrayQS));
        arrayUtil.quickSort(arrayQS, 0, arrayQS.length - 1);
        System.out.println(Arrays.toString(arrayQS));

        /**
         * Quick sort in reverse order
         */
        int[] arrayQSR = new int[]{1, 11, 5, 7, 2, 3, 15, 25};
        System.out.println("Reverse quick sort for " + Arrays.toString(arrayQSR));
        arrayUtil.quickSortReverse(arrayQSR, 0, arrayQSR.length - 1);
        System.out.println(Arrays.toString(arrayQSR));

        /**
         * 7. Дан массив. Произвести его копирование с указанием новой длины. Использовать стандартные методы из языка
         */
        int[] arrayToCopy = new int[]{1, 2, 5, 3, 10, 11, 10};
        System.out.println("Copying array " + Arrays.toString(arrayToCopy));
        int[] copiedArray = Arrays.copyOf(arrayToCopy, arrayToCopy.length);
        System.out.println(Arrays.toString(copiedArray));

        System.out.println("Copying part of array " + Arrays.toString(arrayToCopy) + " with copyArray method");
        int[] copiedArray2 = arrayUtil.copyArray(arrayToCopy, 4);
        System.out.println(Arrays.toString(copiedArray2));
        System.out.println("Copying array " + Arrays.toString(arrayToCopy) +
                " with copyArray method but new array is bigger");
        int[] copiedArray3 = arrayUtil.copyArray(arrayToCopy, 15);
        System.out.println(Arrays.toString(copiedArray3));

        /**
         * 8. Используя System.arrayCopy скопировать массив в новый массив, вставляя данные с позиции k.
         * Размер массива результата должен быть явно больше размера исходного массива
         */
        System.out.println("Copying array " + Arrays.toString(arrayToCopy) + " from index 2");
        int[] copiedArraySystem = new int[arrayToCopy.length + 2];
        System.arraycopy(arrayToCopy, 2, copiedArraySystem, 0, arrayToCopy.length - 3);
        System.out.println(Arrays.toString(copiedArraySystem));

        /**
         * 9. Отсортировать массив и найди индекс вхождения заданного ключа в отсортированном массиве.
         * Использовать только стандартные методы языка
         */
        int[] arrayToFindKey = new int[]{1, 2, 10, 4, 6, 11, 3};
        System.out.println("Finding key in the sorted array for " + Arrays.toString(arrayToFindKey));
        Arrays.sort(arrayToFindKey);
        System.out.println("Sorted: " + Arrays.toString(arrayToFindKey));
        System.out.println(Arrays.binarySearch(arrayToFindKey, 10));

        /**
         * My own indexOf() for primitives (not sorted array)
         */
        int[] arrayToFindKey2 = new int[]{1, 2, 10, 4, 6, 11, 3};
        System.out.println("Finding 6 in an unsorted array of ints " + Arrays.toString(arrayToFindKey2));
        System.out.println(arrayUtil.indexOfPrimitive(arrayToFindKey2, 6));
    }
}
