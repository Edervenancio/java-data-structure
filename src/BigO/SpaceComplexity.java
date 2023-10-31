package BigO;

public class SpaceComplexity {



    // recursão
    // O(N) tempo variável conforme execuções..
    public static int sumNumbers(int n){
        if(n <= 0){
            return 0;
        }
         return n + sumNumbers(n-1);

    }




    // 0(1)
    public static int pairSumSequence(int n ){
        int total = 0;
        for ( int i = 0; i <= n; i++){
            total = total + pairSum(i, i+1);
        }
        return total;
    }

    public static int pairSum(int a, int b){
        return a+b;
    }
}
