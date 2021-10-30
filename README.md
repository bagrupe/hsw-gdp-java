# Hochschule Weserbergland - Grundlagen der Programmierung Praktikum Java

Siehe https://www.hsw-hameln.de/studienangebote/duales-studium/programm/wirtschaftsinformatik-bsc/

## Installation

In 00-parent/pom.xml muss die richtige java.version eingetragen werden. Danach kann der Workspace in VSCode/eclipse/IntelliJ importiert werden.

Um maximal kompatibel zu sein besteht der Workspace aus Maven Projekten. Die einzelnen Projekte können aber auch ohne Maven über die IDE "Start/Debug" Funktionen gestartet werden.

## Ausführbare Programme erstellen

Es können aber auch runnable JARs generiert werden, hierfür muss "mvn package" ausgeführt werden. Dann kann das Programm über java -jar ./target/jarname.jar (ausgehend vom Projektverzeichnis) ausgeführt werden.