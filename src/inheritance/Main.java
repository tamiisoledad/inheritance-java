package inheritance;

public class Main {

	public static void main(String[] args) {
		Worker worker = new Worker("Bob", 1000.0);
		WorkerExtraHours workerExtraHours = new WorkerExtraHours("Maria", 1000.0, 3, 100.0);
		
		System.out.println(worker.getName() + " tiene un sueldo de $" + worker.calculateSalary());
		System.out.println(workerExtraHours.getName() + " tiene un sueldo de $" + workerExtraHours.calculateSalary());
	}

}
