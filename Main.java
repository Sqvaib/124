public class Main {

    static Car[] getCarByBrend(Car[] cars, String brend) {
            int len = cars.length;
            Car[] brended_cars = new Car[len];
            int l = 0;
            for (int i = 0; i < len; ++i) {
                if (cars[i].getMake() == brend) {
                    brended_cars[l] = cars[i];
                    l++;
                }
            }
            Car[] result = new Car[l];
            for (int i = 0; i < l; i++) {
                result[i] = brended_cars[i];
            }
            return result;
        }
    static Car[] getCarByBrendAndYearOperational(Car[] cars, String brend, int years) {
            int len = cars.length;
            Car[] brended_cars = new Car[len];
            int l = 0;
            for (int i = 0; i < len; ++i) {
                if (cars[i].getMake() == brend) {
                    if (2025 - cars[i].getYear() >= years) {
                        brended_cars[l] = cars[i];
                        l++;
                    }
                }
            }
            Car[] result = new Car[l];
            for (int i = 0; i < l; i++) {
                result[i] = brended_cars[i];
            }
            return result;
    }
    public static void print(Car[] test) {
        int l = test.length;
        for (int i = 0; i < l; i++) {
            Car prnt = test[i];
            System.out.println(prnt.getId() + " ");
            System.out.println(prnt.getMake() + " ");
            System.out.println(prnt.getModel() + " ");
            System.out.println(prnt.getYear() + " ");
            System.out.println(prnt.getColor() + " ");
            System.out.println(prnt.getCost() + " ");
            System.out.println(prnt.getLicensePlate() + "\n");
        }
    }
    public static void main(String[] args) {
        Car bebe = new Car(1, "audi", "TT", 2003, "yellow", 15000, "A777YE");
        Car babe = new Car(2, "honda", "civic", 2001, "white", 12000, "P228CP");
        Car bibe = new Car(3, "nissan", "carina", 1966, "black", 4000, "B004KO");
        Car bube = new Car(4, "chevrolet", "corvette", 2005, "blue", 30000, "B123AK");
        Car bobe = new Car(5, "mitsubishi", "lancer", 2003, "red", 1200, "T888TT");
        Car[] testing_cars = new Car[] {bla, bly, ble, bli, blo};
        Car[] test2 = getCarByBrendAndYearOperational(testing_cars, "chevrolet", 30);
        print(test2);        
        }
}