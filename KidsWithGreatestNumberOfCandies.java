class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List <Boolean> b = new ArrayList<>();
        int maxcandy=0;
        for(int i=0;i<candies.length;i++){
            if(candies[i]>maxcandy){
                maxcandy=candies[i];
            }
        }
        for(int i=0;i<candies.length;i++){
            if(maxcandy<=candies[i]+extraCandies){
                b.add(true);
            }
            else
                b.add(false);
        }
        return b;
    }
}