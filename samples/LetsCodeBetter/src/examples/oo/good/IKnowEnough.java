package examples.oo.good;

public class IKnowEnough {

	public static void main(String[] args) {
		LazyTask lazy = new LazyTask();

		GoodService goodButLazy = new GoodService(lazy);

		GoodService goodAndFast = new GoodService(new FastTask());

		goodButLazy.runTask();
		goodAndFast.runTask();
	}

}

class GoodService {
	private Task task;

	public GoodService(Task task) {
		this.task = task;
	}

	public Task getTask() {
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