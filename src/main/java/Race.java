public class Race {
    void resultDay(Cars cars){
        int resultForAllCars = cars.speedCar * 24;
        System.out.printf("Машина [%s] проедет [%d] км за сутки.\n", cars.modelCar, resultForAllCars);
    }
    void resultRace(Cars[] cars) {
        Cars leader = null;
        int maxDistance = 0;

        System.out.println("\nРезультаты гонки:");
        for (Cars car : cars) {
            resultDay(car);
            int distance = car.speedCar * 24;
            if (distance > maxDistance) {
                maxDistance = distance;
                leader = car;
            }
        }

        if (leader != null) {
            System.out.println("\nСамая быстрая машина: " + leader.modelCar);
        }
    }
}