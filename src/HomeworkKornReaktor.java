import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HomeworkKornReaktor {
    public static void main(String[] args) {


        List<Double> grad = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {

            double gradInReactor = scanner.nextDouble();
            grad.add(gradInReactor);


            double sum = grad.get(0);
            grad.add(sum);


            for (int i = 0; i < grad.size(); i++) {
                sum += grad.get(i);

            }
            grad.add(sum);
            double average = sum / grad.size();
            grad.add(average);

            System.out.println(average);

            double startTemp = average;
            double lastTemp = gradInReactor;
            double res = startTemp - lastTemp;
            grad.add(res);
            System.out.println(res);



            for (int i = 0; i < grad.size(); i++) {


                if ((lastTemp + (lastTemp * 0.1)) > startTemp && ((lastTemp + (lastTemp * 0.2))>(lastTemp-1))) {
                    System.out.println("Тревога, превышение температуры");


                }
            }






        }


    }


}


//
//
//


//1) Пользователь бесконечно вводит числа в программу - температуру ядерного реактора.
//2) После КАЖДОГО введеного числа сообщите пользователю информацию:
//        2.1) Среднее значение температуры ядерного за ВСЕ время
//2.2) Насколько текущая введеная температура отличается от предыдущей
//2.3) Если введеная температура превышает среднюю на 10% и повысилась относительно предыдущего значения более, чем на 20%,
//То напишите на экран собщение "Тревога, превышение температуры"
//
//Усложненное задание:
//        3.1) Рассчитайте также среднюю температуру за 10 последних измерений и среднюю температуру каждого 100ого измерения