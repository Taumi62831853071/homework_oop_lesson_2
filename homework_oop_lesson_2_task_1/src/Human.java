public class Human {

    private int yearOfBirth;
    String name;
    private String town;
    String jobTitle;

    Human(int yearOfBirth, String name, String town, String jobTitle) {

        this.name = name;
        this.town = town;
        this.jobTitle = jobTitle;
        this.yearOfBirth = yearOfBirth;
    }

    void print() {
        System.out.print("Привет! Меня зовут " + name + ". Я из города " + town + ". Я родился в " + yearOfBirth + " году. Я работаю на должности " + jobTitle + " Будем знакомы!");
    }

    public void setYearOfBirth(int yearOfBirth) {
        if (yearOfBirth >= 0) {
            this.yearOfBirth = yearOfBirth;
        }
    }

    public void setTown(String town) {
        if (town != null && !town.isEmpty() && !town.isBlank()) {
            this.town = town;
        }
    }
}
