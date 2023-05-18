import java.time.Clock;
import java.util.*;


public class solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Queue <CustomerArrival> arrival = new Queue<>();
		
		
		int n = sc.nextInt();
		
		while(n != 0) {
			
			Queue<CustomerArrival> copy = arrival.cloneQueue(arrival);
			
			CustomerArrival temp = new CustomerArrival(n);
			
			if(arrival.size() == 0) {
				
				temp.setStartTime(temp.getArrivalTime());
			}else {
				CustomerArrival previous = copy.dequeue();
				temp.setStartTime(previous.endServiceTime);
				temp.setStartTime(temp.getEndServiceTime());
			}
			
			temp.setEndServiceTime(temp.getEndServiceTime() + 5);
			
			temp.setWaitingTime(temp.getStartTime() - temp.getArrivalTime());
			
			arrival.enqueue(temp);
			
			n = sc.nextInt();
		}
		
		Iterator<CustomerArrival> it = arrival.iterator();
		
		int totalWaitingTime = 0;
		while(it.hasNext()) {
			CustomerArrival temp = it.next();
			totalWaitingTime += temp.getWaitingTime();
		}
		int avgWaitingTime = totalWaitingTime/arrival.size();
		
		Iterator<CustomerArrival> it2 = arrival.iterator();
		
		while(it2.hasNext()) {
			CustomerArrival temp = it2.next();
			System.out.println(temp.getArrivalTime() + ":" + temp.getStartTime() + ":" + temp.getEndServiceTime() + ":" + temp.getWaitingTime());
		}
		
		System.out.println("Total waiting time: " + totalWaitingTime + " Unit");
		System.out.println("Average waiting time: " + avgWaitingTime + " Unit");
		
		
	
	}
}
