package com.myorg.ip.implementation.iterable;

import com.myorg.ip.implementation.iterator.Iterator;
import com.myorg.ip.implementation.iterator.JobIterator;

public class JobCollection implements Iterable {

  private String[] jobList;

  public JobCollection(String[] jobList) {
    this.jobList = jobList;
  }

  @Override
  public Iterator getIterator() {
    return new JobIterator(this.jobList);
  }
}
