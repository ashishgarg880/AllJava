package com.LinkedList;

public class StackClass {
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Stack {
        public static Node head;

        public static boolean isEmpty() {
            return head == null;
        }

        public static void push(int data) {
            Node node = new Node(data);
            if (isEmpty()) {
                head = node;
                return;
            }
            node.next = head;
            head = node;
        }

        public static int pop() {
            if (isEmpty()) {
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }

        public static int peek() {
            if (isEmpty()) {
                return -1;
            }
            return head.data;
        }

        public static void print() {
            if (isEmpty()) {
                System.out.println("StackClass is Empty");
            }
                while(head!=null){
                    System.out.print(head.data+"-> ");
                    head = head.next;
                }
            System.out.print("NULL");
        }
    }

        public static void main(String[] args) {
            Stack s1 = new Stack();
            s1.push(1);
            s1.push(2);
            s1.push(4);
            s1.print();
            System.out.println();
            s1.pop();
            s1.print();
        }
    }


