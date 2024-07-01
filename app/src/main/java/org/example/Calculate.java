package org.example;

public class Calculate {
  public String sum_order(int x, int y) {
    int tmp;
    if (x > y) {
      tmp = x;
      x = y;
      y = tmp;
    }

    int sum = 0;
    int cnt = 0;
    for (int i = x; i <= y; i++) {
      sum += i;
      cnt++;
    }

    double ave = (double) sum / cnt;

    // "and" or "to"
    if (x - y == 1 || x - y == -1) {
      return "Sum of " + x + " and " + y + " is " + sum + ". Average is " + ave + ".";
    } else {
      return "Sum of " + x + " to " + y + " is " + sum + ". Average is " + ave + ".";
    }
  }

  // overload
  public String sum_order(int x, int y, String type) {
    int tmp;
    if (x > y) {
      tmp = x;
      x = y;
      y = tmp;
    }

    // odd
    if (type == "odd") {
      int sum_odd = 0;
      int sum_even = 0;
      for (int i = x; i <= y; i++) {
        if (i % 2 == 1) {
          sum_odd += i;
        } else {
          sum_even += i;
        }
      }
      return "Sum of odd of " + x + " to " + y + " is " + sum_odd + ". Sum of even is " + sum_even + ".";
    } else {
      return "Argument Error!";
    }
  }
}
