class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        
        Map<Double,Integer>map=new HashMap<>();
        int count=0;
        for(int i=0;i<position.length;i++){
          double time=(target - position[i]) / (double)speed[i];
          if(map.containsKey(time)){
            int place=map.get(time);
            if(place<=position[i]){
              count--;
            }
          }
          map.put(time,position[i]);
          count++;
        }

        return count;
    }
}
