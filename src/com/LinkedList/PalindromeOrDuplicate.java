package com.LinkedList;

import java.util.Stack;

public class PalindromeOrDuplicate {
        Node head;
        class Node{
            int data;
            Node next;
            Node(int data){
                this.data = data;
                this.next = null;
            }
        }

        void push(int data){
            Node node = new Node(data);  //12
            if(node == null){
                System.out.print("List is empty");
            }
            node.next = head;
            head = node;
        }

        void DuplicateElementRemove(){
            Node curr = head;   //
            while(curr.next != null){
                Node temp = curr;
                while(temp!=null && temp.data == curr.data){  //19 === 19
                    temp = temp.next;
                    // System.out.print("temp data"+temp.data);
                }
                curr.next = temp;
                curr = curr.next;
            }
        }

        boolean PalindromeElementIs(){
            Node curr = head;
            Stack<Integer> stk = new Stack<>();
            while(curr != null){
                stk.push(curr.data);
                curr = curr.next;
            }
            while(head!=null){
                int data =  stk.pop();
                if(head.data == data){
                    return true;
                }
                return false;
            }
            head = head.next;
            return false;
        }

        void print(){
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
        }
        public static void main (String[] args) {
            PalindromeOrDuplicate list = new PalindromeOrDuplicate();
            list.push(1);  //1 2 3 3 2 1
            list.push(2);list.push(3);list.push(3);list.push(2);list.push(1);
            list.print();
            System.out.println();
            list.DuplicateElementRemove();
            list.print();
            boolean state = list.PalindromeElementIs();
            System.out.println(state);
        }
    }
