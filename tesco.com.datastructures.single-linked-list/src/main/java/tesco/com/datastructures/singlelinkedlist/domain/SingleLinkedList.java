package tesco.com.datastructures.singlelinkedlist.domain;

public class SingleLinkedList {
private Node node;
public int count;
public SingleLinkedList(){
	node=null; 
	count=0;
}
public void addEnd(Integer value){
	Node newNode=new Node();
	newNode.info=value;
	if(node==null){
	node=newNode;		
	}else{		
		Node lastnode = getLastNode();
		lastnode.next=newNode;
	}
	count++;
}
public void deleteLast(){
	Node temp=node;
	Node prev=node;
	if(temp.next==null){
		node=null;
	}else{
	while(temp.next!=null){
		prev=temp;
		temp=temp.next;
	}
	prev.next=null;
	temp=null;
	}
	count--;
}
public Integer get(Integer position){
	if(this.node==null)
		return null;
	Node temp=this.node;
	for(int i=0;i<position;i++)
		temp=temp.next;
	return temp.info;
}
private Node getLastNode() {
	Node temp=node;
	while(temp.next!=null){
		temp=temp.next;
	}
	return temp;
}

}
