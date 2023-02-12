package AssignmentQuestion;

import java.util.Arrays;
import java.util.Scanner;

public class PrimeSum {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n=2000000000;
        boolean [] isPrime = new boolean[n];

        allPrimes(isPrime,n);



        int m = sc.nextInt();
        for(int i=0;i<m;i++){
            if(isPrime[i] && isPrime[m-i]){
                System.out.println(i+" "+(m-i));
            }
        }
    }

    static void allPrimes(boolean [] isPrime, int n){

        Arrays.fill(isPrime,true);

        isPrime[0]=isPrime[1]=false;

        for(int i=2;i<=Math.sqrt(n);i++) {

            if (isPrime[i]) {
                for (int j = i * i; j < n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

    }}