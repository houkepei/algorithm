public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        int[] nums =new int[]{1,2,3,4,5};
        int search = search(nums, 5);
        System.out.println(search);
    }

    /**
     * 二分查找返回下标
     *
     * @param nums
     * @param target
     */
    public static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left<=right){
            int mid = left + (right - left) / 2;

            if (nums[mid]==target){
                return mid;
            }else if (nums[mid]< target){
                left = mid +1;
            }else {
               right= mid -1;
            }
        }
        return -1;
    }

}