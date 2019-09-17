package com.github.narcissujsk.openstackjsk.model.image;

/**
 * Backing store types for glance images
 * 
 * @author Jeremy Unruh
 */
public enum StoreType {
	
  /**
   * File system store
   */
  FILE,
  /**
   * S3 store
   */
  S3,
  /**
   * OpenStack swift store
   */
  SWIFT;
  
  public String value() {
  	return name().toLowerCase();
  }
  
  @Override
  public String toString() {
  	return value();
  }
}
