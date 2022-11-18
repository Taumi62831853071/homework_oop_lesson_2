public class Bouquet {
    private String flower;
    private double price;
    private int lifeSpan;

    public int numberOfFlowers;

    public Bouquet(String flower, double price, int lifeSpan, int numberOfFlowers) {
        this.flower = flower;
        this.price = price;
        this.lifeSpan = lifeSpan;
        this.numberOfFlowers = numberOfFlowers;

    }

    public String getFlower() {
        return this.flower;
    }

    public double getPrice() {
        return this.price;
    }

    @Override
    public String toString() {
        return "срок стояния " + this.lifeSpan;
    }

    public int getLifeSpan() {
        return this.lifeSpan;
    }

    public int getNumberOfFlowers() {
        return this.numberOfFlowers;
    }
}