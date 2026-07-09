// Last updated: 7/9/2026, 9:15:31 AM
class Solution {
    public List<Integer> findDuplicates(int[] arr) {
        Set<Integer> seen = new HashSet<>();
        List<Integer> duplicates = new ArrayList<>();
        
        for (int num : arr) {
            if (seen.contains(num)) {
                duplicates.add(num); // Already seen → duplicate
            } else {
                seen.add(num); // First time seeing → store
            }
        }
        
        return duplicates;
    }
}
