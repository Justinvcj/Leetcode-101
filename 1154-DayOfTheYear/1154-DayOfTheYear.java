// Last updated: 9/8/2026, 10:01:01 AM
import java.time.LocalDate;

class Solution {
    public int dayOfYear(String date) {
        LocalDate d = LocalDate.parse(date);  
        return d.getDayOfYear();              
    }
}
