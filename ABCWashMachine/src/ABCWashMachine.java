import java.util.*;
public class ABCWashMachine {
	public enum status { free, busy}
	static int maxDur=0;
	static int numCar=0;
	static int totalWait=0;
	static int totalWork=0;
	
	static Queue <Clock> cusArrival = new Queue<>();
	static Queue <Clock> cusWait = new Queue<>();
	static Queue <Clock> cusWashEnd = new Queue<>();
	
	static Queue <Integer> cusCarWait = new Queue<>();
	static Queue <Integer> cusMaxDur = new Queue<>();
	static Queue <Integer> cusTotalWait = new Queue<>();
	static Queue <Integer> cusTotalWork = new Queue<>();
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Clock carArrival;
		Queue <Clock> waitQueue= new Queue <>();
		Queue <Clock> arrivalQueue = new Queue<>();
	
		
		//enum status {free, busy} machineWash;
		status machineWash;
		//observation data
		Clock totalWaitTime= new Clock();
		Clock maxWaitTime = new Clock();
		Clock totalServiceTime = new Clock();
		Clock startTime= new Clock();
		Clock endTime= new Clock();
		Clock washEnd = new Clock();
		Clock washStart = new Clock();
		Clock i;
		int nextArrival=0;
		
		String numLine = sc.nextLine();
		StringTokenizer st = new StringTokenizer(numLine);
		startTime.setTime(8,0,0);
		endTime.setTime(8,30,0); // can change to 12 pm
		for (i=startTime.getCopy();i.lessThan(endTime); ){
			if(st.hasMoreTokens())
				nextArrival = Integer.parseInt(st.nextToken());
			else
				break;
			i.addTimeMinute(nextArrival);
			if(i.lessThan(endTime)) {
				arrivalQueue.enqueue(i.getCopy());
				
				System.out.println("Car arrival: " + i.toString() + " < " +
						endTime.toString());
			}
		}
		//start the simulation
		machineWash=status.free;
		if (!arrivalQueue.isEmpty()) {
			startTime=arrivalQueue.peek();
			washEnd=startTime.getCopy();
			washEnd.addTimeMinute(5);
			
		} else
			startTime=endTime.getCopy();
		Clock del;
		for
		(i=startTime;(i.lessThan(endTime)||(!waitQueue.isEmpty())||(!arrivalQueue.isEmpty()));)
		{
			
			if (!arrivalQueue.isEmpty())
				if (i.equalTime(arrivalQueue.peek())) {
					waitQueue.enqueue(i.getCopy());
					del=arrivalQueue.dequeue();
					
				}
			if ((machineWash==status.busy) && (i.equalTime(washEnd))) {
				washEnd.setTime(14,0,0);
				machineWash=status.free;
			}
			if ((machineWash==status.free) && !(waitQueue.isEmpty())) {
				washStart=i.getCopy();
				washEnd=i.getCopy(); washEnd.addTimeMinute(5);
				
				cusWait.enqueue(waitQueue.peek().getCopy());
				doAnalysis(i,waitQueue.peek(),washEnd); // call doAnalysis method
				del=waitQueue.dequeue();
				cusArrival.enqueue(washStart.getCopy());
				Clock temp = washStart.getCopy();
				temp.addTimeMinute(5);
				cusWashEnd.enqueue(temp.getCopy());
				
				
				machineWash=status.busy;
			}
			if ((machineWash==status.free) && (waitQueue.isEmpty()))
				washEnd.setTime(14,0,0);
			//jump to next event.
			if (!arrivalQueue.isEmpty())
				if (washEnd.lessThan(arrivalQueue.peek())) {
					i=washEnd.getCopy();
				}
				else {
					i=arrivalQueue.peek().getCopy();
				}
			else {
				i=washEnd.getCopy();
			}
			
			
		}
		System.out.println();
		while(!cusArrival.isEmpty()) {
			
			System.out.println("Customer: " + cusArrival.dequeue() + " waitQueue: " + cusWait.dequeue() + " washEnd: " + cusWashEnd.dequeue());
			
			System.out.println("carWait: " + cusCarWait.dequeue() + " maxDur: " + cusMaxDur.dequeue());
			System.out.println("TotalWait: " + cusTotalWait.dequeue());
			System.out.println("TotalWork: " + cusTotalWork.dequeue());
			System.out.println();
		}
		
		//report
		System.out.print("REPORT\n");
		System.out.print("Number of customer arrive by 8.30 am: " + numCar + "\n");
		System.out.print("Longest waiting time: " + maxDur + " minutes\n");
		System.out.print(String.format("Average waiting time: %.2f minutes",
				totalWait/(float)numCar));
	}
	public static void doAnalysis(Clock waitStop, Clock start, Clock washStop) {
		int carWait,machineWork;
		carWait=start.durationSec(waitStop.getCopy());
		machineWork=waitStop.durationSec(washStop.getCopy());
		numCar++;
		totalWait+= carWait;
		totalWork+=machineWork;
		if (maxDur<carWait)
			maxDur=carWait;
		cusCarWait.enqueue(carWait);
		cusMaxDur.enqueue(maxDur);
		cusTotalWait.enqueue(totalWait);
		cusTotalWork.enqueue(totalWork);
	}
}
