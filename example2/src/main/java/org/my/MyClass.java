package org.my;

class MyClass
{
  boolean flip = true;
  boolean myMethod(int value)
  {
    boolean result = myOtherMethod(2 * value + (flip ? 1 : 0));
    return result;
  }

  boolean myOtherMethod(int oddOrEven)
  {
      return ((oddOrEven & 1) == 0);
  }
}
