public class assigment4 {
    public static void main(String[] args) {
        /*System.out.println("Factorial of 4 = " + fact(4));
        System.out.println("Power of 5 raise to 2 = " + power(5,2));
        System.out.println("Number of 2's digits in 1234 are = " + countDigit(1234 , 2));
        System.out.println("Is statement adam is palindrome or not? " + (ispalindrome("madam",5) == 1 ? " Yes" : " No"));
        System.out.println("Number of handshakes if there are 5 persons in a room = " + numberOfHandshakes(5));*//*
        System.out.println(greatestCommonDivisor(25, 15, 1, 1)); */
        String str = "i am ali";
        System.out.println(reverseString(str,"",str.length()-1));
    }

    public static int fact(int num) { //Task 1
        if (num == 1) {
            return 1;
        }
        return num * fact(num - 1);

    }

    public static int power(int base, int exp) { //Task 2
        if (exp == 0) {
            return 1;
        }
        return base * power(base, exp - 1);
    }

    public static int countDigit(int num, int digit) { //Task 3
        if (num <= 0) {
            return 0;
        } else if (digit == num % 10) {
            return 1 + countDigit(num / 10, digit);
        } else {
            return countDigit(num / 10, digit);
        }

    }

    public static int ispalindrome(String s, int len) { //Task 4

        s = s.toLowerCase();

        return isPalindromeRecursive(s, 0, len - 1) ? 1 : 0;
    }


    private static boolean isPalindromeRecursive(String str, int left, int right) {

        if (left >= right) {
            return true;
        } else if (str.charAt(left) != str.charAt(right)) {
            return false;
        } else {
            return isPalindromeRecursive(str, left + 1, right - 1);
        }
    }

    public static int numberOfHandshakes(int p) { //Task 5
        if (p == 1) {
            return 0;
        } else {
            return (p - 1) + numberOfHandshakes(p - 1);
        }
    }

    public static int lesserNumber(int x, int y) {
        return x > y ? y : x;
    }

    public static int greatestCommonDivisor(int x, int y, int i, int gcd) { //Task 6

        if (i > lesserNumber(x, y)) {
            return gcd;
        }


        if (x % i == 0 && y % i == 0) {
            gcd = i;
        }

        return greatestCommonDivisor(x, y, i + 1, gcd);
    }

    public static String reverseString (String s,String newS,int len){ //Task 7
        if(len < 0){
            return newS;
        }
        newS = newS + s.charAt(len);
        return  reverseString(s,newS,len-1);
    }
    
}
