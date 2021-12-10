package com.zipcodewilmington.looplabs;

import java.util.Arrays;

/**
 * Created by leon on 1/28/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class StringDuplicateDeleter extends DuplicateDeleter<String> {


    public StringDuplicateDeleter(String[] intArray) {
        super(intArray);
    }


    // helper method will count the number of occurences something happens
    public long getOccurences(String string) {
        //we have array of strings
        //

        return Arrays.stream(array)

                .filter(stringElementInArray -> stringElementInArray.equals(string))
                .count();

    }



    @Override
    public String[] removeDuplicates(int maxNumberOfDuplications) {

        return Arrays.stream(array)
                .filter(duplicateElement -> getOccurences(duplicateElement) < maxNumberOfDuplications)
                .toArray(String[]::new);





//        return new String[0];
    }

    @Override
    public String[] removeDuplicatesExactly(int exactNumberOfDuplications) {


        return Arrays.stream(array)
                .filter(howManyTimesElementOccurs -> getOccurences(howManyTimesElementOccurs) !=(exactNumberOfDuplications))

                .toArray(String[]::new);




//        return new String[0];
    }
}
