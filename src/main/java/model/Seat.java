package model;

public class Seat {
    private long id;
    private int numberSeat;
    private boolean isBooked;

    public Seat(long id, int numberSeat, boolean isBooked) {
        this.id = id;
        this.numberSeat = numberSeat;
        this.isBooked = isBooked;
    }

    @Override
    public String toString() {
        return "Место {" +
                " номер места = " + numberSeat +
                ", забронирован = " + isBooked +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getNumberSeat() {
        return numberSeat;
    }

    public void setNumberSeat(int numberSeat) {
        this.numberSeat = numberSeat;
    }

    public boolean isBooked() {
        return isBooked;
    }

    public void setBooked(boolean booked) {
        isBooked = booked;
    }
}
