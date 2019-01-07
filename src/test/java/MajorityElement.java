public class MajorityElement {
    public int majorityElement(int[] nums) {
        int maj = 0, count = 0;
        for (int n : nums) {
            if (count == 0) maj = n;
            if (n == maj) count++;
            else count--;
        }

        return maj;
    }
}
