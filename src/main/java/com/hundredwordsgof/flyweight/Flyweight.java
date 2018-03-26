package com.hundredwordsgof.flyweight;

// Roddie Frederik

/**
 * 
 * Flyweight, interface through flyweight can receive and act on extrinsic
 * state.
 *
 */
public interface Flyweight {

  void operation(Object extrinsicState);
}
