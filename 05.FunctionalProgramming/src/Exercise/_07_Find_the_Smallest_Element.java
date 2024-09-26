package Exercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class _07_Find_the_Smallest_Element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //1. Custom function (Can be with int[] as well)
//        Function<List<Integer>, Integer> findSmallestNumber = arr -> {
//            int minNumber = Integer.MAX_VALUE;
//            int index = 0;
//
//            for (int i = 0; i < arr.size(); i++) {
//                if (arr.get(i) <= minNumber) {
//                    minNumber = arr.get(i);
//                    index = i;
//                }
//            }
//
//            return index;
//        };
//
//        List<Integer> numbers = Arrays.stream(sc.nextLine().split("\\s+"))
//                .map(Integer::parseInt)
//                .collect(Collectors.toList());
//
//        Integer smallestNumber = findSmallestNumber.apply(numbers);
//        System.out.println(smallestNumber);

        //2. Already created function .min()
        List<Integer> numbers = Arrays.stream(sc.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .toList();

        // Function: argument -> an action is completed and a result is returned
        Function<List<Integer>, Integer> function = Collections::min;

        Integer minValue = function.apply(numbers);

        System.out.println(numbers.lastIndexOf(minValue)); //Get the index of last min element in case there are 2 times same element
    }
}
