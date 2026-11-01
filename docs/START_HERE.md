# Börja här: ruttplaneraren

## Repetition före kod
Förklara array/lista, Map, Set, kö och referens. Rita en graf och skriv en grannlista för hand.
Startprogrammet skriver bara instruktioner. Graph och RoutePlanner är avsiktligt oimplementerade.

## Första fyra passen (60–90 min per pass)
1. Rita data/network.csv; lägg till Isolerad från stations.txt. Alla förbindelser ska vara oriktade. Detta är ett fiktivt nät.
2. Lös Graph.addStation, stations och neighbors. Aktivera testet för isolerad station.
3. Lös connect och aktivera återstående GraphTest. Testa själv okända stationer och nollvikt.
4. Visa grafen och testerna för handledare. Skriv varför negativ vikt är förbjuden här.

## Därefter
Följ issues #2–#6. RoutePlannerTest är avstängd från start: flytta relevanta tester till separata klasser eller ta bort klassens @Disabled och inaktivera endast de metoder som tillhör senare uppgifter.
BFS kräver inga vikter för sin prioritering. Dijkstra gör det.
CSV-filen är ett dataunderlag; parsern är inte implementerad. Bygg gärna första grafen direkt i Java innan du läser filer.
Testgrafen A–B=9, A–C=2, C–B=2 ger direkt väg med BFS och A–C–B (4 minuter) med Dijkstra.

## Datastrukturer och analys
I #4 skapar du själv DynamicArray.java och MinHeap.java med egna tester.
Testa heapens uttagsordning, dubbletter och tomt tillstånd innan du kopplar den till Dijkstra.
Mät i #5 med fast slumpfrö; spara V, E, upprepningar och median i docs/MEASUREMENTS.csv.
Rita först förväntad tillväxt och jämför sedan. En snabb körning bevisar inte Big-O.

## Testpolicy
RouteTest testar en oföränderlig ögonblicksbild och kör direkt.
GraphTest/RoutePlannerTest är uppgiftstester. Grön start-CI betyder inte att algoritmerna fungerar.
Lägg själv till cykel, lika långa vägar, nollvikt, start=mål och okänd station för båda algoritmerna.

Branch för första arbetet: feat/graph-model. Gör små commits och öppna PR.
