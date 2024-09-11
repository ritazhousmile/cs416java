public class Main {

    public static boolean sleepIn(boolean weekday, boolean vacation) {
        if (weekday != true || vacation == true){
            return true;
        };
        return false;
		// Your solution here
    }

    public static boolean nearHundred(int x) {
        //Your solution here
        return Math.abs( x- 100) <= 10 || Math.abs(x - 200) <= 10;

    }

    public static boolean sameFirstLast(int[] nums) {
        //Your solution here
        return nums.length >= 1 && nums[0] == nums[nums.length - 1];
    }

    public static boolean no23(int[] nums) {
        //Your solution here

        return nums.length == 2 && nums[0] != 2 && nums[0] != 3 && nums[1] != 2 && nums[1] != 3;
    }

    

    public static String helloName(String name) {
        //Your solution here
        return "Hello " + name + "!";
    }
}

