package com.lxw.data;

import com.lxw.data.tree.SearchBinaryTree;

public class Main {

    public static void main(String[] args) {
        SearchBinaryTree searchBinaryTree =new SearchBinaryTree();
        searchBinaryTree.put(1);
        searchBinaryTree.put(21);
        searchBinaryTree.put(3);
        searchBinaryTree.put(14);
        searchBinaryTree.put(16);
        searchBinaryTree.put(-16);
        searchBinaryTree.put(-216);
        searchBinaryTree.put(17);
        searchBinaryTree.put(-15);
//        searchBinaryTree.displayTreeByStack();
//        searchBinaryTree.midOrder(searchBinaryTree.root);
//        searchBinaryTree.delNode(1);
////        searchBinaryTree.displayTreeByStack();
//        searchBinaryTree.delNode(3);
//        searchBinaryTree.displayTreeByStack();
//        searchBinaryTree.delNode(5);

//        searchBinaryTree.displayTreeByStack();
        searchBinaryTree.displayTree();

    }
}
