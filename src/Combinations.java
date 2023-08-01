import java.util.ArrayList;
import java.util.List;

class Solution {
    public static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result=new ArrayList<>();

        helper(1,new ArrayList<>(),result,n,k);

        return result;
    }

    public static void helper(int i, List<Integer> currComb, List<List<Integer>> result, int n,int k){
        if(currComb.size() == k){
            result.add(currComb);
            return ;
        }

        if(i > n){
            return;
        }

        for(int j = i ;j <=n ; j++){
            currComb.add(j);
            helper(j+1, currComb, result,n,k);
            currComb.remove(currComb.size()-1);
        }
    }
}