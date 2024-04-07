package com.Practice;

public class question4 {
    public static void main(String[] args) {

    }
    static int[] binaryQueries(int n , int[] a,int q, int [][] queries){
        int[] qu=new int[q];

        int j=0;
        while(j<=q-1){
            int ans=0;
            for(int i=0;i<n;i++){
                if((i<=queries[j][1])&&(i>=queries[j][0])){
                    a[i]=(a[i]^queries[j][2]);
                    ans=(ans|a[i]);
                }
                qu[j]=ans;
            }
            j++;
        }
        return qu;
    }
    
}
