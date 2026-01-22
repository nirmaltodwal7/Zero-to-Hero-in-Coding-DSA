// Sort Characters By Frequency

package day20;


// Input: s = "tree"
// Output: "eert"
// Explanation: 'e' appears twice while 'r' and 't' both appear once.
// So 'e' must appear before both 'r' and 't'. Therefore "eetr" is also a valid answer.


import java.util.*;
class Solution {
    public String frequencySort(String s) {
        int[] freq=new int[256];
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            int ascii=(int)ch;
            freq[ascii]++;
        }
        List<Character> ch= new ArrayList<>();
        for(int i=0;i<256;i++)
        {
            if(freq[i]>0)
            {
                ch.add((char)i);
            }
        }
        ch.sort((a,b)-> freq[b]-freq[a]);
        for (char c:ch)
        {
            for(int i=0;i<freq[c];i++) ans.append(c);
        }
        return ans.toString();
    }
}
