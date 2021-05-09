import com.sun.xml.internal.fastinfoset.algorithm.IntegerEncodingAlgorithm;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.IntStream;

public class InterviewQuestions {

    public static void main(String[] args){

        reverseString("abc");
        reverseStringForLoop("abc");
        swapNumbers(1,2);

        int[] twoSumArray = {2, 3, 7, 4, 8};
        int[] results = twoSum(twoSumArray, 7);
        Arrays.stream(results).forEach(s -> {System.out.println(s);});
        System.out.println("return max");
        returnMax(twoSumArray);
        System.out.println("For loop find max");
        findMaxInArray(twoSumArray);



    }

    static void reverseString(String myString){

        StringBuilder str = new StringBuilder();
        str.append(myString);
        str = str.reverse();
        System.out.println(str);

    }

    static void reverseStringForLoop(String myString){

        char myArray[] = myString.toCharArray();

        for(int i = myArray.length -1 ; i >= 0;i--){
            System.out.print(myArray[i]);
        }
    }

    static void swapNumbers(int x, int y){

        System.out.println("\nBefore: "+ x +" "+ y);
        int temp = 0;
        temp = x;
        x = y;
        y = temp;
        System.out.println("After: "+ x +" "+ y);

    }

    //    2, 3, 7, 4, 8   target 7
    static int[] twoSum(int[] numbers, int target){
        Map<Integer, Integer> visitedNumbers = new HashMap<>();

        for(int i = 0; i < numbers.length; i++){
            int delta = target - numbers[i]; // 2, 4, 0, 3, -1
            if(visitedNumbers.containsKey(delta)){
                return new int[] {i, visitedNumbers.get(delta) };
            }
            //put: number , index
            visitedNumbers.put(numbers[i], i);
        }
        return new int[] {-1,-1};
    }

    static void returnMax(int[]array) {

        //Integer Array = Arrays Class  stream method  array parameter boxed method  to array Integer
        Integer[] boxedArray = Arrays.stream(array).boxed().toArray(Integer[]::new);
        System.out.println(Arrays.stream(boxedArray).max(Integer::compare).get());
    }

    static void findMaxInArray(int[] myArray){
        //List<Integer> list = Arrays.stream(myArray).boxed().collect(Collectors.toList());
        int max = 0;
        for (int i =0; i < myArray.length; i++){
            if( myArray[i] > max){
                max = myArray[i]; //2, 3, 7, 4, 8
            }
        }
        System.out.println(max);

    }


}
