package com.mur073.operations.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class UserNotFoundException extends RuntimeException {
  private final String message;
}
