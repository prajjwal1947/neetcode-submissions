class Solution {

    public List<String> generateParenthesis(int n) {
        List<String>str= new ArrayList();
        helperFunction(n,str,0,0,"");
        return str;
    }

    public void helperFunction(int n, List<String>list,int open, int close, String str){
      if(open+close==n*2){
        list.add(str);
      }
      if(open+close>n*2){
        return;
      }
       if(open<close){
        helperFunction(n,list,open+1,close,str+'(');
     
        
       }
        helperFunction(n,list,open,close+1,str+')');
      
     
    }
}
