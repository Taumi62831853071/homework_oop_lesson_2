import transport.Car;

import java.time.LocalDate;

public abstract class Main {
    public static void main(String[] args) {

        Car car1 = new Car("Lada","Granta",1.7,"желтого",2015,"России");
        System.out.println(car1.isCorrectRegNumber());
        car1.setTransmission("МКПП");
        car1.setBodyType("седан, лифтбек");
        car1.registrationNumber = "a000aa000";
        car1.winterTires = false;



        Car car2 = new Car("Audi","A8 50 L TDI quattro",3.0,"черного",2020,"Германии");
        System.out.println(car2.isCorrectRegNumber());
        car2.setTransmission("АКПП");
        car2.setBodyType("Седан");
        car2.registrationNumber = "b111bb111";
        car2.winterTires = true;



        Car car3 = new Car("BMW","Z8",3.0,"черного",2021,"Германии");
        System.out.println(car3.isCorrectRegNumber());
        car3.setTransmission("МКПП");
        car3.setBodyType("Родстер");
        car3.registrationNumber = "c222cc222";
        car3.winterTires = true;



        Car car4 = new Car("Kia","Sportage 4-поколения",2.4,"красного",2018,"Южной Корееи");
        System.out.println(car4.isCorrectRegNumber());
        car4.setTransmission("МКПП, АКПП, Робот");
        car4.setBodyType("Универсал");
        car4.registrationNumber = "d333dd333";
        car4.winterTires = false;



        Car car5 = new Car("Hyundai","Avante",1.6,"ораньжевого",2016,"Южной Корее");
        System.out.println(car5.isCorrectRegNumber());
        car5.setTransmission("АКПП");
        car5.setBodyType("Седан");
        car5.registrationNumber = "e444ee444";
        car5.winterTires = true;


        printInfo(car1);
        printInfo(car2);
        printInfo(car3);
        printInfo(car4);
        printInfo(car5);
    }


    private static void printInfo(Car car) {
        System.out.println(car.getBrand() + " " + car.getModel() + ", год выпуска: " + car.getYear() + ", страна сборки: " + car.getCountry() + " цвет кузова: " + car.getBodyType() + " объём двигателя: " + car.engineVolume + " коробка передач: " + car.transmission + " тип кузова " + car.getBodyType() + " рег. номер " + car.registrationNumber + " коллтчество мест: " + car.getNumberOfSeats() + ", " + (car.isWinterTires()?"зимняя":"летняя")+ " резина" + ", " + (car.getKey().isKeylessAccess() ? "Безключевой доступ" : "Ключевой доступ") + ", " + (car.getKey().isRemoteEngineStart() ? "Удалённый запуск" : "Обычный запуск") + ", " + (car.getKey().isKeylessAccess() ? "Безключевой доступ" : "Ключевой доступ") + ", номер страховки: " + car.getInsurance().getNumber() + ", Стоимость страховки: " + car.getInsurance().getCost() + ", Срок действия страховки: " + car.getInsurance().getExpireDate());
    }

}