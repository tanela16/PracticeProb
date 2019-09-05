package Lists;

public class Node {

	Node next;
	int data;
	
public Node(int data)
{
	this.data = data;
}

private int getLength(Node sample)
{
	int length=0;
while(sample.next!=null)
{
	sample = sample.next;
	length++;
	}
	
	return length;
}

private Node createNode(int data){
	Node sample = new Node(data);
	sample.next = null;
	return sample;
}

private Node build123(){
	Node start;
	
	start = new Node(1);
	start.next = new Node(2);
    start.next.next = new Node(3);	
    start.next.next.next = null;
	return start;
}

Node append(int data)
{
	Node n= this;
	while(n.next!=null){
		n = n.next;
		}
	n.next = new Node(data);
	return this;
}



private Node del(Node start, int d){
	Node n = start;
	if(n.data==d){
		return start.next;
	}
	while(n.next!=null){
		if(n.next.data ==d)
		{
			n.next=n.next.next;
			return start;
		}
		n=n.next;
	}
	return start;
}

}