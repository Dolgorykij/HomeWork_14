public class Slytherin extends Hogwarts {

    private int trick;
    private int ambition;
    private int resourcefulness;
    private int authoritativeness;

    public Slytherin(String name, int power, int distance, int trick, int ambition, int resourcefulness, int authoritativeness) {
        super(name, power, distance);
        this.trick = trick;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.authoritativeness = authoritativeness;
    }

    public int getTrick() {
        return trick;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getAuthoritativeness() {
        return authoritativeness;
    }

    public void comparison (Slytherin student) {
        if (this.trick + this.ambition + this.resourcefulness + this.authoritativeness > student.trick + student.ambition + student.resourcefulness + student.authoritativeness) {
            System.out.println(this.getName() + " лучше, чем Слизеринец " + student.getName());
        } else {
            System.out.println(student.getName() + " лучше, чем Слизеринец " + this.getName());
        }
    }

    @Override
    public String toString() {
        return super.toString() +
                "Slytherin{" +
                "trick=" + trick +
                ", ambition=" + ambition +
                ", resourcefulness=" + resourcefulness +
                ", authoritativeness=" + authoritativeness +
                '}';
    }
}
