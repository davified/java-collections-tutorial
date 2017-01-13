package com.tw.pathashalla.collectionsshowcase;

import java.util.Comparator;

class Student {
  private final String name;
  private final int rollNumber;
  private final int age;

  Student(int rollNumber, String name, int age) {
    this.rollNumber = rollNumber;
    this.name = name;
    this.age = age;
  }

  String getName() {
    return this.name;
  }

  int age() {
    return age;
  }

  public static Comparator<Student> StudentNameComparator = new Comparator<Student>() {

    public int compare(Student s1, Student s2) {
      String StudentName1 = s1.getName().toUpperCase();
      String StudentName2 = s2.getName().toUpperCase();

      //ascending order:
      return StudentName1.compareTo(StudentName2);

      //descending order:
      //return StudentName2.compareTo(StudentName1);
    }
  };

  /*Comparator for sorting the list by roll no*/
  static Comparator<Student> StudentAgeComparator = new Comparator<Student>() {

    public int compare(Student s1, Student s2) {

      int age1 = s1.age();
      int age2 = s2.age();

       /*For ascending order*/
      return age1 - age2;

       /*For descending order*/
      //rollno2-rollno1;
    }
  };

  @Override
  public String toString() {
    return "[ rollNumber=" + rollNumber + ", name=" + name + ", age=" + age + "]";
  }

}
