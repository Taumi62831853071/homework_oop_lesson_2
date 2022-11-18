public class Flower {

    private String flowerColor;
    private String country;
    private double cost;
    int lifeSpan;

    Flower(String flowerColor, String country, double cost, int lifeSpan) {
        this.flowerColor = flowerColor;
        this.country = country;
        this.cost = cost;
        this.lifeSpan = lifeSpan;
    }

    void print() {
        System.out.print(flowerColor + " из " + country + ", стоимость одной штуки - " + cost + ", срок стояния - " + lifeSpan + " дней.");
    }


    public String getFlowerColor() {
        return flowerColor;
    }

    public void setFlowerColor(String flowerColor) {
        if (flowerColor != null && !flowerColor.isEmpty() && !flowerColor.isBlank()) {
            this.flowerColor = flowerColor;
        }
    }

    public void setCountry(String country) {
        if (country != null && !country.isEmpty() && !country.isBlank()) {
            this.country = country;
        }

    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        if (cost >= 0) {
            this.cost = cost;
        }
    }

    public int lifeSpan() {
        return lifeSpan;
    }

    public int setLifeSpan(int lifeSpan) {
        if (lifeSpan >= 1) {
            this.lifeSpan = lifeSpan;
        }
        return lifeSpan;
    }

    public int getLifeSpan() {
        return lifeSpan;
    }

}
