/*
1. Создать массив дробных (не целых) чисел размером 15 элементов и наполнить его положительными и отрицательными числами,
первые 2 числа в массиве должны быть положительными;
2. Затем через 1 цикл “for each” посчитать среднее арифметическое положительных чисел,
расположенных после первого отрицательного числа и вывести его на экран (8, -2, -4, 2, 3, 6, -7) =  11/3
*/

public class HW_3_Ernist {
    public static void main(String[] args) {
        double[] array = {8, 2, -4, 2, -3, 6, 7, 0, -3, 5, 2, 3, 1, 3, 4};
        boolean flag = false;
        double sum = 0;
        double count = 0;
        for (double elemet : array) {
            if (elemet < 0 && !flag) {
                flag = true;
            }
            if (flag && elemet > 0) {
                sum += elemet;
                count++;
            }
        }

        System.out.println(sum/count);
    }
}
