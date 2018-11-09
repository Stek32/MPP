package com.company;

import com.sun.jdi.Value;

public class HashTable {

    public class HashNode{

        int Key;
        String Value;

        public HashNode(int Key,String Value){

            this.Key=Key;
            this.Value=Value;
        }

        public int getKey() {
            return Key;
        }

        public String getValue() {
            return Value;
        }
    }

    private final static int Table_Size=128;

    HashNode [] nodeList;

    public HashTable(){

        nodeList=new HashNode[Table_Size];

        for(int i=0;i< Table_Size;i++){

            nodeList[i]=null;
        }

    }

    public void Put(int key,String value){

        int Hash=(key%Table_Size);

        while (nodeList[Hash]!= null && nodeList[Hash].getKey()!=key){

            Hash=(Hash+1) % Table_Size;

        }

            nodeList[Hash]=new HashNode(key, value);



    }


    public String get(int key){

        int Hash=(key%Table_Size);

        while (nodeList[Hash]!= null && nodeList[Hash].getKey()!=key){

            Hash=(Hash+1) % Table_Size;

        }

        if(nodeList[Hash]== null){

            return null;
        }

        else {

            return  nodeList[Hash].getValue();
        }
    }


}
