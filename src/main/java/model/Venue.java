package model;

public class Venue {
    private long id;
    private String title;
    private int numberOfSeats;

    public Venue(long id, String title, int numberOfSeats) {
        this.id = id;
        this.title = title;
        this.numberOfSeats = numberOfSeats;
    }

    @Override
    public String toString() {
        return "Зал {" +
                "id=" + id +
                ", название зала ='" + title + '\'' +
                ", колличество мест =" + numberOfSeats +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }
}
