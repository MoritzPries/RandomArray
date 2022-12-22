# RandomArray
program with various methods to create and edit arbitrary arrays. (sort,average,variance)

based on the task:

3. fields
A class RandomArray shall compose class methods for the statistical evaluation of random fields
compose:
(a) Write a class method randomArray which stores n natural random numbers xi
from a range of 1 to m into a one-dimensional array of type long.
Implement a class method output for outputting one-dimensional
fields.
As main method, write a test program that reads in n and m, generates a
random field and then outputs it.
b) Implement a class method bubbleSort, which sorts a field in ascending order.
Use the bubble sort algorithm for this.
2Archimedes of Syracuse(c. 287-212 BCE)
2
Extend your test program main, by sorting a copy of the random field and
outputting it.
Note: Bubble sort is a comparison-based sorting algorithm. Go through your field
in ascending direction, successively comparing all directly adjacent
components. If two neighboring components are in the wrong order, they will simply be
are simply swapped with each other. These comparisons are continued until the field is sorted.
is sorted. Each run always ends one component earlier.
c) Calculate in a class method meanValue the mean value x = 1
n
nP1
i=0
xi and in
another class method varianz calculate the variance s2 = 1
n1
nP1
i=0
(xi x)2 of a field.
Complete your test program main by calculating and outputting the mean and variance of the
random field and outputting them.
Create three random fields with your test program for three self-selected values n
and m and output the unsorted field, the sorted field, the mean value and the
variance to a file RandomArray.out using output redirection.
RandomArray.java (rough structure)
public class RandomArray
{
public static long[] randomArray( int n, int m){ }
public static void output( long[] x){ }
public static long[] bubbleSort( long[] x){ }
public static double meanValue( long[] x){ }
public static double varianz( long[] x){ }
public static void main(String[] args)
{
// a) Create and output a random field
// b) Sort and output a copy of the field with bubble sort
// c) Calculate and output the mean and the variance
}
}

based on the original task in german language:

3. Felder
Eine Klasse RandomArray soll Klassenmethoden zur statistischen Auswertung von Zufallsfeldern
zusammenstellen:
a) Schreiben Sie eine Klassenmethode randomArray, welche n natürliche Zufallszahlen xi
aus einem Bereich von 1 bis m in ein eindimensionales Feld vom Typ long abspeichert.
Implementieren Sie eine Klassenmethode ausgabe zum Ausgeben von eindimensionalen
Feldern.
Schreiben Sie als Hauptmethode main ein Testprogramm, welches n und m einliest, ein
Zufallsfeld erzeugt und dieses anschlieÿend ausgibt.
b) Implementieren Sie eine Klassenmethode bubbleSort, welche ein Feld aufsteigend sortiert.
Nutzen Sie hierfür den Bubble-Sort-Algorithmus.
2Archimedes von Syrakus(um 287-212 v.u.Z.)
2
Erweitern Sie Ihr Testprogramm main, indem es eine Kopie des Zufallsfeldes sortiert und
diese ausgibt.
Hinweis: Bubble-Sort ist ein vergleichsbasierter Sortieralgorithmus. Durchlaufen Sie Ihr Feld
in aufsteigender Richtung und vergleichen Sie dabei sukzessive alle direkt benachbarten
Komponenten. Stehen zwei benachbarte Komponenten in falscher Reihenfolge, werden diese
einfach miteinander vertauscht. Diese Vergleiche werden solange fortgesetzt, bis das Feld
sortiert ist. Dabei endet jeder Durchlauf immer eine Komponente früher.
c) Berechnen Sie in einer Klassenmethode mittelWert den Mittelwert x = 1
n
nP􀀀1
i=0
xi und in
einer weiteren Klassenmethode varianz die Varianz s2 = 1
n􀀀1
nP􀀀1
i=0
(xi 􀀀 x)2 eines Feldes.
Vervollständigen Sie Ihr Testprogramm main, indem es den Mittelwert und die Varianz des
Zufallsfeldes berechnet und ausgibt.
Erzeugen Sie mit Ihrem Testprogramm drei Zufallsfelder für drei selbstgewählte Werte n
und m und geben sie jeweils das unsortierte Feld, das sortierte Feld, den Mittelwert und die
Varianz mittels Ausgabeumlenkung in eine Datei RandomArray.out aus.
RandomArray.java (Grobstruktur)
public class RandomArray
{
public static long[] randomArray( int n, int m){ }
public static void ausgabe( long[] x){ }
public static long[] bubbleSort( long[] x){ }
public static double mittelWert( long[] x){ }
public static double varianz( long[] x){ }
public static void main(String[] args)
{
// a) Erzeugen und Ausgabe eines Zufallsfeldes
// b) Sortieren und Ausgabe einer Kopie der Feldes mit Bubble-Sort
// c) Berechnen und Ausgabe des Mittelwertes und der Varianz
}
}
