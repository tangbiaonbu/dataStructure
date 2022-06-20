package test_20220620;

import java.util.Objects;

/**
 * @author 唐少
 * @version 1.0
 * @description: TODO
 * @date 2022/6/20 23:21
 */
public class LinkedAddToTail {

    public static void main(String[] args) {
        ListNode a = new ListNode("a", null);
        ListNode b = new ListNode("b", a);
        ListNode c = new ListNode("c", b);
        String value ="d";

        ListNode toTail = addToTail(c, value);
        while (toTail.getNext()!=null){
            System.out.println(toTail.getValue());
            toTail = toTail.getNext();
            if (toTail.getNext()==null){
                System.out.println(toTail.getValue());
            }
        }

    }

    public static ListNode addToTail(ListNode node, String value) {
        // 对新节点进行封装
        ListNode newNode = new ListNode();
        newNode.setNext(null);
        newNode.setValue(value);

        if (Objects.isNull(node)){
            return newNode;
        }
        ListNode ln = node;
        // 找到最后一个节点
        while (ln.getNext()!=null){
            ln = ln.getNext();
        }
        ln.setNext(newNode);
        return node;
    }
}
