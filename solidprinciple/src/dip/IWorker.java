package dip;

public interface IWorker {

	public void work() ;
	
}
class Worker1 implements IWorker {
	public void work() {}
	
}
class SuperWorker2 implements IWorker {
	public void work() {}
	
}
class Manager1 {
	IWorker worker;
	 public void setWorker(IWorker w) {
		 worker=w;
	 }
	 public void manage() {
		 worker.work();
	 }

}