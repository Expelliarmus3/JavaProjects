//import java.util.Scanner;
//
//public class Practice {
//    public static void main(String[] args) {
//        int i;
//        for (i = 1; i <= 100; i++) {
//            if (i % 2 == 0)
//                System.out.print(i + " ");
//        }
//        System.out.println();
//        for (i = 100; i >= 1; i--) {
//            if (i % 2 == 0)
//                System.out.print(i + " ");
//        }
//
//
//        Scanner s = new Scanner(System.in);
//
//        int sum = 0;
//        while (sum <= 100) {
//            int n = s.nextInt();
//            sum += n;
//        }
//        System.out.println("Done");
//
//
//        Scanner sn = new Scanner(System.in);
//        System.out.print("Enter no.: ");
//        int n = sn.nextInt();
//        int i1;
//        int sum1 = 0;
//        for (i1 = 1; i1 <= n / 2; i1++) {
//            if (n % i1 == 0) {
//                sum1 += i1;
//                System.out.print(i1 + " ");
//            }
//        }
//        System.out.println();
//        System.out.println("Strict divisor sum: " + sum);
//
//        int num = 0;
//        for (i = 1; i <= n; i++) {
//            if (n % i == 0) {
//                num += i;
//                System.out.print(i + " ");
//            }
//        }
//        System.out.println();
//        System.out.println("Sum of all divisors: " + num);
//
//
//        Scanner input = new Scanner(System.in);
//        boolean isPrime = true;
//        System.out.print("Enter number: ");
//        int n1 = input.nextInt();
//        for (int i2 = 2; i2 < n1; i2++) {
//            isPrime = n1 % i2 != 0;
//        }
//        System.out.println(isPrime ? "prime" : "not prime");
//        System.out.println();
//
//        int sum = 0;
//        for (int i = 1; i <= n / 2; i++) {
//            if (n % i == 0)
//                sum += i;
//        }
//        System.out.println(sum);
//        System.out.println(sum == 1 ? "prime" : "not prime");
//
//        int t = input.nextInt();
//        int max = t;
//        int min = t;
//        if (t >= 0) {
//            for (int i = 0; i >= 0; i++) {
//                t = input.nextInt();
//                if (t < 0) {
//                    break;
//                }
//                max = t > max ? t : max;
//                min = t < min ? t : min;
//
//            }
//            System.out.println("done");
//            System.out.println("max: " + max + " min: " + min);
//        } else
//            System.out.println("Invalid input");
//
//
//        int z = input.nextInt();
//        int sum = 0;
//        while (z > 0) {
//            sum += z % 10;
//            z /= 10;
//        }
//        System.out.println(sum);
//
//        int f = input.nextInt();
//        int n1 = 1;
//        int n2 = 1;
//        int result = 0;
//        for (int i = 1; i <= f - 2; i++) {
//            result = n1 + n2;
//            n1 = n2;
//            n2 = result;
//
//        }
//        System.out.println(result == 0 ? "1" : result);
//
//        String s = "aba";
//        for (int i = 0; i <= s.length() - 1; i++)
//            System.out.print(s.charAt(i) + " ");
//
//
//        String reverse = "";
//        for (int i = s.length() - 1; i >= 0; i--)
//            reverse += s.charAt(i);
//        System.out.println(reverse);
//        System.out.println(s.equals(reverse) ? "palindrome" : "not palindrome");
//
//
//        boolean isPalindrome = true;
//        for (int i = 0, j = s.length() - 1; i < j; i++, j--) {
//            if (s.charAt(i) == s.charAt(j))
//                continue;
//            isPalindrome = false;
//            break;
//        }
//        System.out.println(isPalindrome ? "palindrome" : "not palindrome");
//
//    }
//
//}
