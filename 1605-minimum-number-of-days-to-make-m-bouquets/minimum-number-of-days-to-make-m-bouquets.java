class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if ((long) m * k > bloomDay.length) return -1;

        int low = Integer.MAX_VALUE, high = Integer.MIN_VALUE;

        // Find min and max
        for (int i = 0; i < bloomDay.length; i++) {
            low = Math.min(low, bloomDay[i]);
            high = Math.max(high, bloomDay[i]);
        }

        while (low < high) {
            int mid = low + (high - low) / 2;

            int bouquets = 0;
            int flowers = 0;

            // Check if possible
            for (int i = 0; i < bloomDay.length; i++) {
                if (bloomDay[i] <= mid) {
                    flowers++;
                    if (flowers == k) {
                        bouquets++;
                        flowers = 0;
                    }
                } else {
                    flowers = 0;
                }
            }

            if (bouquets >= m) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }
}