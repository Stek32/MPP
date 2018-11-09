package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        LinkedList ls=new LinkedList();
        ls.Add("Hello");
        ls.Add("World");
        ls.Add("Africa");
        ls.Add("Europe");



        ls.AddAtBeginning("Beginning");

        ls.Delete(0);
//        LinkedListCircular lsc=new LinkedListCircular();
//        lsc.Add("Hello");
//        lsc.Add("World");
//        lsc.Add("Africa");
//        lsc.Add("Europe");
//
//        lsc.Addatbeggining("Hi");
//        lsc.Addatbeggining("Holla");
//       // lsc.Delete(0);

        //System.out.println(ls.Head.Value);

        Stack stack=new Stack();

        stack.Push("Hello");
        stack.Push("World");
        stack.Push("Africa");


        stack.Pop();

        //System.out.println("From Stack after popping: "+stack.getTop());


        Queue queue=new Queue();
        queue.Enqueue("Hello");
        queue.Enqueue("World");

        queue.Dequeue();

        //System.out.println("From Queue after Dequeuing: "+queue.getFront());


        HashTable hashTable=new HashTable();
        hashTable.Put(4,"Hello");
        hashTable.Put(3,"World");

        System.out.println(hashTable.get(4));


    }
}
