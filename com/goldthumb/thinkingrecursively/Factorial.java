package com.goldthumb.thinkingrecursively;

public class Factorial {

  private static int factIterative(int n) {
    int result = 1;
    for (int i = 1; i <= n; i++) {
      result *= i;
    }
    return result;
  }

  private static int factRecursive(int n) {
    if (n == 0) {
      return 1;
    }
    return n * factRecursive(n - 1);
  }

  private static void printInt(int n) {
    if (n < 10) {
      System.out.print((char)('0' + n));
    } else {
      printInt(n / 10);
      System.out.print((char)('0' + n % 10));
    }
  }

  public static void main(String[] args) {
    int n = 5;
    System.out.println(n + "! = " + factIterative(n) + " using iterative implementation");
    System.out.println(n + "! = " + factRecursive(n) + " using recursive implementation");

    printInt(2018);
  }
}
