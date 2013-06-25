package org.my;

class MyClass
{
  boolean flip = false;
  boolean myMethod(int value)
  {
    flip = !flip;
    boolean result;
    if (flip) {
        result = myOddMethod(2 * value + 1);
    } else {
        result = myOddMethod(2 * value);
    }
    return result;
  }

  boolean myOddMethod(int oddOrEven)
  {
      return ((oddOrEven & 1) == 1);
  }
}
