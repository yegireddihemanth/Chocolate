
public class class11 {

	private String description;
	private String name;
	private double cost;
	private double weight;
	
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	/*public double getMinimumWeight() {
		return MinimumWeight;
	}
	public void setMinimumWeight(double minimumWeight) {
		MinimumWeight = minimumWeight;
	}
	public double getMaxPrice() {
		return MaxPrice;
	}
	public void setMaxPrice(double maxPrice) {
		MaxPrice = maxPrice;
	}*/
	public class11() {
		
	}
	public class11(String description, String name, double cost, double weight) {
		
		this.description=description;
		this.name=name;
		this.cost=cost;
		this.weight=weight;
		//this.MinimumWeight=MinimumWeight;
		//this.MaxPrice=MaxPrice;
		
		
	}
	
	public class1(String description, String name, double cost, double weight) {
		
		this.description = description;
		this.name = name;
		this.cost = cost;
		this.weight = weight;
	}
	@Override
	public String toString() {
		return "class1 [description=" + description + ", name=" + name + ", cost=" + cost + ", weight=" + weight + "]";
	}
	
	
}
