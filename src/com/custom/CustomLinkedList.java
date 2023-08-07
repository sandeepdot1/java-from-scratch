
class Node {
    int data;
    Node next;
    Node (int data) {
        this.data = data;
        this.next = null;
    }
}

class CustomLinkedList {
    Node n;
    private int size = 0;
    CustomLinkedList(int data) {
        n = new Node(data);
        size++;
    }

    void append(int ele) {
        if (n == null) {
            n = new Node(ele);
            size++;
            return;
        }
        Node temp = n;
        while(temp.next != null) {
            temp = temp.next;
        }
        size++;
        temp.next = new Node(ele);
    }

    int remove() {
        if (n == null) {
            return -1;
        }
        if (n.next == null) {
            size--;
            int ele = n.data;
            n = null;
            return ele;   
        }
        Node temp = n;
        Node prev = null;
        while(temp.next != null) {
            prev = temp;
            temp = temp.next;            
        }
        size--;
        prev.next = null;
        return temp.data;
    }

    void printList() {
        Node temp = n;
        while(temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    void reverse() {
        Node prev = null;
        Node curr = n;
        Node next = curr;

        while(curr != null) {
            next = curr.next;
            curr.next = prev;    
            prev = curr;    
            curr = next;
        }
        n = prev;
    }

    int length() {
        return size;
    }
}