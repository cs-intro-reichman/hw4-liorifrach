public class Primes {
    public static void main(String[] args) {
        int length = Integer.parseInt(args[0]);
        boolean[] IsPrime = new boolean[length + 1];
        int count = 0;
        System.out.println("Prime numbers up tp " + length + ":");
        for (int i = 2; i <= length; i++){
            if(Primes.IsPrime(i)){
                IsPrime[i] = true;
                count ++;
                System.out.println(i);
            }
            else {
                IsPrime[i] = false;
            }
        }
        double precentage = (count * 100.0) / length;
        System.out.println("There are " + count + " prime numbers between 2 and " + length + " (" +  (int) precentage +"% are primes)");
    }
    public static boolean IsPrime(int n){
        if (n <= 1){
            return false;
        }
        for (int i = 2; i < n; i++){
            if(n % i == 0){
                return false; 
            }
        }
        return true;
    }
}