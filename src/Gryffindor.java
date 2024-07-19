public class Gryffindor extends Hogwarts {

    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(String name, int power, int distance, int nobility, int honor, int bravery) {
        super(name, power, distance);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void comparison (Gryffindor student) {
        if (this.nobility + this.bravery + this.honor > student.nobility + student.honor + student.bravery) {
            System.out.println(this.getName() + " лучше, чем Гриффиндорец " + student.getName());
        } else {
            System.out.println(student.getName() + " лучше, чем Гриффиндорец " + this.getName());
        }
    }

    @Override
    public String toString() {
        return super.toString() +
                "Gryffindor{" +
                "nobility=" + nobility +
                ", honor=" + honor +
                ", bravery=" + bravery +
                '}';
    }
}
