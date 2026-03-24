public class Membership {
    private String name;
    private int month;
    private int year;

    public Membership(String name, int month, int year) {
        this.name = name;
        this.month = month;
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public String toString() {
        return name + " joined in " + month + "/" + year;
    }
}
