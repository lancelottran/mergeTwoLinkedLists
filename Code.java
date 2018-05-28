// Definition for singly-linked list:
// class ListNode<T> {
//   ListNode(T x) {
//     value = x;
//   }
//   T value;
//   ListNode<T> next;
// }
//
ListNode<Integer> mergeTwoLinkedLists(ListNode<Integer> l1, ListNode<Integer> l2) {
    ListNode<Integer> res = null;
    ListNode<Integer> temp = null;
    ListNode<Integer> prev = null;
    
    while(l1 != null || l2 != null)
    {           
        if(l2 == null || l1 != null && l1.value <= l2.value)
        {
            temp = new ListNode<Integer>(l1.value);
            l1 = l1.next;
        }
        else
        {
            temp = new ListNode<Integer>(l2.value);
            l2 = l2.next;
        }
        
        
        if(res == null)
            res = temp;
        else
            prev.next = temp;
        
        prev = temp;
    }
    
    return res;
}
