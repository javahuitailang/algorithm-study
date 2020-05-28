package com.algorithm.offer.part1;

import java.util.Stack;

/**
 * 《剑指offer》第五题
 * 题目：输入个链表的头结点，从尾到头反过来打印出每个结点的值。
 * @Author meimingzhi
 * @Date 2020/2/12 7:16 下午
 */
//1->2->3->4->5
public class Test04 {
    static class Node{
        int data;
        Node next;
    }
    public static void printReverseListNode(Node node){
        Stack<Node> stack = new Stack<>();
        while (node != null){
            stack.push(node);
            node = node.next;
        }
        while (!stack.isEmpty()){
            System.out.println(stack.pop().data);
        }
    }

    public static void main(String[] args) {
        Node node = new Node();
        node.data = 1;
        node.next = new Node();
        node.next.data = 2;
        node.next.next = new Node();
        node.next.next.data = 3;
        node.next.next.next = new Node();
        node.next.next.next.data = 4;
        printReverseListNode(node);
    }
}
