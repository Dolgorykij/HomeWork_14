public class Hufflepuff extends Hogwarts {

    private int industriousness;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String name, int power, int distance, int industriousness, int loyalty, int honesty) {
        super(name, power, distance);
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getIndustriousness() {
        return industriousness;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHonesty() {
        return honesty;
    }
    public void comparison (Hufflepuff student) {
        if (this.industriousness + this.loyalty + this.honesty > student.industriousness + student.loyalty + student.honesty) {
            System.out.println(this.getName() + " лучше, чем Пуффендуец " + student.getName());
        } else {
            System.out.println(student.getName() + " лучше, чем Пуффендуец " + this.getName());
        }
    }

    @Override
    public String toString() {
        return super.toString() +
                "Hufflepuff{" +
                "industriousness=" + industriousness +
                ", loyalty=" + loyalty +
                ", honesty=" + honesty +
                '}';
    }
}
