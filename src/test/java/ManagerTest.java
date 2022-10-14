import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.net.FilmManager;

public class ManagerTest {

    @Test
    public void test() {
        FilmManager manager = new FilmManager();
        manager.add("film1");
        manager.add("film2");
        manager.add("film3");

        String[] actual = manager.findAll();
        String[] expected = {"film1", "film2", "film3" };

        Assertions.assertArrayEquals(expected, actual);

    }
}


