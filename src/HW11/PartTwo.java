package HW11;

import java.util.*;

public class PartTwo {

    public static void main(String[] args) {
        ListNode current = generateList(10);

        ListNode toPrint = deleteDuplicates(current);
        while (toPrint != null) {
            System.out.print(toPrint.val + " ");
            toPrint = toPrint.next;
        }
    }


    public static ListNode deleteDuplicates(ListNode node) {
        ListNode nodeHead = new ListNode();
        ListNode current = nodeHead;
        HashSet<Integer> nums = new HashSet<>();
        while (node != null) {
            nums.add(node.val);
            node = node.next;
        }
        for (int temp : nums) {
            ListNode nodeNew = new ListNode();
            nodeNew.val = temp;
            current.next = nodeNew;
            current = current.next;
        }
        return nodeHead.next;
    }

    public static ListNode generateList(int number) {
        ListNode head = new ListNode();
        ListNode current = head;
        Random random = new Random();
        for (int i = 0; i < number; i++) {
            ListNode node = new ListNode();
            node.val = random.nextInt(10);
            current.next = node;
            current = current.next;
        }
        return head.next;
    }

    static class ListNode {
        int val;
        ListNode next;
    }
}



