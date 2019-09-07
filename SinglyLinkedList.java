
package datastructures;

/**
 *
 * @author suvrat
 * Singly linked list in java with insertion at the end
 */
import java.util.*;
import java.io.*;

public class SinglyLinkedList{

  Node head; //head of the list 
 static class Node{

    int data;
    Node next;

    Node(int data){

    this.data = data;
    next = null;

    }   
    
  }
 
 public void insert(SinglyLinkedList list , int data)
 {
     Node newNode = new Node(data);
     newNode.next = null;
      if(list.head==null)
      {
          list.head = newNode;
      }
      else
      {
          Node last = list.head;
          while(last.next!=null){
              last = last.next;
          
          }
          last.next = newNode;
      }
    
 }
 
 public void printList(SinglyLinkedList list)
 {
     System.out.println("Singly Linked List with insertion at the end :");
     Node currNode = list.head;
     while(currNode.next!=null){
         System.out.println(currNode.data);
         currNode = currNode.next;
     }
     if(currNode.next==null)
         System.out.println(currNode.data);
 }
 


  public static void main(String[] args) {
      SinglyLinkedList list  = new SinglyLinkedList();
     list.insert(list,4);
     list.insert(list,5);
     list.insert(list, 10);
     list.insert(list,20);
     
     list.printList(list);
      
  }

}
