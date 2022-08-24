public class ToDo extends Task{
    ToDo(String description) {
        super(description);
    }

    public String getToDoStatusIcon() {
        return "T";
    }

    @Override
    public String toWrite() {
        return "T," + (super.isDone ? "1," : "0,") + super.description + "\n";
    }

    @Override
    public String toString() {
        return "[" + getToDoStatusIcon() + "]" + super.toString();
    }
}
