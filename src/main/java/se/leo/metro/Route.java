package se.leo.metro;
import java.util.List;
public record Route(List<String> stations, int minutes) {
    public Route { stations = List.copyOf(stations); }
}
