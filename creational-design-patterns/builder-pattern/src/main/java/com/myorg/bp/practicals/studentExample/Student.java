package com.myorg.bp.practicals.studentExample;

public class Student {

  private int id;
  private String name;
  private int age;
  private String email;
  private char gender;
  private boolean isEligible;

  @Override
  public String toString() {
    return "Student{" +
        "id=" + id +
        ", name='" + name + '\'' +
        ", age=" + age +
        ", email='" + email + '\'' +
        ", gender=" + gender +
        ", isEligible=" + isEligible +
        '}';
  }

  public Student() {
  }

  public Student(Student.Builder builder) {
    this.id = builder.id;
    this.name = builder.name;
    this.age = builder.age;
    this.email = builder.email;
    this.gender = builder.gender;
    this.isEligible = builder.isEligible;
  }

  public static class Builder {

    private int id;
    private String name;
    private int age;
    private String email;
    private char gender;
    private boolean isEligible;

    // including id as a constructor parameter in order to make it mandatory/ required
    public Builder(int id) {
      this.id = id;
    }

    public Builder name(String name) {
      this.name = name;
      return this;
    }

    public Builder age(int age) {
      this.age = age;
      return this;
    }

    public Builder email(String email) {
      this.email = email;
      return this;
    }

    public Builder gender(char gender) {
      this.gender = gender;
      return this;
    }

    public Builder isEligible(boolean isEligible) {
      this.isEligible = isEligible;
      return this;
    }

    public Student build() {
      return new Student(this);
    }
  }
}
