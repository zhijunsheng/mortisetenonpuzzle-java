package com.goldthumb.thinkingrecursively;

public class Fibonacci {

  private static int fiboIterative(int n) {
    int a = 0;
    int b = 1;
    for (int i = 2; i <= n; i++) {
      b = a + b;
      a = b - a;
    }
    return b;
  }

  private static int fiboRecursive(int n) {
    if (n == 0) return 0;
    if (n == 1) return 1;
    return fiboRecursive(n - 1) + fiboRecursive(n - 2);
  }

  private static int fiboRecursive_linear(int n) {
    return fiboRecursive_linear_helper(n , 0, 1);
  }

  private static int fiboRecursive_linear_helper(int n, int a, int b) {
    if (n == 0) {
      return a;
    }
    return fiboRecursive_linear_helper(n - 1, b, a + b);
  }

  public static void main(String[] args) {
    int n = 12;
    System.out.println("fibo " + n + " is " + fiboIterative(n) + " using iterative implementation");
    System.out.println("fibo " + n + " is " + fiboRecursive(n) + " using recursive implementation");
    System.out.println("fibo " + 21 + " is " + fiboRecursive_linear(21) + " using recursive O(n)");
  }
}
