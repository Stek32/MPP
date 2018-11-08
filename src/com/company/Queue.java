package com.company;

public class Queue {

    private String front;

    public String getFront() {

        if(ls.IsEmpty()){

            front ="Queue is empty";
        }
        else {
            front=ls.Head.Value;


        }

        return front;
    }

    LinkedList ls;

    public Queue(){

        ls=new LinkedList();

    }

    public void Enqueue(String Value){

        ls.Add(Value);

    }

    public void Dequeue(){

        ls.Delete(0);
    }

    public int Size(){

        return ls.Length();
    }

}
