package se.leo.metro;
/** En riktad grannpost; en oriktad förbindelse behöver två poster. */
public record Edge(String to, int minutes) {}
