package Mocktest1;
import java.util.Arrays;
public class move_Zeroes {



        public static void moveZeroes(int[] nums) {
            int lastNonZero = 0;

            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != 0) {
                    int temp = nums[i];
                    nums[i] = nums[lastNonZero];
                    nums[lastNonZero] = temp;
                    lastNonZero++;
                }
            }
        }

        public static void main(String[] args) {
            int[] nums1 = {0, 1, 0, 3, 12};
            moveZeroes(nums1);
            System.out.println(Arrays.toString(nums1));

            int[] nums2 = {0};
            moveZeroes(nums2);
            System.out.println(Arrays.toString(nums2));
        }
    }


