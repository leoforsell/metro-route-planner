package se.leo.metro;
import java.util.List;
import java.util.Set;
public class Graph {
    public void addStation(String name) {
        // TODO #1: välj intern representation och gör dubbletter ofarliga.
        throw new UnsupportedOperationException("Issue #1");
    }
    public void connect(String from, String to, int minutes) {
        // TODO #1: kräv kända stationer, avvisa negativ vikt, lägg till båda riktningarna.
        throw new UnsupportedOperationException("Issue #1");
    }
    public Set<String> stations() { throw new UnsupportedOperationException("Issue #1"); }
    public List<Edge> neighbors(String station) {
        // Returnera inte en modifierbar intern lista.
        throw new UnsupportedOperationException("Issue #1");
    }
}
