public class TwoSum2 {
    public int[] twoSum(int[] numbers, int target) {

        int i = 0;
        int j = numbers.length-1;
        int[] result = new int[2];
        while(j>-1 && i<numbers.length){
            if(numbers[i] + numbers[j] == target){
                result[0] = i+1;
                result[1] = j+1;
                break;

            }else if(numbers[i] + numbers[j] < target){
                i+=1;
            }else{
                j-=1;
            }
        }
        return result;
    }
}
