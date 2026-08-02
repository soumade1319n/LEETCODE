class Solution {
    public String countAndSay(int n) {
        String curr = "1";
        
        for (int i = 1; i < n; i++) {
            StringBuilder next = new StringBuilder();
            int count = 1;
            
            for (int j = 0; j < curr.length(); j++) {
                if (j + 1 < curr.length() && curr.charAt(j) == curr.charAt(j + 1)) {
                    count++;
                } else {
                    next.append(count).append(curr.charAt(j));
                    count = 1;
                }
            }
            curr = next.toString();
        }
        
        return curr;
    }
}