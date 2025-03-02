package org.example.util;

public enum SessionKeys {
  USER("USER");

  private final String key;

  SessionKeys(String key) {
    this.key = key;
  }

  public String getKey() {
    return key;
  }
}
