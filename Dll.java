import java.util.*;

public class Dll
{
  private int data;
  private Dll next;
  private Dll previous;
public Dll(int data)
{
this.data=data;
}
public void setData(int data)
{
this.data=data;
}
public void getData()
{
return data;
}
public void setNext(Sll next)
{
this.next=next;
}
public Dll getNext()
{
return this.next;
}
public void setPrevious(Dll previous)
{
this.previous=previous;
}
public Dll getPrevious()
{
return this.previous;
}
}

public Dll DllInsert(Dll headNode,Dll nodeToInsert,int position)
{
if(headNode==null) //insert at the beginning
return nodeToInsert;
int size= DllLength(Headnode);
if(position>size+1|| position<1)
{
System.out.println("position of node to insert is invalid" +(size+1));
return headNode;
}
if(position==1)  // inserting at the beginning
{
nodeToInsert.setNext(headNode);
headNode.setPrevious(nodeToInsert);
return nodeToInsert;
}
else
{
// inserting at the end or middle
Dll perviousNode=headNode;
int count=1;
while(count<position-1)
{
prevoiusNode=previousNode.getNext();
 count++;
}
Dll currentNode=previousNode.getNext();
nodeToInsert.setNext(currentNode);
if(currentNode!=null)
currentNode.setPrevious(nodeToInsert);
previousNode.setNext(nodeToInsert);
nodeToInsert.setPrevious(previousNode);
}
return headNode;
} 
