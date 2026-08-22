class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        Arrays.sort(asteroids);
        int i = 0;
        long val = mass;
        while(i <= asteroids.length - 1){
            if(asteroids[i] <= val)
            {
                val += asteroids[i];
                i++;
            }
            else{
                return false;
            }
        }
        return true;
    }
}