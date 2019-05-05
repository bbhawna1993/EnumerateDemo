
public class EnumerateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//get system thread group
		ThreadGroup system=Thread.currentThread().getThreadGroup().getParent();
		int activeCount=system.activeCount();
		System.out.println(activeCount);

		Thread[] t=new Thread[activeCount];
		system.enumerate(t);

		for(Thread t1:t)
		{System.out.println(t1.getName()+" "+t1.isDaemon());}

	}

}
