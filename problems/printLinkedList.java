//You are given A which is the head of a LinkedList. Print the linked list in space seprated manner.
//Note: The last node value must also be succeeded by a space and after printing the entire list you should print a new line

public class Solution{
    public void solve(ListNode A){
        ListNode temp = A;

        while(temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}