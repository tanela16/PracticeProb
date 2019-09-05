package Lists;

//Remove Dups: Write code to remove duplicates from an unsorted linked list.
//FOLLOW UP
//How would you solve this problem if a temporary buffer is not allowed?

import java.util.ArrayList;;

public class RemoveDup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node start = new Node(10);
		start = start.append(11);
		start = start.append(11);
		start = start.append(9);
		start = start.append(8);
		start = start.append(12);
		//temp buffer
			//tempBufferSol(start);
		//sort if no temp buff
		Node list = sortSol(start);
		while(list!=null){
			System.out.println(list.data);
			list = list.next;
		}
	}
	
	public static void tempBufferSol(Node start){
		ArrayList<Integer> dupMap = new ArrayList<Integer>();
		Node list = start,previous = null;
		while(list!=null){
			if(dupMap.contains(list.data)){
				previous.next = list.next;
				list = list.next;
				}
			else{
				dupMap.add(list.data);
				previous = list;
				list = list.next;
			}
		}
		list = start;
		while(list!=null){
			System.out.println(list.data);
			list = list.next;
		}
	}
	
	//get middle node
	public static Node getMiddle(Node start){		
		if(start==null)
			return start;
		
		Node middle = start,last = start;
		
		while(last.next!=null && last.next.next!=null){
			middle = middle.next;
			last = last.next.next;
		}
		
		return middle;
	}
	
	//merge sort
	public static Node sortSol(Node start){
		
		if(start==null ||start.next==null)
			return start;
		
		Node middle = getMiddle(start);
		Node middleNext = middle.next;
		
		middle.next = null;
		
		//apply sort on left list
		Node left = sortSol(start);
		
		//apply sort on right list
		Node right = sortSol(middleNext);
		
			return	mergeSort(left,right);
	}
	
	
	public static Node mergeSort(Node left, Node right){
		Node sorted = null;
		
		if(left==null) 
			return right;
			
		if(right==null)
			return left;
			
			if(left.data <= right.data){
				sorted = left;
				sorted.next = mergeSort(left.next,right);
			}
			else{
				sorted = right;
				sorted.next = mergeSort(left,right.next);
			}
		
		return sorted;		
	}

}
