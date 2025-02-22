//Bradley Lamitie     2/28/2017     CMPT435 

package Assignment2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Intervalscheduling {

	public static int greedyscheduling(ArrayList<interval> llist){
		// Complete the code here to schedule as many lectures as possible into a single classroom
		// input: llist is a list of lectures
		// note that the input list of lectures are SORTED by ending time ALREADY
		// every lecture has a starting time and ending time
		// output: the number of lectures scheduled in the classroom
		int currentPoint = llist.get(0).end;
		llist.remove(0);
		int classes = 1;
		//System.out.println(currentPoint);

		while(!llist.isEmpty()){
			//go through the list and delete any segments that conflict with the current point
			for(int i = llist.size()-1; i >= 0; i--){
				if (currentPoint < llist.get(i).end && currentPoint > llist.get(i).start){
					llist.remove(i);

				}
			}
			//set the new point increment the number of classrooms and remove the next interval
			currentPoint = llist.get(0).end;
			llist.remove(0);
			classes += 1;
		}
		return classes;
		
		
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
		ArrayList<interval> intervallist = new ArrayList<interval>();
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
		
		// Sort lectures by ending time in increasing order
		sortintervals(intervallist);
		
		for(int i = 0; i < intervallist.size(); i++)
		{
			// Confirm that the list is sorted by ending time
			System.out.println(i+"_th interval's ending time: "+intervallist.get(i).end);
		}
		
		System.out.println("The maximum number of lectures we can schedule is "+ greedyscheduling(intervallist));
		
		
		
	}

}

