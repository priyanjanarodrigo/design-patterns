package com.myorg.pp.practicals.virtualProxy.textProcessor;

import java.util.Objects;

public class LazyTextProcessorProxy implements IProcessor {

  private String text;

  private TextProcessor textProcessor;

  public void setText(String text) {
    this.text = text;
  }

  public LazyTextProcessorProxy(String text) {
    this.textProcessor = new TextProcessor(text);
  }

  @Override
  public int getNumberOfWords() {
    if (Objects.isNull(textProcessor)) {
      this.textProcessor = new TextProcessor(this.text);
    }
    return this.textProcessor.getNumberOfWords();
  }
}
