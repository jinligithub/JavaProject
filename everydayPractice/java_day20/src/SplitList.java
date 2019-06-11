/**
 * 链接：https://www.nowcoder.com/questionTerminal/0e27e0b064de4eacac178676ef9c9d70
 * 来源：牛客网
 *
 * [编程题]链表分割
 * 热度指数：38029时间限制：3秒空间限制：32768K
 *  算法知识视频讲解
 * 编写代码，以给定值x为基准将链表分割成两部分，所有小于x的结点排在大于或等于x的结点之前
 *
 * 给定一个链表的头指针 ListNode* pHead，请返回重新排列后的链表的头指针。注意：分割以后保持原来的数据顺序不变。
 */

/**
 * 算法思想：新建两个链表，一个保存比X小的数，有一个保存比X大的数，
 * 把链表遍历完后把比X大的数直接追加到比X小的数的链表后边
 */
public class SplitList {

    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
    public class Partition {
        public ListNode partition(ListNode pHead, int x) {
        if(pHead==null)
            return pHead;
            ListNode list1=new ListNode(0);//存放比X小的数
            ListNode list2=new ListNode(0);//存放比X大的数
            ListNode Head1=list1;
            ListNode Head2=list2;
            while(pHead != null){
                if(pHead.val < x){//把比X小的数放在list里面
                    list1.next=pHead;
                    list1=list1.next;
                }else{//把比X大的数放在List2里面
                    list2.next=pHead;
                    list2=list2.next;
                }
                pHead=pHead.next;//当前节点向后移动一位
            }
            list1.next=Head2.next;//把比X大的数直接追加到比X小的数的后边
            list2.next=null;
            return Head1.next;
        }
    }
}
