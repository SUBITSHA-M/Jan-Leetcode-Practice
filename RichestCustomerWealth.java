class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxwel=0;
        int len = accounts.length;
        for(int i=0;i<len;i++){
            int max=0;
            for(int j=0;j<accounts[i].length;j++){
                max+=accounts[i][j];
            }
            if(max>maxwel)
                maxwel=max;
            max=0;
        }
        return maxwel;
    }
}