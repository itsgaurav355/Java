package com.DSA;

public class Seive {
    //Seive of Eratosthenes
    public static void main(String[] args) {
    int n =40;
    boolean [] primes = new boolean[n+1];
    seive(n , primes);
    //initial all value is false,  Assume false is prime no and true is not prime or multiple of some prime no
        //Time Complexity : O(N * log(log(N))
        //Space Complexity : O (N)
    }
    static void seive(int n, boolean [] prime){
        for(int i=2; i * i <= n ; i++){
            if(!prime[i]){
                for(int j = i*2 ; j<=n ; j+=i){
                    prime[j] = true;
                }
            }
        }
        for (int i = 2; i <= n ; i++) {
            if(!prime[i]){
                System.out.print(i+ " ");
            }
        }
    }
}
