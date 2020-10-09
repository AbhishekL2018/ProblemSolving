package LinkedList;

class Node {
    public int data;
    public Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    public Node head;
    public Node tail;
    public int size;

    public void addAtLast(int data) {
        Node node = new Node(data);
        if (size == 0) {
            head = tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
        size++;
    }

    public void addAtFirst(int data) {
        Node node = new Node(data);
        if (size == 0) {
            head = tail = node;
        } else {
            node.next = head;
            head = node;
        }
        size++;
    }

    public void addAtAnyPosition(int data, int index) {
        if (index < 0 || index > size) {
            System.out.println("invalid index");
        } else if (index == 0) {
            addAtFirst(data);
        } else if (index == size) {
            addAtLast(data);
        } else {
            Node node = new Node(data);
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            node.next = temp.next;
            temp.next = node;
            size++;
        }
    }

    public int getFirst() {
        if (size == 0) {
            System.out.println("List is empty");
        } else {
            return head.data;
        }
        return -1;
    }

    public int getLast() {
        if (size == 0) {
            System.out.println("List is empty");
        } else {
            return tail.data;
        }
        return -1;
    }

    public int getAtAnyPosition(int index) {
        if (size == 0) {
            System.out.println("List is empty");
        } else if (index < 0 || index >= size) {
            System.out.println("invalid index position");
        } else {
            Node temp = head;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            return temp.data;
        }
        return -1;
    }

    public void removeFirst() {
        if (size == 0) {
            System.out.println("empty list");
        } else if (size == 1) {
            head = tail = null;
            size = 0;
        } else {
            head = head.next;
            size--;
        }
    }

    public void removeLast() {
        if (size == 0) {
            System.out.println("empty list");
        } else if (size == 1) {
            head = tail = null;
            size = 0;
        } else {
            Node temp = head;
            for (int i = 0; i < size - 2; i++) {
                temp = temp.next;
            }
            tail = temp;
            tail.next = null;
            size--;
        }
    }

    public void removeFromAnyPosition(int index) {
        if (size == 0) {
            System.out.println("List is empty");
        } else if (index < 0 || index >= size) {
            System.out.println("invalid index position");
        } else if (index == 0) {
            removeFirst();
        } else if (index == size - 1) {
            removeLast();
        } else {
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            size--;
        }
    }

    private Node getNodeAtAnyPosition(int index) {
        if (size == 0) {
            System.out.println("List is empty");
        } else if (index < 0 || index >= size) {
            System.out.println("invalid index position");
        } else {
            Node temp = head;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            return temp;
        }
        return null;
    }


    public void reverseDisplay() {
        int leftIndex = 0;
        int rightIndex = size - 1;
        while (leftIndex < rightIndex) {
            Node leftNode = getNodeAtAnyPosition(leftIndex);
            Node rightNode = getNodeAtAnyPosition(rightIndex);
            int node = leftNode.data;
            leftNode.data = rightNode.data;
            rightNode.data = node;

            leftIndex++;
            rightIndex--;
        }
        displayList();
    }

    public int midElementDisplay(){
        Node slow = head;
        Node fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;
    }

    public int KthFromLast(int k){
        Node slow = head;
        Node fast = head;
        for(int i=0; i<k; i++){
            fast = fast.next;
        }
        while (fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }
        return slow.data;
    }

    public void displayList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    public void test(){
        Node node = new Node(10);
        System.out.println((node.next.next == null) ? "yes":"no");
    }
}

public class createLinkedList {
    public static void main(String[] args) {
        LinkedList lt = new LinkedList();
        lt.addAtFirst(20);
        lt.addAtLast(30);
        lt.addAtLast(50);
        lt.addAtLast(70);
        lt.addAtLast(80);
        lt.addAtFirst(10);
        lt.addAtAnyPosition(40, 3);
        lt.addAtAnyPosition(60, 5);
        lt.displayList();
        System.out.println();
        System.out.println(lt.KthFromLast(7));

    }
}
