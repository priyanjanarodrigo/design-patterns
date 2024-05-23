package com.myorg.pp.practicals.virtualProxy.textProcessor;

import java.util.Objects;

public class TextProcessor implements IProcessor {

  private String text;

  private int numberOfWords;

  public TextProcessor(String text) {
    // Assume this text parsing process is a costly computation.
    this.numberOfWords = (Objects.nonNull(text) && !text.isBlank()) ? text.split(" ").length : 0;
  }

  @Override
  public int getNumberOfWords() {
    return this.numberOfWords;
  }
}
