package BigO;

public class BigOSquared {


    // O(n²)
    // O looping cresce sua execução exponencialmente. n*n
    public static void printNumbersSquared(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.println(i+"--"+j);
            }
        }
    }

    // O(n³)
    // Um for espera o outro ser executado completamente para mudar seu valor. Gerando mais execuções.
    public static void printNumbersThree(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                for(int k=0; k<n; k++){
                    System.out.println(i+"--"+j+"--");
               }
            }
       }
   }
}
