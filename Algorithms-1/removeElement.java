public class removeElement {
        public static int removeElement(int[] nums, int val) {
                  int j = 0;  // Pointer to insert elements that are not equal to val
    
            // Traverse the array
            for (int i = 0; i < nums.length; i++) {
                // If the current element is not equal to val
                if (nums[i] != val) {
                    // Copy the element to the position indicated by j
                    nums[j] = nums[i];
                    // Increment j
                    j++;
                }
            }
            for (int i = 0; i < nums.length; i++){
                System.out.print(nums[i]+" ");
            }
            System.out.println();
            return j; //all elements that are not equal to val are returned here
        }
        public static void main(String[] args) {
            int[] nums = {0, 1, 2, 1, 3, 3, 5, 1};
            int val = 1;
            int r = removeElement(nums, val);
            for(int o=0; o<r+1; o++){
                System.out.print(nums[o]+" ");
            }
        }
    }
