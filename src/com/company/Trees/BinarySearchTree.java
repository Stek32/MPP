package com.company.Trees;

public class BinarySearchTree {


    public Node Root;

    public BinarySearchTree(){

    }


    public void Add(int Data){

        if(Root == null){

            Root=new Node(Data);

        }
        else {

            Node TempNode=Root;

            Traverse(TempNode,Data);



        }

    }

    private Node Traverse(Node TempNode,int Data){

        Node ParentNode=TempNode;

            if (Data > ParentNode.Data) {

                ParentNode = ParentNode.RightChild;


                if(ParentNode==null){

                    ParentNode=new Node(Data);
                }
                else {

                    Traverse(ParentNode,Data);
                }

                TempNode.RightChild=ParentNode;
            }

            else
            {
                ParentNode = ParentNode.LeftChild;

                if(ParentNode==null){

                    ParentNode=new Node(Data);
                }
                else {

                    Traverse(ParentNode,Data);
                }

                TempNode.LeftChild=ParentNode;
            }


        return ParentNode;
    }

}
