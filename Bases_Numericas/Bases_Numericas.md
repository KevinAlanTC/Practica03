# Bases Numéricas
Escriba un programa que convierta un entero decimal a binario, octal y hexadecimal sin usar los métodos integrados de Java:
```
Integer.toBinaryString()

Integer.toOctalString()

Integer.toHexString()
```
Debe implementar la conversión manualmente mediante operaciones aritméticas.

## Input Format

A single line containing an integer n:

n

A single line containing an integer x:

x

Where:

0 ≤ n ≤ 10^9

x=2 || x=8 || x=16

## Constraints

No utilice Integer.toBinaryString(), Integer.toOctalString(), Integer.toHexString() ni ningún otro método de biblioteca que realice conversiones de base. (SE REVISARA SU CODIGO)

Puede utilizar operadores aritméticos (+, -, *, /, %) y bucles.

## Output Format

Imprima el número convertido a:

Binario (base 2)

Octal (base 8)

Hexadecimal (base 16, letras en mayúsculas)

Solo se imprime un numero, resultado de evaluar la funcion con un numero n y una base x

## Sample Input 0
```
7546319
2
```
## Sample Output 0
```
11100110010010111001111
```
## Sample Input 1
```
7546319
8
```
## Sample Output 1
```
34622717
```
## Sample Input 2
```
7546319
16
```
## Sample Output 2
```
7325CF
```
