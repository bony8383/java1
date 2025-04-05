package basics.aizat;

public class CarSalon {

        private Car[] cars;
        private int count;

        public CarSalon(int size) {
            cars = new Car[size];
            count = 0;
        }

        public void addCar(Car car) {
            if (count < cars.length) {
                cars[count] = car;
                count++;
            }
        }

        public void showAllCars() {
            if (count == 0) {
                System.out.println("Салондо азырынча машиналар жок.");
            } else {
                for (int i = 0; i < count; i++) {
                    System.out.println((i + 1) + ". " + cars[i]);
                }
            }
        }

        public double getTotalPrice() {
            double total = 0;
            for (int i = 0; i < count; i++) {
                total += cars[i].getPrice();
            }
            return total;
        }

        public void findExpensiveCars(double minPrice) {
            boolean found = false;
            for (int i = 0; i < count; i++) {
                if (cars[i].getPrice() >= minPrice) {
                    System.out.println(cars[i]);
                    found = true;
                }
            }
            if (!found) {
                System.out.println("Көрсөтүлгөн суммадан кымбат машиналар табылган жок.");
            }
        }


}
