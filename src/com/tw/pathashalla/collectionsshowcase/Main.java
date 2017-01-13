package com.tw.pathashalla.collectionsshowcase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    /**** STATIC METHODS ****/

    // Collections_addAll
    List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3));
    boolean b = Collections.addAll(list1, 4, 5, 6);
    System.out.println(list1);

    // Collections_swap
    Collections.swap(list1, 0, 2);
    System.out.println(list1);

    // Collections_sort
    List<Integer> list = Arrays.asList(20, 230, 10, 1, 123094, 20, 1240, 12000);
    Collections.sort(list);
    System.out.println(list);

    // Collections.reverse(List<?> list)
    Collections.reverse(list);
    System.out.println(list);

    // Collections_binarySearchWithComparator
    Student janvi = new Student(2, "janvi", 23);
    Student anushree = new Student(3, "anushree", 18);
    Student sunder = new Student(4, "sunder", 20);
    Student tilak = new Student(5, "tilak", 21);
    Student indu = new Student(6, "indu", 16);
    Student parvez = new Student(1, "parvez", 35);
    List<Student> students = Arrays.asList(janvi, anushree, sunder, tilak, indu, parvez);
    System.out.println(students);
    Collections.sort(students, Student.StudentAgeComparator);
    System.out.println(students);

    // Collections_binarySearch
    List<Integer> list3 = Arrays.asList(1, 2, 3, 4, 500, 6, 7, 8, 9, 10);
    System.out.println(Collections.binarySearch(list3, 500));

    // Collections_binarySearchWithComparator
    // System.out.println(Collections.binarySearch(students, 500));

    // Collections_min and Collections_max
    System.out.println(Collections.min(list3));
    System.out.println(Collections.max(list3));

    // Collections_min and Collections_max with Comparator
    System.out.println(Collections.min(students, Student.StudentAgeComparator));
    System.out.println(Collections.max(students, Student.StudentAgeComparator));

    System.out.println(Collections.min(students, Student.StudentNameComparator));
    System.out.println(Collections.max(students, Student.StudentNameComparator));

    // Collections_disjoint
    List<Integer> list4 = new ArrayList(Arrays.asList(4, 5, 6));
    List<Integer> list5 = new ArrayList(Arrays.asList(1, 2, 3));
    System.out.println(Collections.disjoint(list4, list5));

    // Collections.frequency(Collection<?> c, Object o)
    int frequency = Collections.frequency(students, parvez);
    System.out.println(frequency);

    // Collections.replaceAll(List<T> list, T oldVal, T newVal)
    List<Student> newStudents = new ArrayList<>();{{
      newStudents.add(parvez);
      newStudents.add(indu);
      newStudents.add(anushree);
      newStudents.add(janvi);
      newStudents.add(tilak);
      newStudents.add(sunder);
    }}
    Student rasheeda = new Student(10, "rasheeda", 18);
    Collections.replaceAll(newStudents, tilak, rasheeda);
    System.out.println(newStudents);
  }
}
