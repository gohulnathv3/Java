package ProblemsPackage;

// Revision 1
//Given a binary array nums, return the maximum number of consecutive 1's in the array.
//Example 1:

//Input: nums = [1,1,0,1,1,1]
//Output: 3
//Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.
//Example 2:
//
//Input: nums = [1,0,1,1,0,1]
//Output: 2

public class Problem1 {

    public static int findMaxConsecutiveOnes(int[] nums){
        //initialize the count variable to store the counts
        int count = 0;
        //initialize the maximum variable to store the maximum consecutive ones of last outputs
        int maximum = 0;
        //create for loop to fetch the details of loop and find the consecutive ones
        for(int i=0; i<nums.length; i++){

            if(nums[i]==0){
                maximum = count>maximum? count:maximum;
                count = 0;
            }else{
                count++;
            }
        }
        return Math.max(maximum, count);
    }

    public static void main(String[] args) {
//        int nums[] = {1,0,1,1,1,0,1,1,1,1,1};
        int nums[] = {1,0,1,1,1,0,1,1,1,1};
//       int nums[] = {1,0,1,1,0,1};

        System.out.println(findMaxConsecutiveOnes(nums));
    }

}
