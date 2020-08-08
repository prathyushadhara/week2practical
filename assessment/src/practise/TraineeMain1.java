package practise;


import java.util.*;


public class TraineeMain1 {
	Map<Integer,Trainee> map=new HashMap<>();
	Set<Trainee> set1=new HashSet<>();
	Set<Trainee> set2=new HashSet<>();
	public static void main(String[] args) {
		TraineeMain1 demo = new TraineeMain1();
		demo.runApp();
	}

	private void runApp() {
		Trainee trainee1=new CSTrainee(1,"chinni",2);
		Trainee trainee2=new CSTrainee(2,"prathyusha",3);
		Trainee trainee3=new CSTrainee(3,"priya",4);
		Trainee trainee4=new ECETrainee(4,"lasya","dell");
		Trainee trainee5=new ECETrainee(5,"sai","hp");
		Trainee trainee6=new ECETrainee(6,"sri","acer");
		map.put(trainee1.getId(), trainee1);
		map.put(trainee2.getId(), trainee2);
		map.put(trainee3.getId(), trainee3);
		map.put(trainee4.getId(), trainee4);
		map.put(trainee5.getId(), trainee5);
		map.put(trainee6.getId(), trainee6);
		for (Trainee trainee : map.values()) {
            Trainee map = (Trainee) trainee;
            boolean isCs= map instanceof CSTrainee;
            if (isCs) {
                set1.add((CSTrainee)map);
            } else {
                set2.add((ECETrainee) map);
            }
        }
		for(Trainee cseset:set1)
        {
            int id=cseset.getId();
            String name=cseset.getName();
            int language=((CSTrainee) cseset).getLanguage();
            System.out.println(" id="+id+ "name="+name+" languages"+language);
        }
		for(Trainee eceset:set2)
        {
			
            int id=eceset.getId();
            String name=eceset.getName();
            String deviceused=((ECETrainee) eceset).getDeviceUsed();
            System.out.println(" id="+id+ "The name="+name+"device==" +deviceused);
        }	
				
	}
	
	
}
