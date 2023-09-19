package com.List.LinkedList;

public class QueueeClass {
    static class Queue{
        static int arr[];
        static int size;
        static int rear= -1;

        Queue(int n){
            arr = new int[n];
            this.size = n;
        }

        public static boolean isEmpty(){
            return rear == -1;
        }
        public static void push(int data){
            if(rear==size-1){
                System.out.println("FULL QUEUE");
                return;
            }
            rear++;
            arr[rear] = data;
        }

        public static int remove(){
            if (isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }
            int front = arr[0];
            for(int i=0;i<rear;i++){
                arr[i] =   arr[i+1];
            }
            rear--;
            return front;
        }

        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }
            return arr[0];
        }
    }
    public static void main(String[] args) {
        Queue q1  =new Queue(5);
        q1.push(21);
        q1.push(20);
        q1.push(15);
        q1.push(10);
        q1.push(6);
        while(!q1.isEmpty()){
            System.out.println(q1.peek()+" ");
            q1.remove();
        }
    }
}
