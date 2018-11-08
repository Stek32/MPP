package com.company;

public class LinkedListCircular {

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


    public LinkedListCircular(){

    }

    public Node Head;

    public LinkedListCircular(String Value){

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


                while (TempNode.NextNode!=Head){

                    TempNode=TempNode.NextNode;

                }

                Head=Head.NextNode;

                TempNode.NextNode=Head;


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


    public void Addatbeggining(String Value){

        Node newNode=new Node(Value);

        if(Head == null){

            Head=new Node(Value);

        }
        else {

//            newNode.Value=Head.Value;
//            newNode.NextNode=Head.NextNode;
//
//            Head.Value=Value;
//            Head.NextNode=newNode;
//
//
            Node TempNode=Head;

            while (TempNode.NextNode!=Head){

                TempNode=TempNode.NextNode;
            }

            newNode.NextNode=Head;

            Head=newNode;

            TempNode.NextNode=Head;

        }

    }

    public void Add(String Value){

        //if linked list is empty
        if(this.Head == null){

            Head=new Node(Value);
            Head.NextNode=Head;

        }
        else {

            Node TempNode=Head;

            while (TempNode.NextNode!=Head){

                TempNode=TempNode.NextNode;


            }

            TempNode.NextNode=new Node(Value);
            TempNode.NextNode.NextNode=Head;

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

            while (TempNode.NextNode != Head) {

                TempNode = TempNode.NextNode;

                length++;
            }
        }
        return length;
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

    @Override
    public String toString() {

        var TempNode=Head;
        String lst=Head.Value;

        while (TempNode.NextNode!=Head){

            lst=lst+','+TempNode.NextNode.Value;

            TempNode=TempNode.NextNode;

        }

        return  lst;
    }
}
