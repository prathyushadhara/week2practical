package practise;

	public class CSTrainee extends Trainee {
		private int language;

		public CSTrainee(int id, String name, int language) {
			super(id, name);
			this.language = language;
		}

		
		public int getLanguage() {
			return language;
		}

		public void setLanguages(int language) {
			this.language = language;
		}

	}



