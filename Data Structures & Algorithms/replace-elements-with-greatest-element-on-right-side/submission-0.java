class Solution {
    public int[] replaceElements(int[] arr) {
        int maxElem = -1;
        for (int i = arr.length-1; i > -1; i--) {
            int newMax = Math.max(maxElem, arr[i]);
            arr[i] = maxElem;
            maxElem = newMax;
        }
        return arr;
    }
}