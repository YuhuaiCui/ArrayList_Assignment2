import java.util.ArrayList;

public class Question3
{
    public static void main(String[] argos) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        ArrayList<Integer> b = new ArrayList<Integer>();
        a.add(9);
        a.add(9);
        a.add(9);
        a.add(9);
        b.add(9);
        b.add(9);
        System.out.println(addingBigInts(a, b));
    }

    public static ArrayList<Integer> addingBigInts(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        int lastAdd = 0;
        int add = 0;
        int bigger = Math.max(nums1.size(), nums2.size());
        int smaller = Math.min(nums1.size(), nums2.size());
        Boolean overTen = false;
        Boolean lastOverTen = false;

        for (int i = smaller-1; i >= 0; i--) {
            add = nums1.get(i) + nums2.get(i);
            if (lastAdd >= 10) add++;

            if (add >= 10) ans.add(0, add-10);
            else ans.add(0, add);
            lastAdd = add;
        }

        for (int i = bigger-smaller-1; i >= 0; i--) {
            if (i != 0 && bigger == nums1.size()) {
                add = nums1.get(i);
                if (lastAdd >= 10) add++;

                if (add >= 10) ans.add(0, add-10);
                else ans.add(0, add);
                lastAdd = add;
            } else if (i == 0 && bigger == nums1.size()) {
                add = nums1.get(i);
                if (lastAdd >= 10) add++;

                if (add >= 10) {
                   ans.add(0, add-10);
                   ans.add(0, 1);
                }
                else ans.add(0, add);
            }
            if (bigger == nums2.size()) {
                add = nums1.get(i);
                if (lastAdd >= 10) add++;

                if (add >= 10) ans.add(0, add-10);
                else ans.add(0, add);
                lastAdd = add;
            } else if (i == 0 && bigger == nums2.size()) {
                add = nums1.get(i);
                if (lastAdd >= 10) add++;

                if (add >= 10) {
                   ans.add(0, add-10);
                   ans.add(0, 1);
                }
                else ans.add(0, add);
            }
        }
        return ans;
    }
}
