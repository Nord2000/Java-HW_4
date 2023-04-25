// Task_4

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class SumOfTwoNumbers {

    public static Deque<Integer> sum(Deque<Integer> d1, Deque<Integer> d2) {
        // инициализируем пустой результирующий deque
        Deque<Integer> result = new ArrayDeque<>();

        // используем переменную для сложения остатка при переносе в следующий разряд
        int carry = 0;

        // пока есть элементы в обеих deque
        while (!d1.isEmpty() && !d2.isEmpty()) {
            // берем элементы из deque и складываем их
            int sum = d1.removeFirst() + d2.removeFirst() + carry;
            // вычисляем остаток и добавляем его в результирующий deque
            result.addLast(sum % 10);
            // обновляем переменную переноса
            carry = sum / 10;
        }

        // если остались элементы только в одной deque
        while (!d1.isEmpty()) {
            int sum = d1.removeFirst() + carry;
            result.addLast(sum % 10);
            carry = sum / 10;
        }

        while (!d2.isEmpty()) {
            int sum = d2.removeFirst() + carry;
            result.addLast(sum % 10);
            carry = sum / 10;
        }

        // если есть остаток после выполнения всех операций со всеми разрядам
        if (carry != 0) {
            result.addLast(carry);
        }

        // возвращаем результирующий deque
        return result;
    }
    public static void main(String[] args) {
        Deque<Integer> d1 = new ArrayDeque<>(Arrays.asList(1,8,6));
        Deque<Integer> d2 = new ArrayDeque<>(Arrays.asList(5,4,7));
        
        System.out.println(SumOfTwoNumbers.sum(d1, d2)); // [6,6,0,1]
    }
}


