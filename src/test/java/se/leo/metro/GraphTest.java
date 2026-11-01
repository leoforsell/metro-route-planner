package se.leo.metro;
import java.util.List;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
@Disabled("Issue #1: aktivera ett test åt gången")
class GraphTest {
    @Test void connectionWorksBothWays() {
        Graph g = new Graph(); g.addStation("A"); g.addStation("B");
        g.connect("A", "B", 3);
        assertEquals(List.of(new Edge("B", 3)), g.neighbors("A"));
        assertEquals(List.of(new Edge("A", 3)), g.neighbors("B"));
    }
    @Test void rejectsNegativeWeights() {
        Graph g = new Graph(); g.addStation("A"); g.addStation("B");
        assertThrows(IllegalArgumentException.class, () -> g.connect("A", "B", -1));
    }
    @Test void isolatedStationHasNoNeighbors() {
        Graph g = new Graph(); g.addStation("I");
        assertTrue(g.stations().contains("I")); assertTrue(g.neighbors("I").isEmpty());
    }
}
