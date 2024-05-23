package com.myorg.pp.implementation.prototype;

/**
 * Prototype interface : This is the Prototype interface which declares the clone() method. The
 * implementation of clone() method is responsible for cloning the object/returning a copy of the
 * object.
 * <p>
 * We can achieve this by using the clone() method of the Object class without creating an explicit
 * interface like this. (This is for learning purposes)
 */
public interface Prototype {

  /**
   * Responsible for cloning the object/returning a copy of the object.
   *
   * @return Prototype.
   */
  Prototype clone();
}
