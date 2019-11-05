package tests;

import org.junit.Ignore;
import org.testng.Assert;

import org.junit.Test;

public class PrimeTest {
  @Test
  public void testPrime(){
    Assert.assertTrue(Primes.isPrime(Integer.MAX_VALUE));
  }
  @Test
  public void testNonPrime(){
    Assert.assertFalse(Primes.isPrime(Integer.MAX_VALUE - 2));
  }
  @Ignore
  @Test
  public void testPrimeLong(){
    long n = Integer.MAX_VALUE;
    Assert.assertTrue(Primes.isPrime(n));
  }
}
