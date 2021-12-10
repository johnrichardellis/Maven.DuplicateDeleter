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

//        return new Integer[0];
    }

    @Override
    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {

        return Arrays.stream(array)
                .filter(howManyTimesASpecificDupliCateNumberHasOccured -> getOccurences(howManyTimesASpecificDupliCateNumberHasOccured) != exactNumberOfDuplications)
                .toArray(Integer[]::new);



//        return new Integer[0];
    }
}
