import java.util.ArrayList;

public class Question2
{
    public static void main(String[] argos) {
        System.out.println(goldbachConjecture(98));
    }
    
    public static String goldbachConjecture(int n) {
        String ans = "";
        ArrayList<Integer> nums = sieveOfEratosthenes(n);
        for (int i = 0; i < nums.size(); i++) {
            if (nums.contains(n - nums.get(i))) ans = nums.get(i) + " + " + (n - nums.get(i));
        }
        return ans;
    }
    
    public static ArrayList<Integer> sieveOfEratosthenes(int n) {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        for (int i = 2; i <= n; i++) {
            ans.add(i);
        }
        
        for (int p = 2; p < n; p++) {
            for (int i = ans.size()-1; i >= 0; i--) {
                if (ans.get(i) != p && ans.get(i) % p == 0) ans.remove(i);
            }
        }
        return ans;
    }
}
