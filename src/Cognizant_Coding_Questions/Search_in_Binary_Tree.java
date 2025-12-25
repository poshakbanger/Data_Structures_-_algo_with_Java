//package Cognizant_Coding_Questions;
//
//// Node class representing each node in the BST
////class Node{
////    int data;
////    Node left, right;
////
////    //constructor
////    public Node(int item){
////        data = item;
////        left = right = null;
////    }
////}
//
//// BST class containing search functionality
//public class Search_in_Binary_Tree {
//    Node root;
//
//    // Constructor
//    Search_in_Binary_Tree() {
//        root = null;
//    }
//
//    // Insert a new node into the BST
//    void insert(int data){
//        root = insertRec(root, data);
//    }
//
//    // recursive function to insert a new value
//    Node insertRec(Node root, int data){
//        if (root == null){
//            root = new Node(data);
//            return root;
//        }
//        if (data < root.data)
//            root.left = insertRec(root.left, data);
//        else if (data > root.data)
//            root.right = insertRec(root.right, data);
//        return root;
//    }
//
//    // Function to search a value in BST
//    boolean search(int key) {
//        return searchRec(root, key);
//    }
//
//    boolean searchRec(Node root, int key){
//        if (root == null)
//            return false; // key not found
//        if (root.data == key)
//            return true; // key found
//        if (key < root.data)
//            return searchRec(root.left, key);
//        else
//            return searchRec(root.right, key);
//    }
//
//    public static void main(String[] args) {
//        Search_in_Binary_Tree bst = new Search_in_Binary_Tree();
//
//        // Inserting nodes
//        bst.insert(50);
//        bst.insert(30);
//        bst.insert(70);
//        bst.insert(20);
//        bst.insert(40);
//        bst.insert(60);
//        bst.insert(80);
//
//        // Searching for a value
//        int key = 60;
//        if (bst.search(key)){
//            System.out.println(key + " found in BST.");
//        } else {
//            System.out.println(key + " not found in BST.");
//        }
//    }
//}


// this code run nicely