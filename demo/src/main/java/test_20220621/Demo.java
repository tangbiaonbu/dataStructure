package test_20220621;

import java.util.Objects;
import java.util.Stack;

/**
 * @author 唐少
 * @version 1.0
 * @description: 在链表中找到第一个含有某值的节点并删除该节点的代码
 * @date 2022/6/21 22:06
 */
public class Demo {
    public static void main(String[] args) {
        ListNode a = new ListNode("a");
        ListNode b = new ListNode("b");
        ListNode c = new ListNode("c");
        ListNode d = new ListNode("d");
        ListNode e = new ListNode("e");
        ListNode f = new ListNode("f");

        String value = "d";

        a.setNext(b);
        b.setNext(c);
        c.setNext(d);
        d.setNext(e);
        e.setNext(f);
        printfTailToStart2(a);
    }

    /**
     * 从尾到头打印链表
     *
     * @param a
     */
    private static void printfTailToStart(ListNode a) {
        Stack<String> nodes = new Stack<>();
        while (Objects.nonNull(a)) {
            nodes.push(a.getValue());
            a = a.getNext();
        }
        while (!nodes.isEmpty()) {
            String pop = nodes.pop();
            System.out.println(pop);
        }
    }

    /**
     * 从尾到头打印链表2
     *
     * @param a
     */
    private static void printfTailToStart2(ListNode a) {
        if (Objects.isNull(a)) {
            return;
        }
        if (a.getNext() != null) {
            // a b c d e f
            printfTailToStart2(a.getNext());
        }
        System.out.println(a.getValue());
    }


    /**
     * 删除节点
     *
     * @param head
     * @param value
     * @return
     */
    private static ListNode removeNode(ListNode head, String value) {
        // 异常边界
        if (Objects.isNull(head) || Objects.isNull(value)) {
            return head;
        }
        if (head.getValue().equals(value)) {
            return head.getNext();
        }
        ListNode pre = head;
        ListNode cur = head;
        cur = cur.getNext();
        while (Objects.nonNull(cur)) {
            if (cur.getValue().equals(value)) {
                pre.setNext(cur.getNext());
            }
            cur = cur.getNext();
            pre = pre.getNext();
        }
        return head;
    }
}
