# Metro Route Planner

En tunnelbaneinspirerad ruttplanerare i Java med grafer, Dijkstra och egna datastrukturer.

**Status:** Planering och projektstruktur skapade. Implementation, byggkonfiguration och tester återstår; ingen fungerande applikation eller grön testkörning påstås ännu.

## Börja här

1. Läs [projektplanen](docs/PROJECT_PLAN.md).
2. Öppna [första uppgiften](https://github.com/leoforsell/metro-route-planner/issues/1).
3. Följ [branch- och PR-arbetsflödet](CONTRIBUTING.md).
4. Anteckna vad du lär dig i [lärandeloggen](docs/LEARNING_LOG.md).

## Grundversion

Konsolapp med 8–12 påhittade stationer och icke-negativa heltalsvikter i minuter. Beräkna väg och total restid. Inga riktiga SL-tidtabeller eller live-API:er.

## Verktyg

Java, Maven och JUnit 5. Återanvänd bygg- och testrutinerna från Java-kassan.

Exakta versioner och fungerande bygg-, kör- och testkommandon dokumenteras när miljön sätts upp. Kopiera inte framtida kommandon som om projektet redan vore körbart.

## Planerad struktur

- `src/`: Maven-katalogerna main/java och test/java skapas i startuppgiften.
- `tests/`: teststrategi; Java-testkoden ska senare ligga i src/test/java.
- `docs/`: projektplan och lärandelogg.
- `.github/`: mallar för issues och pull requests.

## Arbetsordning

Mars–april 2027, efter Java-grundversionen. Ett projekt i taget; tidsfönstret är preliminärt. Se [planens sex uppgifter](docs/PROJECT_PLAN.md#uppgifter-i-ordning).

## Utbildningssyfte

Ett självständigt lärandeprojekt inför möjliga fortsatta IT-studier. Ingen officiell kurslösning och ingen garanti om framtida kursinnehåll.
