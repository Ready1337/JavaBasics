package Arrays;

public class Arrays {

    public static void main(String[] Args) {
        /*
        Массивы в Java: https://vertex-academy.com/tutorials/ru/massivy-v-java/
         */

        //Объявление1: <тип>[] <название> = {<элемент1>, <элемент2>, ..., <элементN>};
        int[] array1 = {1, 2, 3};

        //У массива можно посмотреть длину
        int lengthOfArray1 = array1.length;
        //Выведет 3
        System.out.println("Длинна массива array1: " + lengthOfArray1);

        //Объявление2: <тип>[] <название> = new <тип>[размер];
        int[] array2 = new int[4];

        //По умолчанию пустой массив иницилизируется определенными значениями: для каждого типа свое
        System.out.println("Элементы массива array2:");
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + " ");
        }
    }
}
