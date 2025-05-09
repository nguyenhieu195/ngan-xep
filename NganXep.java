package nganXep;

import java.util.Scanner;

class Node {
//
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

    Scanner sc = new Scanner(System.in);

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

    void nhap() {
        int x;
        while (true) {
            System.out.print("Nhập 1 số (!0) để thêm vào Ngăn xếp: ");
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
        System.out.print("Nội dung ngăn xếp: ");
        while (!EmptyS()) {
            int x = pop();
            System.out.print(x + " ");
            t.push(x);
        }
        while (!t.EmptyS()) {
            int x = t.pop();
            push(x);
        }
        System.out.println();
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

    int demLe() {
        int dem = 0;
        myStack t = new myStack();

        while (!EmptyS()) {
            int x = pop();
            t.push(x);
        }
        while (!t.EmptyS()) {
            int x = t.pop();
            if (x % 2 != 0) {
                dem++;
            }
            push(x);
        }
        return dem;
    }

    void timMax() {
        myStack t = new myStack();
        int max = 0;
        while (!EmptyS()) {
            int x = pop();
            System.out.println("x = " + x);
            t.push(x);
        }
        while (!t.EmptyS()) {
            int x = t.pop();
            if (max < x) {
                max = x;
            }
            push(x);
        }
        System.out.println("Phần tử lớn nhất trong mảng: " + max);
    }

    void xoaCuoi() {
        if (top == null) {
            System.out.println("Ngăn xếp rỗng!");
            return;
        }
        if (top.next == null) {
            top = null;
            return;
        }
        myStack t = new myStack();
        int dem1 = 0;
        int dem2 = 0;
        while (!EmptyS()) {
            int x = pop();
            t.push(x);
            dem1++;
        }
        while (!t.EmptyS()) {
            int x = t.pop();
            dem2++;
            if (dem1 > dem2) {
                push(x);
            } else {
                break;
            }
        }
    }

    void themcuoi2() {
        myStack t = new myStack();
        int x = 111;

        while (!EmptyS()) {
            t.push(pop());
        }
        push(x);
        while (!t.EmptyS()) {
            push(t.pop());
        }

    }

    void themCuoi() {
        myStack t = new myStack();
        System.out.print("Nhập phần tử muốn thêm: ");
        int a = sc.nextInt();

        if (top == null) {
            push(a);
            return;
        }

        while (!EmptyS()) {
            int x = pop();
            t.push(x);
        }
        while (!t.EmptyS()) {
            int x = t.pop();
            push(x);
        }
        push(a);
    }

    void themX2() {
        System.out.print("Nhập phần tử muốn thêm vào ngăn xếp: ");
        int x = sc.nextInt();
        System.out.print("Nhập vị trí muốn thêm vào ngăn xếp: ");
        int k = sc.nextInt();

        myStack t = new myStack();
        int dem = 1;
        while (!EmptyS()) {
            t.push(pop());
            if (dem == k) {
                break;
            }
            dem++;
        }
        push(x);
        while (!t.EmptyS()) {
            push(t.pop());
        }
    }

    void themX() {
        System.out.print("Nhập phần tử muốn thêm vào ngăn xếp: ");
        int x = sc.nextInt();
        System.out.print("Nhập vị trí muốn thêm vào ngăn xếp: ");
        int k = sc.nextInt();

        myStack t = new myStack();
        int dem = 0;
        while (!EmptyS()) {
            int a = pop();
            t.push(a);
        }
        while (!t.EmptyS()) {
            int a = t.pop();
            dem++;
            if (dem == k) {
                push(x);
            }
            push(a);
        }
    }

    void xoaX() {

    }
}

public class NganXep {

    public static void main(String[] args) {
        myStack m = new myStack();
        //    m.push(3);
        //    m.push(2);
        //    m.push(7);
        //    m.push(6);
        //    m.push(9);
        //    while (!m.EmptyS()) {
        //        System.out.println(m.pop() + " ");
        //    }
        m.nhap();
        m.in();
//        System.out.println("Số phần tử lẻ trong ngăn xếp: " + m.demLe());
//        m.timMax();
//        System.out.println("Ngăn xếp sau khi xoá cuối: ");
//        m.xoaCuoi();
//        m.in();
//        System.out.println("Ngăn xếp sau khi thêm cuối: ");
//        m.themCuoi();
//        m.in();
//        System.out.println("Ngăn xếp sau khi thêm: ");
//        m.themX();
//        m.in();
        System.out.println("Ngăn xếp sau khi thêm: ");
        m.themX2();
        m.in();

//        System.out.println("Ngăn xếp sau khi thêm cuối: ");
//        m.themcuoi2();
//        m.in();
    }
}
