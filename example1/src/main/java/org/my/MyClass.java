package org.my;

class MyClass
{
  boolean flip = true;
  boolean myMethod(int value)
  {
    flip = !flip;
    boolean result;
    System.out.println("flip : " + flip);
    if (flip) {
        result = myOddMethod(2 * value);
    } else {
        result = myOddMethod(2 * value + 1);
    }
    return result;
  }

  boolean myOddMethod(int oddOrEven)
  {
      System.out.println("oddOrEven & 1 == " + (oddOrEven & 1));
      return ((oddOrEven & 1) == 1);
  }
}
