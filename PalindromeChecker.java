// Task_3

import java.util.*;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Deque<Character> deque = new ArrayDeque<>();
        System.out.print("Enter a sequence of digits: ");
        String input = sc.nextLine();
        for (Character c : input.toCharArray()) {
            deque.add(c);
        }
        int length = deque.size();
        boolean isPalindrome = true;
        for (int i = 0; i < length / 2; i++) {
            if (deque.removeFirst() != deque.removeLast()) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println("The sequence is a palindrome!");
        } else {
            System.out.println("The sequence is not a palindrome.");
        }
    
    }
}
