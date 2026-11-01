# Projektplan: Metro Route Planner

**Planerad period:** Mars–april 2027, efter Java-grundversionen. Tidsfönstret är ett förslag; flytta det efter faktisk progression.

## Milstolpar

| Etapp | Resultat |
| --- | --- |
| M0 | Grunder och körbar utvecklingsmiljö |
| M1 | Första fungerande flödet |
| M2 | Struktur, robusthet och tester |
| M3 | Dokumenterad och demonstrerbar v1 |

## Uppgifter i ordning

| Issue | Etapp | Uppgift | Branch |
| --- | --- | --- | --- |
| [#1](https://github.com/leoforsell/metro-route-planner/issues/1) | M0 | Definiera nät och grafmodell | `feat/graph-model` |
| [#2](https://github.com/leoforsell/metro-route-planner/issues/2) | M1 | Hitta en väg med BFS | `feat/bfs-baseline` |
| [#3](https://github.com/leoforsell/metro-route-planner/issues/3) | M1 | Implementera Dijkstra med referensstrukturer | `feat/dijkstra` |
| [#4](https://github.com/leoforsell/metro-route-planner/issues/4) | M2 | Bygg och testa egna datastrukturer | `feat/custom-structures` |
| [#5](https://github.com/leoforsell/metro-route-planner/issues/5) | M2 | Mät och analysera växande grafer | `perf/graph-measurements` |
| [#6](https://github.com/leoforsell/metro-route-planner/issues/6) | M3 | Leverera CLI, CI och algoritmförklaring | `docs/route-demo` |

Varje issue innehåller ledtråd, beroende och acceptanskriterier. Etappkoderna är planeringsrubriker, inte separata GitHub Milestones. Välj högst 2–3 uppgifter eller deluppgifter per vecka och arbeta främst med ett projekt åt gången.

## Omfattning

Konsolapp med 8–12 påhittade stationer och icke-negativa heltalsvikter i minuter. Beräkna väg och total restid. Inga riktiga SL-tidtabeller eller live-API:er.

## Design som växer med projektet

Separera grafmodell, datastrukturer, sökalgoritm och konsolvy. Börja med Java Collections som referens. Ersätt sedan grannlistor med egen dynamisk array och prioritetskön med egen binär min-heap. Standardbibliotek är tillåtna för I/O, tester och referensresultat. Hashtabell, länkad lista, sökträd och A* är valfri fördjupning.

## Tester och leverans

Börja med små deterministiska exempel. Testa både normalfall, tomma fall och felvägar enligt issues. Lägg till CI när en verklig bygg- och testkedja finns. En v1 ska gå att bygga, testa och demonstrera från ren klon.

## Övergripande ordning inför 2027

1. November 2026–februari 2027: Java Checkout System.
2. Mars–april 2027: Metro Route Planner.
3. Maj–juni 2027: C Game of Life.
4. Juli–augusti 2027: buffert, repetition, matematik och portfoliovård.

Anpassa tempot med handledare. IT Ticket Tracker kan avslutas till en avgränsad version eller pausas efter en statusnotering; det projektet ändras inte här.

## Koppling till fortsatta studier

Fristående övningsprojekt i objektorientering, algoritmer och minneshantering. De är inte officiella KTH-laborationer. Exakt kursinnehåll och språk för CINTE HT2027 har inte verifierats i denna projektstart. C-simulering tränar inte alla moment inom elektronik, digitalteknik och processorarkitektur. Java använder referenser; C-pekare hör till C-projektet.

## Startmaterial tillagt

Börja med [START_HERE](START_HERE.md) och dess första fyra pass. Källfiler, byggfiler och tester finns nu; deras TODO markerar ditt arbete.
Startmaterialet ersätter den tidigare manuella skapandet av projektstruktur i setup-uppgifterna. Issues #1–#6 är fortsatt din arbetsordning; stäng dem först när du själv har verifierat kriterierna.

### Kunskapsmål från din tidigare kurslista

Återbygg kunskap från algoritmer och datastrukturer (DD1338): grafrepresentation, traversering, prioritering och komplexitet.

Kurskopplingen är tematisk utifrån din uppladdade lista över avklarade kurser; den är ingen bedömning av aktuella kursplaner.

### Definition av klar uppgift

- Acceptancekriterierna i aktuell issue är uppfyllda.
- Relevanta uppgiftstester är aktiverade och passerar; minst ett eget gränsfall finns.
- Du kan förklara koden och ändra ett litet krav utan att kopiera en lösning.
- PR beskriver vad, varför, verifiering och lärdom; lärandeloggen är uppdaterad.

### Veckovis avstämning

Visa en fungerande liten del för handledare, välj 2–3 deluppgifter, notera hinder och justera nästa veckas omfattning. Matematik från din kurslista kan repeteras separat när huvudprojektet fungerar stabilt.
