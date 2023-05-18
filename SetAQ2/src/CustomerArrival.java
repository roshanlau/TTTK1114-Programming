public class CustomerArrival {
	int arrivalTime;
	int startServiceTime;
	int endServiceTime;
	int waitingTime;
	
	CustomerArrival (int aT){
		  this.arrivalTime=aT;
		  this.startServiceTime=0;
		  this.endServiceTime=0;
		  this.waitingTime=0;
		}
	
	CustomerArrival (){
		  this.arrivalTime=0;
		  this.startServiceTime=0;
		  this.endServiceTime=0;
		  this.waitingTime=0;
		}

	public int getArrivalTime () {
		return this.arrivalTime;
	}
	
	public int getStartTime() {
		return this.startServiceTime;
	}
	
	public void setStartTime(int n) {
		this.startServiceTime = n;
	}
	
	public void setWaitingTime(int n) {
		this.waitingTime = n;
	}
	
	public void setEndServiceTime(int n) {
		this.endServiceTime = n;
	}
	
	public int getEndServiceTime() {
		return this.endServiceTime;
	}
	
	public int getWaitingTime() {
		return this.waitingTime;
	}
	
	public String toString() 
    { 
		
		return (this.arrivalTime + " " + this.startServiceTime+ " "+ this.endServiceTime+ " " + this.waitingTime ) ; 
    } 
}