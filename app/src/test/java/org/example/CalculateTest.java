package org.example;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculateTest {
  @Test
  public void testSum() {
    Calculate calculate_1 = new Calculate();
    String expected_1 = "Sum of 2 and 3 is 5. Average is 2.5.";
    assertEquals(expected_1, calculate_1.sum_order(2, 3));

    Calculate calculate_2 = new Calculate();
    String expected_2 = "Sum of 1 to 10 is 55. Average is 5.5.";
    assertEquals(expected_2, calculate_2.sum_order(1, 10));

    Calculate calculate_odd = new Calculate();
    String expected_odd = "Sum of odd of 1 to 10 is 25. Sum of even is 30.";
    assertEquals(expected_odd, calculate_odd.sum_order(1, 10, "odd"));
  }
}
