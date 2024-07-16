class Solution {
    static ArrayList<ArrayList<Integer>> uniquePerms(ArrayList<Integer> arr, int n) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        Collections.sort(arr);
        boolean[] used = new boolean[n];
        ArrayList<Integer> currentPerm = new ArrayList<>();
        backtrack(arr, used, currentPerm, result);
        return result;
    }
    
    private static void backtrack(ArrayList<Integer> arr, boolean[] used, ArrayList<Integer> currentPerm, ArrayList<ArrayList<Integer>> result) {
        if (currentPerm.size() == arr.size()) {
            result.add(new ArrayList<>(currentPerm));
            return;
        }
        
        for (int i = 0; i < arr.size(); i++) {
            if (used[i] || (i > 0 && arr.get(i).equals(arr.get(i - 1)) && !used[i - 1])) {
                continue;
            }
            used[i] = true;
            currentPerm.add(arr.get(i));
            backtrack(arr, used, currentPerm, result);
            currentPerm.remove(currentPerm.size() - 1);
            used[i] = false;
        }
    }
}
