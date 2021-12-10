package com.zipcodewilmington.looplabs;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Created by leon on 1/29/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class IntegerDuplicateDeleter extends DuplicateDeleter<Integer> {


    public IntegerDuplicateDeleter(Integer[] intArray) {
        super(intArray);
    }

    // helper method made to help us in other methods
    public long getOccurences(int occurences) {
        return Arrays.stream(array) // throw given array into stream
                // filter and declare anotherNumber var
                // then use anotherNUmber to check if equal to occurences
                .filter(anotherNumber -> anotherNumber == occurences)
                // count the times this occurs
                .count();


        //      TO SOLVE WITH LOOPING:

//        int count = 0;   // Use a counter
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] == number) {  // if intArray[i] equal to number
//                count++;
//            }
//        }
//        return count;

    }

    @Override
    public Integer[] removeDuplicates(int maxNumberOfDuplications) {

        // given a sorted array
        // given maxNumberOfDuplicates
        // compare the first number with the adjacent number

        return Arrays.stream(array)

                // similar to if statement, if duplicateNumbers occurs less than maxNumberOfDuplications
                // filter through stream new variable condition to check our method call (duplicate numbers)
                .filter(duplicateNumber -> getOccurences(duplicateNumber) < maxNumberOfDuplications)

                //convert stream back to new array
                .toArray(Integer[]::new);


//          IF YOU WANT TO USE A FOR LOOP TO SOLVE:


//        int numberOfElements = 0;
//        for (int i = 0; i < array.length; i++) {  // Run a for loop through the array that was given
//            if (countNumberOccurences(array[i]) < maxNumberOfDuplications) {
//                numberOfElements++;  // Size of new array
//            }
//        }
//        int tracker = 0;
//        Integer[] newArray = new Integer [numberOfElements];
//        for (int j = 0; j < array.length; j++) {
//            if (countNumberOccurences(array[j]) < maxNumberOfDuplications) {
//                newArray[tracker] = array[j];  // Place values in new array using tracker
//                tracker++;
//            }
//        }
//        return newArray;


    }

    @Override
    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {

        return Arrays.stream(array)
                .filter(howManyTimesASpecificDupliCateNumberHasOccured -> getOccurences(howManyTimesASpecificDupliCateNumberHasOccured) != exactNumberOfDuplications)
                .toArray(Integer[]::new);



//        return new Integer[0];


//          FOR SOLVING WITH LOOPS:


//        int numberOfElements = 0;
//        for (int i = 0; i < array.length; i++) {  // Run a for loop through the array that was given
//            if (countNumberOccurences(array[i]) != exactNumberOfDuplications) {
//                numberOfElements++;  // Size of new array
//            }
//        }
//        int tracker = 0;
//        Integer[] newArray = new Integer[numberOfElements];
//        for (int j = 0; j < array.length; j++) {
//            if (countNumberOccurences(array[j]) != exactNumberOfDuplications) {
//                newArray[tracker] = array[j];  // Place values in new array using tracker
//                tracker++;
//            }
//        }
//        return newArray;
    }

}
