package Basics.ForEach;

public class Task1 {

    public static void main(String[] Args) {
        int[] array = new int[3];

        System.out.println("Элементы массива array выведены с помощью цикла for:");
        for (int i = 0; i < array.length; i++) {
            int element = array[i];
            System.out.print(element + " ");
        }
        System.out.println("");

        System.out.println("Элементы массива array выведены с помощью цикла foreach:");
        for (int element: array) {
            System.out.print(element + " ");
        }
    }
}
