package Basics.BasicOperations;

public class BasicOperations {
    public static void main(String[] Args) {
        /*
        Операторы: https://vertex-academy.com/tutorials/ru/osnovnye-operacii-s-peremennymi-v-java/
         */
        System.out.println("Результаты использования операторов:");
        int k1 = 70;
        int p1 = 10;
        int f1 = 5;
        int m1 = k1+p1;
        System.out.println(m1);
        m1 = m1-30;
        System.out.println(m1);
        int s1 = m1*f1;
        System.out.println (s1);
        s1 = s1/f1;
        System.out.println(s1);
        int z1 = s1 % 3;
        System.out.println(z1);

        //Операторы можно использовать в сокращенном виде:
        System.out.println("Результаты использования операторов в сокращенном виде:");
        int k2 = 70;
        int p2 = 10;
        int f2 = 5;
        int m2 = k2+p2;
        System.out.println(m2);
        m2 -= 30;
        System.out.println(m2);
        int s2 = m2*f2;
        System.out.println (s2);
        s2 /= f2;
        System.out.println(s2);
        int z2 = s2 % 3;
        System.out.println(z2);

        System.out.println("Инкременты:");
        int n3 = 2;
        int k3 = 2;
        int a3 = 2 * n3++; //теперь значение a равно 4, а n равно 3
        int b3 = 2 * ++k3; //теперь значение b равно 6, а k равно 3
        System.out.println(a3);
        System.out.println(n3);
        System.out.println(b3);
        System.out.println(k3);

        System.out.println("Декременты:");
        int n4 = 2;
        int k4 = 2;
        int a4 = 2 * n4--; //теперь значение a равно 4, а n равно 1
        int b4 = 2 * --k4; //теперь значение b равно 2, а k равно 1
        System.out.println(a4);
        System.out.println(n4);
        System.out.println(b4);
        System.out.println(k4);
    }
}
