# Estudo sobre a Abordagem Big O

Este repositório contém material de estudo relacionado à abordagem Big O na análise de algoritmos. Big O é uma notação usada para descrever o desempenho ou a complexidade dos algoritmos em termos de tempo e espaço. É essencial para entender como os algoritmos se comportam quando os conjuntos de dados aumentam em tamanho.

### O que é Big O?

Big O é uma notação usada na ciência da computação para descrever o desempenho ou a complexidade dos algoritmos. Ele representa a pior situação possível em termos de tempo de execução ou espaço necessário para um algoritmo em relação ao tamanho da entrada.

# Anotações Big O

### O(1) - Complexidade Constante

Representa um algoritmo cujo tempo de execução ou espaço necessário é constante, não importa o tamanho da entrada. Exemplo: acesso direto a um elemento em um array.

```
public static int multiplyNumbers(int n){
        return n*n;
    }
```

### O(n) - Complexidade Linear

Descreve um algoritmo cujo tempo de execução ou espaço necessário é proporcional ao tamanho da entrada. Exemplo: percorrer uma lista para encontrar um item.

```
public static void printNumbers(int n){
        for(int i=0; i<n; i++){
            System.out.println(i);
        }
```

### O(n²) - Complexidade Quadrática

Indica um algoritmo cuja complexidade é proporcional ao quadrado do tamanho da entrada. Exemplo: ordenação por seleção em uma lista.


```
public static void printNumbersSquared(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.println(i+"--"+j);
            }
        }
    }
```
### O(log n) - Complexidade Logarítmica

Indica um algoritmo cuja complexidade aumenta de forma logarítmica com o tamanho da entrada. Exemplo: busca binária em uma lista ordenada, <em>divide to conquer...</em>

```
for (int i = 1; i <= n; i *= 2) {
    System.out.println(i);
}
```




