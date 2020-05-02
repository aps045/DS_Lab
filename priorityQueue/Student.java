package priorityQueue;

public class Student {
    private int roll;
    private String name;
    double cpi;

    public Student(int roll, String name, double cpi) {
        this.roll = roll;
        this.name = name;
        this.cpi = cpi;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCpi() {
        return cpi;
    }

    public void setCpi(double cpi) {
        this.cpi = cpi;
    }

    @Override
    public String toString() {
        return "\n\nRoll No. : " + getRoll() +
                "\nName : " + getName() +
                "\nCPI : " + getCpi();
    }
}
