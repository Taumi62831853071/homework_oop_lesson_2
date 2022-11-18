import java.sql.SQLOutput;

public class Main {

    static class JustKillMeAlready {

        public static void composition(Bouquet[] arr) {
            for (byte i = 0; i < arr.length; i++) {
                if (arr[i].getNumberOfFlowers() > 0) {
                    System.out.print(arr[i].getFlower() + " " + arr[i].getNumberOfFlowers() + " - шт, ");
                }
            }
        }
        public static void minLifeSpan(Bouquet[] arr) {
            int min = arr[0].getLifeSpan();
            byte k = 0;
            for (byte i = 1; i < arr.length; i++) {
                if (arr[i].getNumberOfFlowers() > 0) {
                    if (arr[i] != null) {
                        {
                            if (min > arr[i].getLifeSpan()) {
                                min = arr[i].getLifeSpan();
                                k = i;
                            }
                        }
                    }
                }
            }

            System.out.print(" " + arr[k] + " дней");

        }
        public static void sumPrice(Bouquet[] arr) {
            float sum = 0f;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].getNumberOfFlowers() > 0) {
                    if (arr[i] != null) {

                        sum += arr[i].getPrice() * arr[i].getNumberOfFlowers();
                    }
                }
            }

            System.out.print("стоимость " + (sum + sum / 10) + " рублей,");

        }

    }

    public static void main(String[] args) {

        Human maxim = new Human(0, "Информация не указана", "Информация не указана", "Информация не указана");
        maxim.name = "Максим";
        maxim.setTown("Минск");
        maxim.setYearOfBirth(1988);
        maxim.jobTitle = "бренд-менеджера";
        maxim.print();
        System.out.println();

        Human anya = new Human(0,"Информация не указана", "Информация не указана", "Информация не указана");
        anya.name = "Аня";
        anya.setTown("Москва");
        anya.setYearOfBirth(1993);
        anya.jobTitle = "методиста образовательных программ";
        anya.print();
        System.out.println();

        Human katya = new Human(0,"Информация не указана", "Информация не указана", "Информация не указана");
        katya.name = "Катя";
        katya.setTown("Калининград");
        katya.setYearOfBirth(1992);
        katya.jobTitle = "продакт-менеджера";
        katya.print();
        System.out.println();

        Human artem = new Human(0,"Информация не указана", "Информация не указана", "Информация не указана");
        artem.name = "Артём";
        artem.setTown("Москва");
        artem.setYearOfBirth(1995);
        artem.jobTitle = "директора по развитию бизнеса";
        artem.print();
        System.out.println();

        Human vladimir = new Human(0,"Информация не указана", "Информация не указана", "Информация не указана");
        vladimir.name = "Владимир";
        vladimir.setTown("Казань");
        vladimir.setYearOfBirth(2001);
        vladimir.jobTitle = "сейчас нигде не работает";
        vladimir.print();
        System.out.println();

        System.out.println();

        Flower rose = new Flower("Белый","России", 1, 3);
        rose.setFlowerColor("Роза обыкновенная");
        rose.setCountry("Голландии");
        rose.setCost(35.59);
        rose.setLifeSpan(0);
        rose.print();
        System.out.println();

        Flower chrysanthemum = new Flower("Белый","России", 1, 3);
        chrysanthemum.setFlowerColor("Хризантема");
        chrysanthemum.setCountry("");
        chrysanthemum.setCost(15.00);
        chrysanthemum.setLifeSpan(5);
        chrysanthemum.print();
        System.out.println();

        Flower peony = new Flower("Белый","России", 1, 3);
        peony.setFlowerColor("Пион");
        peony.setCountry("Англии");
        peony.setCost(69.90);
        peony.setLifeSpan(1);
        peony.print();
        System.out.println();

        Flower gypsophila = new Flower("Белый","России", 1, 3);
        gypsophila.setFlowerColor("Гипсофила");
        gypsophila.setCountry("Турции");
        gypsophila.setCost(19.50);
        gypsophila.setLifeSpan(10);
        gypsophila.print();
        System.out.println();

        Bouquet[] Bouquets = new Bouquet[4];
        Bouquets[0] = new Bouquet(rose.getFlowerColor(), rose.getCost(), rose.getLifeSpan(), 3);
        Bouquets[1] = new Bouquet(chrysanthemum.getFlowerColor(), chrysanthemum.getCost(), chrysanthemum.getLifeSpan(), 5);
        Bouquets[2] = new Bouquet(peony.getFlowerColor(), peony.getCost(), peony.getLifeSpan(), 0);
        Bouquets[3] = new Bouquet(gypsophila.getFlowerColor(), gypsophila.getCost(), gypsophila.getLifeSpan(), 1);

        System.out.println();
        System.out.print("Состав букета: ");
        JustKillMeAlready.composition(Bouquets);
        JustKillMeAlready.sumPrice(Bouquets);
        JustKillMeAlready.minLifeSpan(Bouquets);

    }
}