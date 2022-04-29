class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null)
            return null; 

        int length1 = 1;
        int length2 = 1;
        ListNode c1  = l1;
        ListNode c2 = l2;

        while (c1.next != null) {
            length1 += 1;
            c1 = c1.next; 
        }

        while (c2.next != null) {
            length2 += 1;
            c2 = c2.next; 
        }

        if (length1 > length2) {
            int diff = length1 - length2; 
            for (int i = 0; i < diff; i ++) {
                ListNode newNode = new ListNode(0);
                c2.next = newNode;
                c2 = c2.next; 
            }
        } else if (length1 < length2) {
            int diff = length2 - length1; 
            for (int i = 0; i < diff; i ++) {
                ListNode newNode = new ListNode(0);
                c1.next = newNode;
                c1 = c1.next; 
            }
        }

        ListNode answer = new ListNode(0);
        ListNode current = answer;
        Boolean isCarry = false; 
        while (l1 != null && l2 != null) {
            ListNode newNode = new ListNode(0);
            int value = l1.val + l2.val; 
            if (isCarry == true) 
                value += 1;
            isCarry = false; 
            if (value < 10)
                newNode.val = value;
            else {
                newNode.val = value % 10; 
                isCarry = true; 
            } 

            current.next = newNode;
            current = current.next;  
            l1 = l1.next;
            l2 = l2.next;
        } 

        if (isCarry == true) {
            ListNode newNode = new ListNode(1);
            current.next = newNode; 
        }

        return answer.next;    
    }
}