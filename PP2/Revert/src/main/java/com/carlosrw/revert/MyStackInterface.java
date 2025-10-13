
package com.carlosrw.revert;

/**
 *
 * @author carlos ramirez
 */

public interface MyStackInterface<Type> {
  
  void push(Type item);

  Type pop();

  Type peek();

  boolean empty();

  int size();
}
