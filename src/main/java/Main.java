import java.util.Scanner;

public class Main {
    public static final String pusto = "-------------------------------------\n"; // Разделитель

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Создаём экземпляр класса Scanner.

        int maxCar = 3; // max авто
        Cars[] cars = new Cars[maxCar]; // массив авто
        Race race = new Race(); //объект Race

        //Запрашиваем у пользователя 3 автомобиля
        for (int i = 0; i < maxCar; i++) {
            System.out.printf(Main.pusto + "— Введите название машины № %d: ", i + 1);
            String model = scanner.nextLine();


            //Проверяем, что введённая скорость >0 и ⩽250
            int speed = 0;
            while (true) {
                System.out.printf("— Введите скорость машины № %d: ", i + 1);

                if (scanner.hasNextInt()) {
                    speed = scanner.nextInt();
                    scanner.nextLine(); // очищаем отступ после nextInt
                    if (speed > 0 && speed <= 250) {
                        break;
                    } else {
                        System.out.println("— Неправильная скорость");
                    }
                } else {
                    System.out.println("— Введите ниже целое число");
                    scanner.next(); // очищаем неверный ввод
                }
            }
            cars[i] = new Cars(model, speed); // Добавляем в массив новую машину
        }


        System.out.println(Main.pusto);
        race.resultRace(cars);
    }
}