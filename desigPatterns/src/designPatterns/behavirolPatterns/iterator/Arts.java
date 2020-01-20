package designPatterns.behavirolPatterns.iterator;

public class Arts implements ISubject {

	private String[] subjects;

	public Arts() {

		subjects = new String[2];

		subjects[0] = "Bengali";

		subjects[1] = "English";
	}

	public IIterator CreateIterator() {

		return new ArtsIterator(subjects);
	}

	public class ArtsIterator implements IIterator {

		private String[] subjects;
		private int position;

		@Override
		public void First() {
			position = 0;
		}

		@Override
		public String Next() {
			return subjects[position++];
		}

		@Override
		public Boolean IsDone() {
			return position >= subjects.length;
		}

		@Override
		public String CurrentItem() {
			return subjects[position];
		}

		public ArtsIterator(String[] subjects) {

			this.subjects = subjects;
			position = 0;
		}
	}

}
