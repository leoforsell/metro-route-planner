# Metro Route Planner

Självständigt arbetsmaterial för repetition inför fortsatta IT-studier.

**Status:** Startkod och uppgiftstester finns. Kärnfunktionerna är TODO-övningar, inte en färdig applikation.

## Börja här

1. Följ [startguiden med små arbetspass](docs/START_HERE.md).
2. Läs [projektplanen och uppgifter #1–#6](docs/PROJECT_PLAN.md).
3. Arbeta med branch och PR enligt [CONTRIBUTING](CONTRIBUTING.md).
4. Använd [lärandeloggen](docs/LEARNING_LOG.md).

## Verktyg och kommandon

Installera JDK 17 och Maven 3.9.x. Kontrollera med `java -version`, `javac -version` och `mvn -version`.
Byggfilen låser Java release 17, compiler-plugin 3.13.0, Surefire 3.5.2 och JUnit 5.11.4.

```sh
git clone https://github.com/leoforsell/metro-route-planner.git
cd metro-route-planner
mvn test
mvn package
java -cp target/classes se.leo.metro.Main
```

## Vad du arbetar i

`src/main/java/se/leo/metro/` innehåller startprogram, modeller och metoder med TODO.
`src/test/java/se/leo/metro/` innehåller ett aktivt grundtest och avstängda uppgiftstester.
Aktivera relevanta tester när du börjar nästa uppgift.

CI bygger och testar startstrukturen. **Grön CI betyder inte att övningarna är färdiga.**
Se [teststrategin](tests/README.md) för vad som ska aktiveras senare.

## Arbetsordning

Java-kassa → ruttplanerare → C-simulering. Ett huvudprojekt i taget.
Perioderna i projektplanen är preliminära; anpassa dem med handledare efter vad du kan förklara och göra själv.

Materialet tränar programmering, algoritmer och minneshantering. Det är inte en officiell KTH-kurslösning.
CINTE:s exakta upplägg HT2027 och eventuella tillgodoräknanden är inte verifierade här.
