/*
The count-and-say sequence is a sequence of digit strings defined by the recursive formula:

countAndSay(1) = "1"
countAndSay(n) is the way you would "say" the digit string from countAndSay(n-1), which is then converted into a different digit string.
To determine how you "say" a digit string, split it into the minimal number of substrings such that each substring contains exactly one unique digit. Then for each substring, say the number of digits, then say the digit. Finally, concatenate every said digit.

Example 1:

Input: n = 1
Output: "1"
Explanation: This is the base case.

Example 2:

Input: n = 4
Output: "1211"
Explanation:
countAndSay(1) = "1"
countAndSay(2) = say "1" = one 1 = "11"
countAndSay(3) = say "11" = two 1's = "21"
countAndSay(4) = say "21" = one 2 + one 1 = "12" + "11" = "1211"

*/ 

class Solution {
    public String countAndSay(int n) {
        String str = "1";

        int ctr = 1;
        while(ctr < n)
        {
            int strLen = str.length(), count=1;
        
            String newStr ="";
            char ch;
            for(int i=0;i<strLen;i++)
            {
                if(i!=strLen-1 && str.charAt(i)==str.charAt(i+1))
                {
                    count++;
                }
                else
                {
                    ch = str.charAt(i);
                    newStr += Integer.toString(count) + Character.toString(ch);
                    count = 1;
                }
            }
            str = newStr ;
            ctr++;
        }

        return str;
    }
}


