import java.util.HashSet;

class Solution {
    public int distinctPrimeFactors(int[] nums) {
        HashSet<Integer> primeSet = new HashSet<>();
        
        for (int num : nums) {
            int divisor = 2;
            
            while (divisor * divisor <= num) {
                if (num % divisor == 0) {
                    primeSet.add(divisor);
                    
                    while (num % divisor == 0) {
                        num /= divisor;
                    }
                }
                divisor++;
            }
            
            if (num > 1) {
                primeSet.add(num);
            }
        }
        
        return primeSet.size();
    }
}
