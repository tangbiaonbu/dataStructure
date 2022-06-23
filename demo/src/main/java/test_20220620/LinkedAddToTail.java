//package test_20220620;
//
//import java.util.Objects;
//
///**
// * @author 唐少
// * @version 1.0
// * @description: TODO
// * @date 2022/6/20 23:21
// */
//public class LinkedAddToTail {
//
//    public static void main(String[] args) {
//        test_20220621.ListNode a = new test_20220621.ListNode("a", null);
//        test_20220621.ListNode b = new test_20220621.ListNode("b", a);
//        test_20220621.ListNode c = new test_20220621.ListNode("c", b);
//        String value ="d";
//
//        test_20220621.ListNode toTail = addToTail(c, value);
//        while (toTail.getNext()!=null){
//            System.out.println(toTail.getValue());
//            toTail = toTail.getNext();
//            if (toTail.getNext()==null){
//                System.out.println(toTail.getValue());
//            }
//        }
//
//    }
//
//    public static test_20220621.ListNode addToTail(test_20220621.ListNode node, String value) {
//        // 对新节点进行封装
//        test_20220621.ListNode newNode = new test_20220621.ListNode();
//        newNode.setNext(null);
//        newNode.setValue(value);
//
//        if (Objects.isNull(node)){
//            return newNode;
//        }
//        test_20220621.ListNode ln = node;
//        // 找到最后一个节点
//        while (ln.getNext()!=null){
//            ln = ln.getNext();
//        }
//        ln.setNext(newNode);
//        return node;
//    }
//}
