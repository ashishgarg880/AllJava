package com.LinkedList;

import org.w3c.dom.Node;

public class LinkedList {
    Node head;
    class Node{
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
        }
    }

    public void addFirst(String data){
        Node node = new Node(data);
        if(head == null){
            head = node;
            return;
        }
        node.next = head;
        head = node;
    }

    public void addLast(String data){
        Node node = new Node(data);
        if(head == null){
            head = null;
            return;
        }
        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next = node;
    }

    public void deleteFirst(){
        if(head == null){
            System.out.println("List is already Empty");
            return;
        }
        head = head.next;
    }

    public void deleteLast(){
        if(head == null){
            System.out.println("List is already Empty");
            return;
        }

        if(head.next == null){
            head = null;
            return;
        }

        Node secondLast = head;
        Node lastNode = head.next;
        while(lastNode.next != null) {
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }

    public void printList(){
        if(head == null){
            System.out.println("List is Empty");
            return;
        }
        Node curr = head;
        while(curr!=null){
            System.out.print(curr.data+"->");
            curr = curr.next;
        }
        System.out.print(" Null");
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addFirst("Hello");
        list.addLast("How");
        list.addLast("are");
        list.addLast("you");
        list.printList();
        System.out.println();
        list.deleteLast();
        list.printList();
        System.out.println();
        list.deleteFirst();
        list.printList();
    }
}
