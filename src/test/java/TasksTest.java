import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TasksTest {
    @Test
    public void epicMethodContains() {

        String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
        Epic epic = new Epic(22, subtasks);

        boolean trueExpected = true;
        boolean trueActual = (epic.matches("Молоко"));

        Assertions.assertEquals(trueExpected, trueActual);

        boolean falseExpected = false;
        boolean falseActual = (epic.matches("Пицца"));

        Assertions.assertEquals(falseExpected, falseActual);
    }

    @Test
    public void simpleTaskMethodContains() {
        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");

        boolean trueExpected = true;
        boolean trueActual = (simpleTask.matches("звонить"));

        Assertions.assertEquals(trueExpected, trueActual);

        boolean falseExpected = false;
        boolean falseActual = (simpleTask.matches("поговорить"));

        Assertions.assertEquals(falseExpected, falseActual);
    }

    @Test
    public void meetingMethodContains() {
        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );

        boolean trueExpected = true;
        boolean trueActual = meeting.matches("Банк");

        Assertions.assertEquals(trueExpected, trueActual);

        boolean falseExpected = false;
        boolean falseActual = meeting.matches("магазин");

        Assertions.assertEquals(falseExpected, falseActual);
    }
}
