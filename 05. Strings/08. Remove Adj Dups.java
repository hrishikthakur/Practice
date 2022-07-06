// Inplace using two pointers

class Solution {
    public String removeDuplicates(String s) {
        
        // i -> the resultant array iterator
        // j -> to iterate over the string
        char[] res = s.toCharArray();
        int i = 0;
        for(int j = 0; j < s.length(); i++, j++){
            res[i] = res[j];
            if(i > 0 && res[i] == res[i - 1]){
                i -= 2;
            }
        }
        
        return new String(res, 0, i); 
    }
}
// String can be created from a char array by  "new String(char_arr, si, ei - 1)


// O(N) auxiliary space using stack approach with StringBuilder
class Solution {
    
    public String removeDuplicates(String s) {
        
        // Using StringBuilder as a stack
        StringBuilder res = new StringBuilder();
        for(char ch : s.toCharArray()){
            int size = res.length();
            if(res.length() > 0 && res.charAt(size - 1) == ch){
                res.deleteCharAt(size - 1);
            }else{
                res.append(ch);
            }
        }
        
        return res.toString();
    }
}
// sb.toString() -> To convert 
