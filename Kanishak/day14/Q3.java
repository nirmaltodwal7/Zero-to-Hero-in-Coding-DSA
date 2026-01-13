// Multiply Strings

// Input: num1 = "2", num2 = "3"
// Output: "6"

package day14;

class Solution {
    public String multiply(String num1, String num2) {
       int[] steps = new int[num1.length() + num2.length()];

        for (int i = num1.length() - 1; i >= 0; i--) {
            int d1 = num1.charAt(i) - '0';
            for (int j = num2.length() - 1; j >= 0; j--) {
                steps[i + j + 1] += d1 * (num2.charAt(j) - '0');
            }
        }
        for (int i = steps.length - 1; i > 0; i--) {
            steps[i - 1] += steps[i] / 10;
            steps[i] %= 10;
        }
        int i = 0;
        while (i < steps.length - 1 && steps[i] == 0) {
            i++;
        }
        StringBuilder sb = new StringBuilder(i + 1);
        for (; i < steps.length; i++) {
            sb.append((char)(steps[i] + '0'));
        }
        return sb.toString();
    }
}