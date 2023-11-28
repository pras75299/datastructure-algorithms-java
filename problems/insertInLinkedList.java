/*You are given A which is the head of a linked list. Also given is the value B and position C. 
Complete the function that should insert a new node with the said value at the given position

Notes: 
1-In case the position is more than length of linked list, simply insert the new node at the tail only.
2-In case the pos is 0, simple insert the new node at the head only
3-Follow 0-based indexing for the node numbering
*/

public class Solution{
    public ListNode solve(ListNode A, int B, int C){
        ListNode n = new ListNode(B); // create a new listnode
        ListNode temp = A;
        if(C <= 0){
            n.next = A;
            A = n;
        } else{
            for(int i = 1; i < C; i++){
                if(temp.next == null){
                    temp.next = n;
                    return A;
                }

                temp = temp.next;
            }

            n.next = temp.next;
            temp.next = n;
        }    
        return A;    
    }
}