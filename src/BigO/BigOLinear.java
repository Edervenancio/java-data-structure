package BigO;

public class BigOLinear {


    // O(n)
    // O tempo crescerá de acordo com o valor de entrada.
    // Quanto maior os dados de entrada, maior tempo levará.
    // Em algumas situações, 0(2N) pode ser entendido como O(N);
    public static void printNumbers(int n){
        for(int i=0; i<n; i++){
            System.out.println(i);
        }
//        for(int j=0; j<n; j++){
//            System.out.println(j);
//        }
    }
    
}
