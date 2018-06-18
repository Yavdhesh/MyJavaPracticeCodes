package com.hackerankProblem;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class SJFReducesAverageWaitingTime {
	
	public class CustomerDTO{
		long timeToArrive;
		long burstTime;
		long completionTime;
		long turnAroundTime;
		public long getTurnAroundTime() {
			return turnAroundTime;
		}
		public void setTurnAroundTime(long turnAroundTime) {
			this.turnAroundTime = turnAroundTime;
		}
		public long getCompletionTime() {
			return completionTime;
		}
		public void setCompletionTime(long completionTime) {
			this.completionTime = completionTime;
		}
		public long getTimeToArrive() {
			return timeToArrive;
		}
		public void setTimeToArrive(long timeToArrive) {
			this.timeToArrive = timeToArrive;
		}
		public long getburstTime() {
			return burstTime;
		}
		public void setburstTime(long burstTime) {
			this.burstTime = burstTime;
		}
		
		
	}
	
	public static void main(String [] args){
		PriorityQueue<CustomerDTO> list=new PriorityQueue<>(5, new Comparator<CustomerDTO>() {

			@Override
			public int compare(CustomerDTO o1, CustomerDTO o2) {
				// TODO Auto-generated method stub
				return Long.compare(o1.burstTime, o1.burstTime);
			}
		});
		ArrayList<CustomerDTO> lZeroTime=new ArrayList<>();
		SJFReducesAverageWaitingTime obj=new SJFReducesAverageWaitingTime();
		Scanner sc=new Scanner(System.in);
		long completionTime=0l;
		long count=0;
		//System.out.println("Please enter number of customers");
		long noOfCustomers=sc.nextLong();
		CustomerDTO cs=null;
		while(count<noOfCustomers){
		//	System.out.println("please enter time of arrival");
			long arrivalTime=sc.nextLong();
			cs=obj.new CustomerDTO();
			cs.setTimeToArrive(arrivalTime);
		//	System.out.println("daale de pizza banane ke time");
			long timeToCookPizza=sc.nextLong();
			cs.setburstTime(timeToCookPizza);
			/*completionTime=completionTime+timeToCookPizza;
			cs.setCompletionTime(completionTime);
			long turnaroundtime=completionTime-arrivalTime;
			cs.setTurnAroundTime(turnaroundtime);*/
			if(0==count){
				lZeroTime.add(cs);
			}
			list.add(cs);
			
			
			count++;
		}
		
		//System.out.println(list.size());
		CustomerDTO zeroTimeDTO=lZeroTime.get(0);
		long size=list.size();
		long compTime=zeroTimeDTO.burstTime;
		long totalTurnarounfTime=zeroTimeDTO.getburstTime()-zeroTimeDTO.timeToArrive;
		
		//System.out.println(list.poll().burstTime);
		//System.out.println(list.poll().burstTime);
		//System.out.println(list.poll().burstTime);
		long extra=0;
		while (!list.isEmpty()) {
		CustomerDTO cd=list.poll();
		if(extra!=0){
		compTime=compTime+cd.burstTime;
		long tt=compTime-cd.timeToArrive;
		totalTurnarounfTime=totalTurnarounfTime+tt;
		}
		extra++;
		}
		
		System.out.println("average waiting time is"+totalTurnarounfTime/size);
	}

}
