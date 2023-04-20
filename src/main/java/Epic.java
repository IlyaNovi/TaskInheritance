import java.util.Arrays;

public class Epic extends Task {
    private final String subtasks;

    public Epic(int id, String[] subtasks) {
        super(id);
        this.subtasks = Arrays.toString(subtasks);
    }

    public static void epic(String[] args) {
        String[] subtasks = new String[0];
    }

    @Override
    public boolean matches(String query) {
        if (subtasks.contains(query)) {
            return true;
        }
//
        return false;
    }
}
