package examples.oo.bad;

public class IKnowTooMuch {

	public static void main(String[] args) {
		LazyTask lazy = new LazyTask();

		BadService bad = new BadService(lazy);

		bad.runTask();
	}

}

class BadService {
	private LazyTask task;

	public BadService(LazyTask task) {
		this.task = task;
	}

	public LazyTask getTask() {
		return task;
	}

	public void runTask() {
		task.execute();
	}
}

interface Task {
	void execute();
}

class LazyTask implements Task {

	@Override
	public void execute() {
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(" done. ");
	}

}

class FastTask implements Task {
	@Override
	public void execute() {
		System.out.println(" done. ");

	}
}