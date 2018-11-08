package com.company;

public class Stack {

    private String top;

    LinkedList ls=new LinkedList();


    public String getTop() {

        top=ls.Head.Value;
        return top;
    }



    public Stack(){



    }

    public void Push(String Value){

        ls.AddAtBeginning(Value);

    }


    public void Pop(){

        ls.Delete(0);
    }

    public int Size(){

        return ls.Length();
    }

}
