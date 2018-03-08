package com.goldthumb.thinkingrecursively;

public class Primer {

  private static int choose(int n) {
    return 1 + (int)(Math.random() * n);
  }

  private static String selectNoun() {
    String result = "";
    switch(choose(3)) {
      case 1:
        result = "Paul";
        break;
      case 2:
        result = "John";
        break;
      case 3:
        result = "Kevin";
        break;
    }
    return result;
  }

  private static String selectAdjective() {
    String result = "";
    switch(choose(3)) {
      case 1:
        result = "Tall";
        break;
      case 2:
        result = "Great";
        break;
      case 3:
        result = "Nice";
        break;
    }
    return result;
  }

  private static String modifiedNoun() {
    String result = "";
    switch(choose(2)) {
      case 1:
        result = selectNoun();
        break;
      case 2:
        result = selectAdjective() + " " + modifiedNoun();
        break;
    }
    return result;
  }

  public static void main(String[] args) {
    System.out.println("____________");
    System.out.println(modifiedNoun());
    System.out.println(modifiedNoun());
    System.out.println(modifiedNoun());
    System.out.println(modifiedNoun());
  }
}
