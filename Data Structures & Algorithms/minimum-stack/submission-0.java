class MinStack {
   int min=Integer.MAX_VALUE;
   List<Integer>list;
    public MinStack() {
        list=new ArrayList<>();
    }
    
    public void push(int val) {
       min= Math.min(val,min);
        list.add(val);
        
    }
    
    public void pop() {
         min=Integer.MAX_VALUE;
        list.remove(list.size()-1);
        for(int i=0;i<list.size();i++){
           
            min=Math.min(list.get(i),min);
        }
    }
    
    public int top() {
        return list.get(list.size()-1);
    }
    
    public int getMin() {
       return min;  
    }
}
