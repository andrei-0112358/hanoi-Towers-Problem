# Türme von Hanoi (Java)

## Beschreibung
Dieses Projekt implementiert das klassische Problem der Türme von Hanoi. Ziel ist es, alle Scheiben von einem Startstab auf einen Zielstab zu bewegen, wobei bestimmte Regeln eingehalten werden müssen.

## Regeln
Es darf immer nur eine Scheibe gleichzeitig bewegt werden. Eine größere Scheibe darf niemals auf einer kleineren liegen. Es gibt drei Stäbe, die als Quelle, Ziel und Hilfsstab dienen.

## Funktionsweise
Das Programm verwendet eine rekursive Methode, um das Problem zu lösen. Für n Scheiben werden zunächst n-1 Scheiben auf den Hilfsstab verschoben, dann die größte Scheibe auf den Zielstab bewegt und anschließend die n-1 Scheiben vom Hilfsstab auf den Zielstab verschoben. Jeder Schritt wird ausgegeben und die Gesamtanzahl der Züge gezählt.

## Ablauf
Benutzer gibt Anzahl der Scheiben n = 3 ein. Ausgabe: Move disk 1 from A to C Move disk 2 from A to B Move disk 1 from C to B Move disk 3 from A to C Move disk 1 from B to A Move disk 2 from B to C Move disk 1 from A to C Total number of moves: 7

## Ausführen
javac com/mycompany/hanoitowers/HanoiTowers.java java com.mycompany.hanoitowers.HanoiTowers

## Voraussetzungen
Java JDK 8 oder höher
