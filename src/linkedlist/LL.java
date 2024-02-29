package linkedlist;

import javax.lang.model.type.NullType;

public class LL {

    Node head ;
    Node tail ;
    int size ;
    public LL(){
        this.size = 0 ;
    }
    public class Node{
        public int value;
        public Node next;

        public Node(int value){
            this.value = value;
        }
    }

    public void insertATEND(int value){
        Node newnode = new Node(value);
        if(this.size == 0){
            head = newnode;
            tail = newnode;
            this.size++;
        }
        else{
            tail.next = newnode;
            tail = newnode;
            this.size++;
        }
    }

    public void insertatithposition(int value,int pos){
        Node newnode = new Node(value);
        if(pos > this.size+1){
            System.out.println("not possible");
        }
        else{
            if(pos == this.size + 1){
                insertATEND(value);
            }
            else if(pos == 0){
                insertatbeginning(value);
            }
            else{
                int index = 1 ;
                Node temp = this.head;
                while (index <= pos -2){
                    temp = temp.next;
                    index++;
                }
                newnode.next = temp.next;
                temp.next = newnode;
                this.size++;
            }

        }
    }

    public void insertatbeginning(int value){
        Node newnode = new Node(value);
        if(this.size == 0 ){
            head = newnode;
            tail = newnode;
            this.size++;
        }
        else{
            newnode.next = head;
            head = newnode;
            this.size++;
        }
    }


    public void insert(int value){
        Node newnode = new Node(value);
        if(this.head == null){
            head = newnode;
            this.size++;
        }
        else{
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newnode;
            this.size++;
        }
    }

    public void display(){
        Node temp = this.head;
        while(temp.next != null ){
            System.out.println(temp.value);
            temp = temp.next;
        }
        System.out.println(temp.value);
    }



}
