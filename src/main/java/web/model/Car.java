package web.model;

public class Car {
    private String serial;
    private String model;
    private int year;

    public Car(String serial, String model, int year) {
        this.serial = serial;
        this.model = model;
        this.year = year;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String toString() {
        return "Car [serial=" + serial + ", model=" + model + ", year=" + year + "]";
    }
}
