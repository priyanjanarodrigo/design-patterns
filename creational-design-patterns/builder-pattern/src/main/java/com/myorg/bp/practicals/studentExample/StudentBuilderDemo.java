package com.myorg.bp.practicals.studentExample;

public class StudentBuilderDemo {

  public static void main(String[] args) {
    Student john = new Student.Builder(1)
        .name("John Cena")
        .age(43)
        .email("john@wwe.com")
        .gender('M')
        .isEligible(true)
        .build();

    System.out.println(john);
  }
}
