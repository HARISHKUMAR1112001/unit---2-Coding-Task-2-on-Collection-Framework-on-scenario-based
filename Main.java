/*Write a java program to store group of integers [order of insertion elements matters] (Array List) */

import java.util.*;

public class Main {
  public static void main(String[] args) {

    Integer[] num = { 12, 33, 44, 55, 66, 77 };

    ArrayList<Integer> l1 = new ArrayList<Integer>();
    Collections.addAll(l1, num);
    System.out.println(l1);

  }
}