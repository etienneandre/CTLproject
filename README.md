# Quick parser for CTL formulas

Quick Java parser for the CTL model checking project in the P2S (Programming, safety and security) Master of computer science of [Université Sorbonne Paris Nord](https://www.univ-spn.fr/).

This program only parses a CTL formula (including Boolean connectors: `AND`, `OR`, `NOT`, `=>`), and prints it on screen.

## Compiling
```
cd src && javacc *.jj && javac *.java
```

## Example of call
```
java Main ../examples/formula.ctl
```

