public class DEMO_Java {

        static boolean isPalindrome(String[] array)
        {
            int i=0, c=0, j = array.length-1;

            for (i=0; i<array.length-1; i++) {
                if (array[i] == array[j]) {
                    c++;
                    j--;
                }
            }
            return  (c==array.length-1);
        }

        public static void main(String[] args)
        {
            String[] array = {"Is this a palindrome?", "This is a palindrome", "Is this a palindrome?"};

            if (isPalindrome(array))
                System.out.print("Yes");
            else
                System.out.print("No");
        }
    }

