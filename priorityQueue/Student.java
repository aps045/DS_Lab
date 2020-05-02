package priorityQueue;

public class Student {
    private int rollNumber;
    private String name;
    private double CPI;

    public Student(int rollNumber, String name, double cpi) {
        this.rollNumber = rollNumber;
        this.name = name;
        CPI = cpi;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCPI() {
        return CPI;
    }

    public void setCPI(double cpi) {
        CPI = cpi;
    }

    @Override
    public String toString() {
        return "\n\nRoll No. : " + getRollNumber() +
                "\nName : " + getName() +
                "\nCPI : " + getCPI();
    }
}
