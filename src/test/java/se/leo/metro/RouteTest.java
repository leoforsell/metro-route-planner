package se.leo.metro;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class RouteTest {
    @Test void routeKeepsAnIndependentSnapshot() {
        var names = new ArrayList<>(List.of("Alfa", "Beta"));
        Route route = new Route(names, 9);
        names.clear();
        assertEquals(List.of("Alfa", "Beta"), route.stations());
        assertThrows(UnsupportedOperationException.class, () -> route.stations().clear());
    }
}
