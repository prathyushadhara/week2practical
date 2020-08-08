package practise;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TraineeMain {
	private Map<Integer, Trainee> store = new HashMap<>();

	public static void main(String[] args) {
		TraineeMain demo = new TraineeMain();
		demo.runApp();
	}
	public void runApp() {
		CSTrainee trainee1=new CSTrainee(1,"prathyusha",2);
		ECETrainee trainee2=new ECETrainee(2,"chinni","dell");
		store.put(trainee1.getId(), trainee1);
		store.put(trainee2.getId(), trainee2);
	
	Set<Integer> keys = store.keySet();
	for (Integer k : keys) {
		Trainee fetched = store.get(k);
		System.out.println(fetched.getId() + " " +fetched.getName());
		displayAll();
	}
	}
	public void displayAll() {
		Set<Integer> ids = store.keySet();
		for (Integer key : ids) {
			Trainee current = store.get(key);
			boolean isLang = current instanceof CSTrainee;
			if (isLang) {
				CSTrainee c = (CSTrainee) current;
				System.out.println(c.getLanguage());
			

			}

			boolean isDevice = current instanceof ECETrainee;
			if (isDevice) {
				ECETrainee a = (ECETrainee) current;
				System.out.println(a.getDeviceUsed());
				

			}
	}
}
}
		
	
	
	

		
	
