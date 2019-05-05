import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class MGameTest {


    @ParameterizedTest
    @ValueSource (ints = {2, 3, 4, 5, 6, 7, 8})
    void correctNumberOfPlayer(int nbplayer) {
    MGame MTest = new MGame(nbplayer);
    assertEquals(nbplayer, MTest.getPlayerCount());
    }

    @ParameterizedTest
    @ValueSource (ints = {0, -1, 9})
    void noGameWithInvalidNumberOfPlayer(final int invalidArg){

        assertThrows(IllegalArgumentException.class, new Executable() {
            public void execute() throws Throwable {
                MGame MTest = new MGame(invalidArg);
            }
        });
    }
}
