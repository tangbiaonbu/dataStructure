package test_20220621;

import test_20220620.ListNode;

import java.util.Objects;

/**
 * @author 唐少
 * @version 1.0
 * @description: 在链表中找到第一个含有某值的节点并删除该节点的代码
 * @date 2022/6/21 22:06
 */
public class Demo {
    public static void main(String[] args) {
        ListNode a = new ListNode("a", null);
        ListNode b = new ListNode("b", a);
        ListNode c = new ListNode("c", b);
        ListNode d = new ListNode("d", c);
        ListNode e = new ListNode("e", d);
        ListNode f = new ListNode("f", e);
        // f->e->d->c->b->a
        String value = "d";
        // f->e->c->b->a
        ListNode node = removeNode(f, value);
        System.out.println(node);
    }

    private static ListNode removeNode(ListNode ln, String value) {
        // 异常边界
        if (Objects.isNull(ln) || Objects.isNull(value)) {
            return ln;
        }
        // 先判断第一个节点是否是相同
        if (ln.getValue().equals(value)) {
            return ln.getNext();
        } else {
            ListNode needDeleteNode = ln;
            // 向下递归遍历  f->e->d->c->b->a
            while (ln.getNext() != null && !ln.getValue().equals(value)) {
                needDeleteNode.setValue(ln.getValue());
                needDeleteNode.setNext(ln.getNext());
                ln = ln.getNext();
            }
            // 相同的时候进行连接
            if (ln.getNext() != null && ln.getValue().equals(value)) {


            }
        }
        return null;
    }
}
