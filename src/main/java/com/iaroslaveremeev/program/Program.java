package com.iaroslaveremeev.program;

import com.iaroslaveremeev.arrays.ArrayUtil;

import java.util.Arrays;

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
    }
}
