package ch12_map.hashmap_1024;

	public class Animal implements Comparable<Animal>{

		private int animalId;        //animal 아이디
		private String animalName; //animal 이름
	
		public Animal(int animalId, String animalName) {
			this.animalId = animalId;
			this.animalName = animalName;

	}
		public int getAmimalId() {
			return animalId;
		}
		public void setAmimalId(int amimalId) {
			this.animalId = amimalId;
		}
		public String getAnimalName() {
			return animalName;
		}
		public void setAnimalName(String animalName) {
			this.animalName = animalName;
		}   
		@Override
		public String toString(){   //toString 메소드 오버로딩
			return animalName + " 동물의 아이디는 " + animalId + "입니다";
		}

		@Override
		public int hashCode() {
			return animalId;
		}

		@Override
		public boolean equals(Object obj) {
			if( obj instanceof Animal){
				Animal animal = (Animal)obj;
				if( this.animalId == animal.animalId )
					return true;
				else 
					return false;
			}
			return false;
		}

		@Override
		public int compareTo(Animal animal) {
			
			return (this.animalId - animal.animalId);   //오름차순
			//return (this.animalId - member.animalId) *  (-1);   //내림 차순
		}
	}
