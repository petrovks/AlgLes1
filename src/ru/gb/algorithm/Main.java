package ru.gb.algorithm;


import java.math.BigInteger;
import java.util.*;

public class Main {
  //  Определить сложность следующих алгоритмов:
  //    -. Поиск элемента массива с известным индексом    -    O(1)
    //  -. Дублирование одномерного массива через foreach   -   O(n)
    //  -. Удаление элемента массива с известным индексом без сдвига
    //   Удалить элеиент массива можно путем записи в элемнет значение 0  -   O(1)
    //   Если удалить элемент с созданием нового массива  - О(n)
    //  -. Удаление элемента массива с неизвестным индексом без сдвига  -  O(n)
//      -. Удаление элемента массива с неизвестным индексом со сдвига  -  O(n)
//.




    public static void main(String[] args) {
     //   3. Определить сложность следующих алгоритмов. Сколько произойдет итераций?
      //          a)

        int n = 10000;
        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n; j *= 2) {
                arrayList.add(i * j);           // O(n * log n)
            }
        }
       // b)

        int n = 10000;
        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < n; i += 2) {
            for (int j = i; j < n; j++) {       //O(n/2 * n)
                arrayList.add(i * j);
            }
        }
       // с)

        int n = 10000;
        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < n; i ++) {
            for (int j = 0; j < n; j++) {         //O(n^2)
                arrayList.add(i * j);
                n--;
            }
        }
     //   d)
     //       ```

        factorial(BigInteger.valueOf(10000))

        public static BigInteger factorial(BigInteger n) {
            if (n.equals(BigInteger.ONE)) {                     // O(n!)
                return n;
            }
            return n.multiply(factorial(n.subtract(BigInteger.valueOf(1))));
        }

     //   e)
        fib(BigInteger.valueOf(50));

        public static BigInteger fib(BigInteger n) {
            if (n.equals(BigInteger.ONE)) {
                return BigInteger.ZERO;
            }
            if (n.equals(BigInteger.TWO)) {
                return BigInteger.ONE;
            }
            return fib(n.subtract(BigInteger.ONE)).add(fib(n.subtract(BigInteger.TWO)));
        }

    }
}
