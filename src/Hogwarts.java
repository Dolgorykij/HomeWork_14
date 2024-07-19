public class Hogwarts {

    private String name;
    private int power;
    private int distance;

    public Hogwarts(String name, int power, int distance) {
        this.name = name;
        this.power = power;
        this.distance = distance;
    }

    public String getName() {
        return name;
    }

    public int getPower() {
        return power;
    }

    public int getDistance() {
        return distance;
    }

    public void comparisonPower (Hogwarts student) {
        if (this.power > student.power) {
            System.out.println(this.getName() + " лучше в силе магии, чем студент " + student.getName());
        } else {
            System.out.println(student.getName() + " лучше в силе магии, чем студент " + this.getName());
        }
    }

    public void comparisonDistance (Hogwarts student) {
        if (this.distance > student.distance) {
            System.out.println(this.getName() + " лучше в расстоянии трансгрессии, чем студент " + student.getName());
        } else {
            System.out.println(student.getName() + " лучше в расстоянии трансгрессии, чем студент " + this.getName());
        }
    }

    @Override
    public String toString() {
        return "Hogwarts{" +
                "name='" + name + '\'' +
                ", power=" + power +
                ", distance=" + distance +
                '}';
    }
}
