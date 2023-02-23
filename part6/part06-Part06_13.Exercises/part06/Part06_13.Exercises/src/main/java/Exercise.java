public class Exercise {

    private final String name;

    private boolean completed;

    public Exercise(String name) {

        this.name = name;

        this.completed = false;
    }

    Exercise() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public String getName() {
        return name;
    }

    public boolean isCompleted() {
        return this.completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}
