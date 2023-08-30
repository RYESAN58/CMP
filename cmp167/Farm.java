import java.util.Arrays;

public class Farm {

	private Animal[] animals;
	private String farmName;
	private int numAnimals;
	
	public Farm() {
		farmName = "";
		numAnimals = 0;
		this.animals = new Animal[10];
	}
	
	public Farm(String farmName) {
		this.farmName = farmName;
		numAnimals = 0;
		this.animals = new Animal[10];
	}
	
	public Farm(int maxAnimals) {
		this.farmName = "";
		numAnimals = 0;
		
		if (maxAnimals < 0)
			maxAnimals = 0;
		
		animals = new Animal[maxAnimals];
	}
	
	public Farm(String farmName, int maxAnimals) {
		if (maxAnimals < 0)
			maxAnimals = 0;
		
		animals = new Animal[maxAnimals];
		
		numAnimals = 0;
		this.farmName = farmName;
	}
	
	public void setFarmName(String name) {
		farmName = name;
	}
	
	public String getFarmName() {
		return farmName;
	}
	
	public void addAnimal(Animal a) {
		if (numAnimals > animals.length) {
			//resizeAnimalArray();
		}
		animals[numAnimals] = a;
		numAnimals ++;
	}
	
	public Animal getAnimal(int index) {
		if ((index > numAnimals) || (index < 0)) {
			return null;
		}
		else
			return animals[index];
	}
	
	public int getNumAnimals() {
		return numAnimals;
	}
	
	public Animal getFirstAnimal() {
		if (numAnimals == 0) {
			return null;
		}
		else
			return animals[0];
	}
	
	public Animal getLastAnimal() {
		return animals[numAnimals - 1];
	}
	
	public Animal[] getAnimals() {
		return animals;
	}
	
	public Animal removeAnimal(int index) {
		

		if ((index >= 0) && (index < animals.length)){
			

			Animal removedAnimal = animals[index];
		

			Animal[] copyAnimals = new Animal[numAnimals - 1];
			
			this.numAnimals--;
			
			int x = 0;
			for (int i = 0; i < numAnimals; i++) {
				
				if (i == index)
					x++;
				
				copyAnimals[i] = animals[x];
				x++;
			}

			this.animals = copyAnimals;
			
			return removedAnimal;
		}
		else
			return null;
	}
	
	public void removeAllAnimals() {
		this.animals = new Animal[0];
		this.numAnimals = 0;
	}
	
	public double getTotalWeightOfAllAnimals() {
		
		double total = 0;
		
		for (int i = 0; i < animals.length; i++) {
			total += getAnimal(i).getWeight();
		}
		
		return total;
	}
	
	public double getAverageWeightOfAllAnimals() {
		
		return getTotalWeightOfAllAnimals() / animals.length;
		
	}
	
	public int getNumberOfAnimalsAboveWeight(double weight) {
		
		int total = 0;
		
		for (int i = 0; i < animals.length; i++) {
			if (weight < getAnimal(i).getWeight())
				total++;
		}
		
		return total;
	}
	
	public int getNumberOfAnimalsBelowWeight(double weight) {
		int total = 0;
	
		for (int i = 0; i < animals.length; i++) {
			if (weight > getAnimal(i).getWeight())
				total++;
		}
	
		return total;
	}
	
	public void increaseWeightOfAllAnimals() {
		for (int i = 0; i < animals.length; i++) {
			getAnimal(i).gainWeight();
		}
	}
	
	public void increaseWeightOfAllAnimals(double weight) {
		for (int i = 0; i < animals.length; i++) {
			getAnimal(i).gainWeight(weight);
		}
	}
	
	public void printAllDetails() {
		
		System.out.printf("FarmName: %20s | Number of Animals: %4d | Farm Size: %4d\n", getFarmName(), getNumAnimals(), animals.length); 

		for (int i = 0; i < numAnimals; i++) {
			System.out.printf("Name: %20s | Year of Birth: %4d | Weight: %10.2f | Gender: %c\n", getAnimal(i).getName(), getAnimal(i).getBirthYear(), getAnimal(i).getWeight(), getAnimal(i).getGender());
		}
	}

}