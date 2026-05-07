class LinkedList {
     int val;
     LinkedList next;
     LinkedList list;
    public LinkedList() {
     list= new LinkedList();
    }

    public int get(int index) {
        
    }

    public void insertHead(int val) {
        list.val=val;
    }

    public void insertTail(int val) {
        LinkedList temp=list;
        while(temp!=null){
            temp=temp.next;
        }
        temp.val=val;
    }

    public boolean remove(int index) {
      int count =0;
      LinkedList temp=list;
      while(temp.next!=null && count!=index){
        
        temp=temp.next;
        count++;
      }
      temp=null;

    }

   public ArrayList<Integer> getValues() {
    ArrayList<Integer> arrlist = new ArrayList<>();
    LinkedList temp = list;
    while (temp != null) {
        arrlist.add(temp.val);
        temp = temp.next;
    }
    return arrlist;
}

}
