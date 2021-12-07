import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import preparingcode.Greeting;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;

public class GreetingTest {

    private static Greeting greeting = new Greeting();

    @Test
    @DisplayName("Test greeting special name")
    public void testSpecialNameGreeting() {
        String name = "Ludmila";
        String outcome = "I don't know you, Ludmila. But you are on our VIP list!";
        assertEquals(outcome, greeting.greetUser(name));
        }

    @Test
    @DisplayName("Test greeting special and known name")
    public void testSprecialAndKnownNameGreeting() {
        String name = "Gareth";
        String outcome = "I know you, Gareth.You're even on our VIP list!";
        assertEquals(outcome, greeting.greetUser(name));
    }

    @Test
    @DisplayName("Test greeting unknown name")
    public void testUnknownNameGreeting() {
        String name = "Kira";
        String outcome = "stranger";
        assertEquals(outcome, greeting.greetUser(name));
    }

    @Test
    @DisplayName("Test part of the day greeting")
    public void testDayPart( ) {
        LocalDateTime dateTime = LocalDateTime.of(2021, 12, 7, 11, 18);
        String outcome = "Good morning, ";
        assertEquals(outcome, greeting.greetDay(dateTime));
    }

    @Test
    @DisplayName("Test fail part of the day greeting")
    public void testFailDayPart( ) {
        LocalDateTime dateTime = LocalDateTime.of(2021, 12, 7, 11, 18);
        String outcome = "not equal";
        assertNotEquals(outcome, greeting.greetDay(dateTime));
    }
}
