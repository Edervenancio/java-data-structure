package BigO;

public class NonDominantSquared {


    // Dropar o termo não dominante é uma forma de simplificar a anotação para operações com elas.


    // O(n²)
    public static void printNonDominant(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.println(i+"---"+j);
            }
        }

    // O(n)
        for(int k=0; k<n; k++){
            System.out.println(k);
        }
    }


    // Para obter a total complexidade dos métodos, precisamos adicionar essas complexidades.
    // O(n²+n);
    // Contudo, o n, não afetará o número de operações do n², aumentando seu valor como n³...n^4...
    // Portanto, podemos entender n² como termo dominante e dropar o n.

}
