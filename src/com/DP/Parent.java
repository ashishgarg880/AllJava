package com.DP;

class Parent {
    public void hello() {
        System.out.println("hello from Parent");
    }
}

class Child extends Parent {
    public void hello() {
        System.out.println("hello from Child");
    }
}

class MethodOverriding {
    public static void main(String[] args) {
        Parent child = new Child();
        child.hello();
    }
}


// class A {
//        public void A(){
//            System.out.print("ONE, ");
//        }
//    }
// class B extends A {
//        public void B() {
//            System.out.print("TWO");
//        }
//        public static void main(String[] args) {
//           B b = new B();
//        }
//    }
//}

