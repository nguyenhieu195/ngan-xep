/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nganXep;

import java.util.Scanner;

class Node {

    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }

    Node(int x, Node t) {
        data = x;
        next = t;
    }

    public String toString() {
        String t = " " + data + "->";
        return t;
    }
}

class myStack {

    Node top; // đầu

    public myStack() { // khởi tạo ngăn xếp rỗng 
        top = null;
    }

    boolean EmptyS() { // kiểm tra ngăn xếp có rỗng không
        return top == null;
    }

    void push(int x) { // đẩy vào
        top = new Node(x, top);
    }

    int pop() { // lấy ra 
        int x = 0;
        if (top == null) {
            System.out.println("ngăn xếp rỗng");
        } else {
            x = top.data;
            top = top.next;
        }
        return x;
    }

    void nhap(Scanner sc) {
        int x;
        while (true) {
            System.out.println("Nhập 1 số <!0> để thêm vào Ngăn xếp: ");
            x = sc.nextInt();
            if (x == 0) {
                break;
            }
            push(x);
        }
        System.out.println("Đã thêm xong !");
    }

    void in() {
        myStack t = new myStack();
        System.out.println("Nội dung ngăn xếp:");
        while (!EmptyS()) {
            int x = pop();
            System.out.print(x + " ");
            t.push(x);
        }
        while (!t.EmptyS()) {
            int x = t.pop();
            push(x);
        }
    }

    void tong() {
        int k = 0;
        myStack t = new myStack();
        int x = 0;
        while (!EmptyS()) {
            x = pop();
            k = k + x;
            t.push(x);
        }
        while (!t.EmptyS()) {
            x = t.pop();
            push(x);
        }
        System.out.println("Tổng: " + k);
    }
}

public class NganXep {

    public static void main(String[] args) {
        myStack m = new myStack();
        Scanner sc = new Scanner(System.in);
        m.push(3);
        m.push(2);
        m.push(7);
        m.push(6);
        m.push(9);
        while (!m.EmptyS()) {
            System.out.println(m.pop() + " ");
        }
//        m.nhap(sc);
//        m.in();
    }
}
