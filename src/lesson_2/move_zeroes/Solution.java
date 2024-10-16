package lesson_2.move_zeroes;

public class Solution {
    public void moveZeroes(int[] nums) {
        int zeroPosition = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[zeroPosition++] = nums[i];
            }
        }

        while (zeroPosition < nums.length) {
            nums[zeroPosition++] = 0;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example 1
        int[] nums1 = {0, 1, 0, 3, 12};
        System.out.print("Input: ");
        printArray(nums1);
        solution.moveZeroes(nums1);
        System.out.print("Output: ");
        printArray(nums1);

        // Example 2
        int[] nums2 = {0};
        System.out.print("Input: ");
        printArray(nums2);
        solution.moveZeroes(nums2);
        System.out.print("Output: ");
        printArray(nums2);
    }

    // Метод для печати массива
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
