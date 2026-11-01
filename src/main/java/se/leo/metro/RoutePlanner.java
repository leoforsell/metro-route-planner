package se.leo.metro;
import java.util.List;
import java.util.Optional;
public class RoutePlanner {
    /** Okänd station: IllegalArgumentException. Ingen väg: Optional.empty(). */
    public Optional<List<String>> bfs(Graph graph, String start, String goal) {
        // TODO #2: kö, besökta noder och föregångare.
        throw new UnsupportedOperationException("Issue #2");
    }
    public Optional<Route> dijkstra(Graph graph, String start, String goal) {
        // TODO #3: avstånd, prioritetskö, gamla köposter och återuppbyggd väg.
        // start == goal ger en station och kostnad 0.
        throw new UnsupportedOperationException("Issue #3");
    }
}
