public class Solution
{
    public static char mostFrequentChar(String s)
    {
        char mostFrequentChar = s.charAt(0);
        int maxCount = 0;
        int[] charCount = new int[256];

        for (char c : s.toCharArray())
        {
            charCount[c]++;

            if (charCount[c] > maxCount || (charCount[c] == maxCount && s.indexOf(c) < s.indexOf(mostFrequentChar)))
            {
                maxCount = charCount[c];
                mostFrequentChar = c;
            }
        }

        return mostFrequentChar;
    }

    public static void main(String[] args)
    {
        System.out.println(Solution.mostFrequentChar("bookeeper"));
        System.out.println(Solution.mostFrequentChar("david"));
        System.out.println(Solution.mostFrequentChar("mississippi"));
        System.out.println(Solution.mostFrequentChar("eleventennine"));
    }
}
