package linked.linked_0403;

public class TestLinked {
}
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
/*
876. 链表的中间结点
给定一个带有头结点 head 的非空单链表，返回链表的中间结点。
如果有两个中间结点，则返回第二个中间结点。

示例 1：
输入：[1,2,3,4,5]
输出：此列表中的结点 3 (序列化形式：[3,4,5])
返回的结点值为 3 。 (测评系统对该结点序列化表述是 [3,4,5])。
注意，我们返回了一个 ListNode 类型的对象 ans，这样：
ans.val = 3, ans.next.val = 4, ans.next.next.val = 5, 以及 ans.next.next.next = NULL.
示例 2：
输入：[1,2,3,4,5,6]
输出：此列表中的结点 4 (序列化形式：[4,5,6])
由于该列表有两个中间结点，值分别为 3 和 4，我们返回第二个结点。

提示：
给定链表的结点数介于 1 和 100 之间。
 */
/*
class Solution {
    public ListNode middleNode(ListNode head) {
        int mid = getLength(head)/2;
        for(int i=0; i<mid; i++){
            head = head.next;
        }
        return head;
    }
    private int getLength(ListNode head){
        ListNode cur = head;
        int count = 0;
        while(cur != null){
            count++;
            cur = cur.next;
        }
        return count;
    }
}*/
/*
链表中的第K个节点
输入一个链表，输出该链表中倒数第k个结点。
 */
/*
public class Solution {
    public ListNode FindKthToTail(ListNode head,int k) {
        int i = getLength(head)-k;
        if(i<0){
            return null;
        }
        for(int j=0; j<i; j++){
            head = head.next;
        }
        return head;
    }
    private int getLength(ListNode head){
        ListNode cur = head;
        int count = 0;
        while(cur != null){
            count++;
            cur = cur.next;
        }
        return count;
    }
}*/

/*
21. 合并两个有序链表
将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
示例：
输入：1->2->4, 1->3->4
输出：1->1->2->3->4->4
 */
/*
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = null;
        ListNode cur = head;
        while(l1 != null || l2 != null){
            if(l1 != null && l2 != null){
                if(l1.val <= l2.val){
                    if(head == null){
                        head = l1;
                        cur = head;
                    }else{
                        cur.next = l1;
                        cur = cur.next;
                    }
                    l1 = l1.next;
                }else{
                    if(head == null){
                        head = l2;
                        cur = head;
                    }else{
                        cur.next = l2;
                        cur = cur.next;
                    }
                    l2 = l2.next;
                }
            }else if(l1 == null){
                if(head == null){
                    head = l2;
                }else{
                    cur.next = l2;
                }
                break;
            }else{
                if(head == null){
                    head = l1;
                }else{
                    cur.next = l1;
                }
                break;
            }
        }
        return head;
    }
}*/

/*
86. 分隔链表
给定一个链表和一个特定值 x，对链表进行分隔，使得所有小于 x 的节点都在大于或等于 x 的节点之前。
你应当保留两个分区中每个节点的初始相对位置。
示例:
输入: head = 1->4->3->2->5->2, x = 3
输出: 1->2->2->4->3->5
 */
/*
class Solution {
    public ListNode partition(ListNode head, int x) {
        // write code here
        //[1,3,-1,5,2,1]  3
        if(head != null){
            ListNode cur = head;
            ListNode flag = null;
            while(cur.next != null){
                if(cur == head && cur.val <x){
                    flag = cur;
                }
                if(cur.next.val <x){
                    if(flag != cur){
                        ListNode tmp = cur.next;
                        cur.next = cur.next.next;
                        if(flag == null){
                            tmp.next = head;
                            head = tmp;
                        }else{
                            tmp.next = flag.next;
                            flag.next = tmp;
                        }
                        flag = tmp;
                    }else{
                        cur = cur.next;
                        flag = cur;
                    }
                }else{
                    cur = cur.next;
                }
            }
        }
        return head;
    }
}
*/
