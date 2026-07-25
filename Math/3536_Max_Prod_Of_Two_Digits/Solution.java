class Solution {
    public int maxProduct(int n) {
        int rem=0, prod=1, maxProd=0;
        int digits[] = new int[10];
        int i=0;
        while(n>0){
            rem = n%10;
            digits[i] = rem;
            i++;
            n = n/10;
        }
        for(i=0; i<digits.length; i++){
            for(int j=i+1; j<digits.length; j++) {
                prod = digits[i] * digits[j];
                maxProd = Math.max(maxProd, prod);
            }
        }
        return maxProd;
    }
}