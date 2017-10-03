import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Intervalscheduling {

	public static void greedyscheduling(ArrayList<interval> llist){
		// Complete the code here to schedule as many lectures as possible into a single classroom
		// input: llist is a list of lectures
		// every lecture has a starting time and ending time
		// output: the number of lectures scheduled in the classroom
		
		// Initialization
		ArrayList<interval> roomschedule = new ArrayList();
		int numoflectures = 0;
		
		
		// Adding the first lecture into the classroom
		roomschedule.add(llist.get(0));
		llist.remove(0);
		numoflectures ++;
		
		
		// Adding more lectures
		while(llist.size()>0) 
		{
			int lastaddedending = roomschedule.get(numoflectures-1).end;
			int position = 0;
			while(llist.size()>0 && llist.get(position).start < lastaddedending)
			{// Remove all the lectures in llist that are incompatiable with the last lecture scheduled
				llist.remove(position);
				position = 0;
			}
			if(llist.size()>0){
			roomschedule.add(llist.get(0)); // Add the lecture that is compatiable with the last lecture scheduled and has the earliest ending time
			numoflectures ++;
			}
		}
		System.out.println();
		System.out.println(numoflectures+" lectures have been scheduled into the classroom.");
		for(int i = 0; i <roomschedule.size(); i++)
		{
			System.out.println("Lecture "+(i+1)+": "+roomschedule.get(i).start + " "+ roomschedule.get(i).end);
		}
		
	}
	
	public static void sortintervals(ArrayList<interval> llist)
	{
		
		Collections.sort(llist, new Comparator<interval>(){
		     public int compare(interval o1, interval o2){
		         if(o1.end == o2.end)
		             return 0;
		         return o1.end < o2.end ? -1 : 1;
		     }
		});
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Create a list of lectures
		ArrayList<interval> intervallist = new ArrayList();
		// Lecture 1 starts at time 0, and finishes at time 6
		intervallist.add(new interval(0,6));
		// Lecture 2 starts at time 1, and finishes at time 4
		intervallist.add(new interval(1,4));
		intervallist.add(new interval(3,5));
		intervallist.add(new interval(3,8));
		intervallist.add(new interval(4,7));
		intervallist.add(new interval(5,9));
		intervallist.add(new interval(6,10));
		intervallist.add(new interval(8,11));
		
		// Sort lectures by ending time in ascending order
		sortintervals(intervallist);
		
		for(int i = 0; i < intervallist.size(); i++)
		{
			// Confirm that the list is sorted by ending time
			System.out.print("("+ intervallist.get(i).start+", "+intervallist.get(i).end+ ") ");
		}
		
		
		greedyscheduling(intervallist);
		
		
		
	}

}

