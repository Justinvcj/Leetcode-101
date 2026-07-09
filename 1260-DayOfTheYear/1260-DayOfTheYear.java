// Last updated: 7/9/2026, 9:14:37 AM
import java.time.LocalDate;

class Solution {
    public int dayOfYear(String date) {
        LocalDate d = LocalDate.parse(date);  
        return d.getDayOfYear();              
    }
}
