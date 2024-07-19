public class Ravenclaw extends Hogwarts {

    private int mind;
    private int wit;
    private int creativity;

    public Ravenclaw(String name, int power, int distance, int mind, int wit, int creativity) {
        super(name, power, distance);
        this.mind = mind;
        this.wit = wit;
        this.creativity = creativity;
    }

    public int getMind() {
        return mind;
    }

    public int getWit() {
        return wit;
    }

    public int getCreativity() {
        return creativity;
    }

    public void comparison (Ravenclaw student) {
        if (this.mind + this.wit + this.creativity > student.mind + student.wit + student.creativity) {
            System.out.println(this.getName() + " лучше, чем Когтевранец " + student.getName());
        } else {
            System.out.println(student.getName() + " лучше, чем Когтевранец " + this.getName());
        }
    }

    @Override
    public String toString() {
        return super.toString() +
                "Ravenclaw{" +
                "mind=" + mind +
                ", wit=" + wit +
                ", creativity=" + creativity +
                '}';
    }
}
