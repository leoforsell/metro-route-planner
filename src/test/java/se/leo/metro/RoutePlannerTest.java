package se.leo.metro;
import java.util.List;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
@Disabled("Issue #2/#3: aktivera efter grafmodellen")
class RoutePlannerTest {
    private Graph graph() {
        Graph g = new Graph();
        for (String n : List.of("A","B","C","I")) g.addStation(n);
        g.connect("A","B",9); g.connect("A","C",2); g.connect("C","B",2);
        return g;
    }
    @Test void bfsMinimizesEdges() {
        assertEquals(List.of("A","B"), new RoutePlanner().bfs(graph(),"A","B").orElseThrow());
    }
    @Test void dijkstraMinimizesMinutes() {
        Route route = new RoutePlanner().dijkstra(graph(),"A","B").orElseThrow();
        assertEquals(4, route.minutes()); assertEquals(List.of("A","C","B"), route.stations());
    }
    @Test void unreachableAndSameStation() {
        var planner = new RoutePlanner(); var g = graph();
        assertTrue(planner.dijkstra(g,"A","I").isEmpty());
        assertEquals(new Route(List.of("A"),0), planner.dijkstra(g,"A","A").orElseThrow());
    }
    @Test void unknownStationIsRejected() {
        assertThrows(IllegalArgumentException.class, () -> new RoutePlanner().bfs(graph(),"X","B"));
    }
}
