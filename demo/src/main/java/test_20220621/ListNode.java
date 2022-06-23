package test_20220621;

/**
 * @author 唐少
 * @version 1.0
 * @description: TODO
 * @date 2022/6/20 23:24
 */
public class ListNode {

    /**
     * 表示当前node的值
     */
    private String value;

    /**
     * 当前节点的下一个节点
     */
    private ListNode next;

    public ListNode() {
    }

    public ListNode(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }
}
