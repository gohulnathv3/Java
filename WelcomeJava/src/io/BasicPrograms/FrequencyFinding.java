package io.BasicPrograms;

// Revision 4
public class FrequencyFinding {
    public static void main(String[] args) {
        // Initialize array
        int[] arr = new int[]{1,2,3,8,2,2,2,2,5,1};
        // array fr will store the frequencies of array elements
        int[] fr = new  int[arr.length];
        int visited = -1;
        for(int i = 0;i<arr.length;i++){
            int count = 1;
            for (int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                    // to avoid counting same element again and again
                    fr[j] = visited;
                }
            }
            if(fr[i]!=visited)
                fr[i]= count;
        }
        // Display the frequencies of array elements
        System.out.println("------------------------------");
        System.out.println("Element | Frequency");
        System.out.println("------------------------------");
        for(int i = 0;i<fr.length;i++){
            if(fr[i]!=visited)
                System.out.println(" "+ arr[i]+" | "+fr[i]);
        }
        System.out.println("------------------------------");
    }
}
