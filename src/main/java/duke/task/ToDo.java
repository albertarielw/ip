package duke.task;

public class ToDo extends Task{
    public ToDo(String description) {
        super(description);
    }
    @Override
    public String getTaskTypeIcon() {
        return "T";
    }

    @Override
    public String toWrite() {
        return "T," + (super.isDone ? "1," : "0,") + super.description + "\n";
    }

    @Override
    public String toString() {
        return "[" + getTaskTypeIcon() + "]" + super.toString() ;
    }
    
}
