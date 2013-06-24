package org.my;

class MyClass
{
  boolean flip = true;
  boolean myMethod(int value)
  {
    flip = !flip;
    boolean result;
    if (flip) {
        result = myOtherMethod(2 * value + 1);
    } else {
        result = myOtherMethod(2 * value);
    }
    return result;
  }

  boolean myOtherMethod(int oddOrEven)
  {
      return ((oddOrEven & 1) == 0);
  }
}
