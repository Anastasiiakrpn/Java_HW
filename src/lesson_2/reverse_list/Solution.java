package lesson_2.reverse_list;

class Solution {
    public static ListNode reverseList(ListNode head) {
        ListNode currNode = head;
        ListNode prevNode = null;

        while (currNode != null) {
            ListNode nextNode = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode;
        }
        return prevNode;
    }

    public static void printReverse(ListNode head) {
        if (head == null) {
            System.out.println("head is null");
            return;
        }

        ListNode newNode = head;
        while (newNode != null) {
            System.out.print(newNode.val + " ");
            newNode = newNode.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        // head = [1,2,3,4,5]
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(3);
        head1.next.next.next = new ListNode(4);
        head1.next.next.next.next = new ListNode(5);
        System.out.print("Example 1 Input: ");
        printReverse(head1);
        ListNode reverseHead1 = reverseList(head1);
        System.out.print("Output: ");
        printReverse(reverseHead1);

        // head = [1,2]
        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(2);
        System.out.print("Example 2 Input: ");
        printReverse(head2);
        ListNode reverseHead2 = reverseList(head2);
        System.out.print("Output: ");
        printReverse(reverseHead2);

        // head = []
        ListNode head3 = null;
        System.out.print("Example 3 Input: ");
        printReverse(head3);
        ListNode reversedHead3 = reverseList(head3);
        System.out.print("Output: ");
        printReverse(reversedHead3);
    }
}

