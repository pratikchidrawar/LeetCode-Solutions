
import java.util.*;

class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();

        findCombinations(
            candidates, target, 0, new ArrayList<>(), result
        );

        return result;
    }

    private void findCombinations(
            int[] candidates,
            int target,
            int index,
            List<Integer> current,
            List<List<Integer>> result) {

        // Base case: target reached
        if (target == 0) {
            result.add(new ArrayList<>(current));
            return;
        }

        // Base case: no candidates left
        if (index == candidates.length || target < 0) {
            return;
        }

        // Choice 1: Take the current candidate
        current.add(candidates[index]);

        // Same index because reuse is allowed
        findCombinations(
            candidates, target - candidates[index],
            index, current, result
        );

        // Backtrack: remove the chosen candidate
        current.remove(current.size() - 1);

        // Choice 2: Skip the current candidate
        findCombinations(
            candidates, target, index + 1, current, result
        );
    }
}
