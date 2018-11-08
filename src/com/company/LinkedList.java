package com.company;

public class LinkedList {

    public class Node{

        public String Value;
        public Node NextNode;


        public Node(){

        }

        public Node(String value){

            this.Value=value;

        }


        public Node NextNode(){

            return this.NextNode;

        }

    }


    public LinkedList(){

    }

    public Node Head;

    public LinkedList(String Value){

        this.Head=new Node(Value);


    }

    //assuming my list index begins at 0
    public void Delete(int Index){

        if(this.Head == null){

            System.out.println("List is Empty, Must Contain atleast an element before");
        }

        else if((this.Length()-1) < Index){

            System.out.println("Error, Index out of range");
        }

        else {

            int IndexCount=0;

            Node TempNode=Head;
            Node PreviousNode=null;

            if(Index==0){

             Head=TempNode.NextNode;

            }

            else {

                while (TempNode.NextNode != null && IndexCount != Index) {

                    PreviousNode = TempNode;
                    TempNode = TempNode.NextNode;
                    IndexCount++;

                }

                PreviousNode.NextNode = TempNode.NextNode;
            }
        }

    }

    public void Add(String Value){

        //if linked list is empty
        if(this.Head == null){

            Head=new Node(Value);

        }
        else {

            Node TempNode=Head;

            while (TempNode.NextNode!=null){

                TempNode=TempNode.NextNode;

            }

            TempNode.NextNode=new Node(Value);

          //  System.out.println("Was not Null");

        }

    }

    public boolean IsEmpty(){

        if(Head==null){
            return  true;
        }
        else {
            return  false;
        }
    }

    public int Length(){

        int length;

        if(this.Head==null){

            length=0;
        }
        else {

            length = 1;

            Node TempNode = Head;

            while (TempNode.NextNode != null) {

                TempNode = TempNode.NextNode;

                length++;
            }
        }
        return length;
    }

    public void AddAtBeginning(String Value){

        if(Head == null)
        {
            Head=new Node(Value);
        }

        else
            {

                Node newNode = new Node(Value);

            newNode.NextNode = Head;

            Head = newNode;
        }
    }

    public void Remove(){

        if(this.IsEmpty()){

            System.out.println("List is empty, there is nothing to remove");
        }

        else if(Head.NextNode==null)
        {
            Head=null;
        }

        else {

            Node TempNode=Head;

            while (TempNode.NextNode.NextNode!=null){

                TempNode=TempNode.NextNode;

            }

            TempNode.NextNode=null;

        }

    }
}
