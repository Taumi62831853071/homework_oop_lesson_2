package transport;


import java.time.LocalDate;

public class Car {


    private String brand;
    private String model;
    public double engineVolume;
    public String color;
    private int year;
    private String country;
    public String transmission;
    private String bodyType;
    public String registrationNumber;
    private int numberOfSeats;
    public boolean winterTires;
    private Key key;
    private Insurance insurance;

    public Car(String brand, String model, double engineVolume, String color, int year, String country, String transmission, String bodyType, String registrationNumber, int numberOfSeats, boolean winterTires, Key key, Insurance insurance) {
        if (brand == null) {
            this.brand = "default";
        } else this.brand = brand;
        if (model == null) {
            this.model = "default";
        } else this.model = model;
        if (country == null) {
            this.country = "default";
        } else this.country = country;
        this.engineVolume = engineVolume;
        if (color == null) {
            this.color = "белый";
        } else this.color = color;
        this.year = year;
        if (transmission == null) {
            this.transmission = "МКПП";
        } else this.transmission = transmission;
        if (transmission == null) {
            this.registrationNumber = "x000xx000";
        } else this.registrationNumber = registrationNumber;
        if (bodyType == null) {
            this.bodyType = "седан";
        } else this.bodyType = bodyType;
        if (key == null) {
            this.key = new Key();
        } else this.key = key;
        if (insurance == null) {
            this.insurance = new Insurance();
        } else this.insurance = insurance;
        this.numberOfSeats = numberOfSeats;
        this.winterTires = winterTires;
    }

    public Car(String brand,
               String model,
               Double engineVolume,
               String color,
               int year,
               String country) {
        this(
                brand,
                model,
                engineVolume,
                color,
                year,
                country,
                "МКПП",
                "x000xx000",
                "седан",
                5,
                false,
                new Key(),
                new Insurance()
        );
        this.transmission = "МКПП";
        this.registrationNumber = "x000xx000";
        this.bodyType = "седан";
        this.numberOfSeats = 5;
        this.winterTires = false;
    }

    public void setTransmission(String transmission) {
        if (transmission == null) {
            this.transmission = "МКПП";
        } else {
            this.transmission = transmission;
        }
    }
    public boolean isWinterTires() {
        return winterTires;
    }
    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public int getYear() {
        return year;
    }
    public String getCountry() {
        return country;
    }
    public String getBodyType() {
        return bodyType;
    }
    public void setBodyType(String bodyType) {

        this.bodyType = bodyType;
    }
    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void changeTyres() {
        winterTires = !winterTires;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public Key getKey() {
        return key;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }

    public boolean isCorrectRegNumber() {
        if (registrationNumber.length() != 9) {
            return false;
        }
        char[] chars = registrationNumber.toCharArray();
        if (!Character.isAlphabetic(chars[0]) || !Character.isDigit(chars[1]) || !Character.isDigit(chars[2]) || !Character.isDigit(chars[3]) || !Character.isAlphabetic(chars[4]) || !Character.isAlphabetic(chars[5]) || !Character.isDigit(chars[6]) || !Character.isDigit(chars[7]) || !Character.isDigit(chars[8])) {
            return false;
        } else return true;
    }
    public static class Key {

        private final boolean remoteEngineStart;
        private final boolean keylessAccess;

        public Key (boolean remoteEngineStart, boolean keylessAccess) {
            this.remoteEngineStart = remoteEngineStart;
            this.keylessAccess = keylessAccess;
        }
        public Key () {
            this(false,false);
        }

        public boolean isRemoteEngineStart() {
            return remoteEngineStart;
        }
        public boolean isKeylessAccess() {
            return keylessAccess;
        }
    }

    public static class Insurance {
        private final LocalDate expireDate;
        private final double cost;
        private final String number;

        public Insurance(LocalDate expireDate, double cost, String number) {
            if(expireDate == null) {
                this.expireDate = LocalDate.now().plusDays(365);
            } else this.expireDate = expireDate;
            this.cost = cost;
            if(number == null) {
                this.number = "123456789";
            } else this.number = number;
        }

        public Insurance() {
            this(null, 10_000, null);
        }

        public LocalDate getExpireDate() {
            return expireDate;
        }
        public double getCost() {
            return cost;
        }
        public String getNumber() {
            return number;
        }

        public void checkExpireDate() {
            if (expireDate.isBefore(LocalDate.now()) || expireDate.isEqual(LocalDate.now())) {
                System.out.println("Нужно срочно ехать оформлять новую страховку!");
            }
        }

        public void checkNumber() {
            if (number.length() != 9) {
                System.out.println("Номер страховки некорректный!");
            }
        }
    }
}