package ProblemsPackage;
// Revision 1
//Find Numbers with Even Number of Digits
//        Given an array nums of integers, return how many of them contain an even number of digits.
//
//
//
//        Example 1:
//
//        Input: nums = [12,345,2,6,7896]
//        Output: 2
//        Explanation:
//        12 contains 2 digits (even number of digits).
//        345 contains 3 digits (odd number of digits).
//        2 contains 1 digit (odd number of digits).
//        6 contains 1 digit (odd number of digits).
//        7896 contains 4 digits (even number of digits).
//        Therefore only 12 and 7896 contain an even number of digits.
//        Example 2:
//
//        Input: nums = [555,901,482,1771]
//        Output: 1
//        Explanation:
//        Only 1771 contains an even number of digits.
//
//
//        Constraints:
//
//        1 <= nums.length <= 500
//        1 <= nums[i] <= 105

public class Problem2 {
    public static int findEvenNumbersCount(int[] nums){
        // initialize count variable to store the even digit counts.
        int count = 0;
        // create an array to find the solution for this question
        for(int i=0;i<nums.length;i++){
            // we're gonna initialize the string to convert int to str to find the digits of each value
            //we can't calculate the int length, so we convert it to string and find the lenght of the value
            String s = String.valueOf(nums[i]);
            if(s.length()%2==0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int nums[] = {12,123,1,1,1123,123421,12};
        System.out.println(findEvenNumbersCount(nums));
    }

}
