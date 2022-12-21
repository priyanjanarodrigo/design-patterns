package com.myorg.ip.implementation.iterator;

public class JobIterator implements Iterator {

  private int index;

  private String[] jobList;

  public JobIterator(String[] jobList) {
    this.jobList = jobList;
  }

  @Override
  public boolean hasNext() {
    if (jobList == null || jobList.length == 0 || index == jobList.length) {
      return false;
    }
    return true;
  }

  @Override
  public String next() {
    return this.hasNext() ? jobList[index++] : null;
  }
}
