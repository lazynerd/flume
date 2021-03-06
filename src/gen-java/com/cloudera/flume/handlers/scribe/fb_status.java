/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package com.cloudera.flume.handlers.scribe;


import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

/**
 * Common status reporting mechanism across all services
 */
public enum fb_status implements TEnum {
  DEAD(0),
  STARTING(1),
  ALIVE(2),
  STOPPING(3),
  STOPPED(4),
  WARNING(5);

  private static final Map<Integer, fb_status> BY_VALUE = new HashMap<Integer,fb_status>() {{
    for(fb_status val : fb_status.values()) {
      put(val.getValue(), val);
    }
  }};

  private final int value;

  private fb_status(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  public static fb_status findByValue(int value) { 
    return BY_VALUE.get(value);
  }
}
