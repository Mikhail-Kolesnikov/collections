import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        //подряд вводятся оценки студентов по стобальной системе
        //колво оценок не ограничено, но когда вводиться значение -1 = конец записи
        // найдите самую низкую оценку

        List<Integer> marks = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int value = scanner.nextInt();

            if (value == -1) {
                break;
            }

            marks.add(value);
        }
        int min = marks.get(0);
        for (int i = 0; i < marks.size(); i++) {
            int element = marks.get(i);
            if (element < min) {
                min = element;
            }

        }
        System.out.println(min);
    }
}
