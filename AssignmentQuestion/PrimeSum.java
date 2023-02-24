package AssignmentQuestion;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class PrimeSum {
    public static void main(String[] args) {

        String s;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        s = sc.nextLine();

        BigInteger n = new BigInteger(s);
        boolean [] isPrime = new boolean[n.intValue() + 1];

        allPrimes(isPrime,n);

        for(int i=2;i<=n.intValue();i++){
            if(isPrime[i] && isPrime[n.intValue()-i]){
                System.out.println(n.intValue()+" = "+i+" + "+(n.intValue()-i));
                break;
            }
        }
    }

    static void allPrimes(boolean [] isPrime, BigInteger n){

        Arrays.fill(isPrime,true);

        isPrime[0]=isPrime[1]=false;

//        for(int i=2;i<=n.intValue();i++) {

                for(int i=2;i<=Math.sqrt(n.intValue());i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n.intValue(); j += i) {
                    isPrime[j] = false;
                }
            }
        }

    }
}
