package Sorting;

public class IntSort {
    public void sort(int[] array) {

        boolean swapped = true;
        int j = 0;
        int tmp;
        while (swapped) {
            swapped = false;
            j++;
            for (int i = 0; i < array.length - j; i++) {
                if (array[i] > array[i + 1]) {
                    tmp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = tmp;
                    swapped = true;
                }
            }
        }
    }
}

/*
Decode String
Fibonacci Series
2 leetcode mediums
Given a sentence, capitalize each word in the sentence.
What is Dependency Injection in Spring?
Could you explain what a Kafka Offset is?
What is Object Oriented programming?
The first question was an Easy string question and the second was a medium Recursion/DP question.
Typical Java patterns, threading, Optional, AutoClosable, functional programming, etc. That was about the only interesting part of the whole process.
A leetcode easy problem with string manipulatio
A Leetcode easy problem on Sets
1, what is OOP?
2. what all the data structure in java?
3. what is deadlock? how to fix it?  
 */

