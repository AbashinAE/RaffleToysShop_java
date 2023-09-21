public class Toy {
    private String name;

    private int count;

    private Integer weight;

    public Toy(String name, int count, int weight) {
        this.name = name;
        this.count = count;
        this.weight = weight;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Toy: name = " + name + ", count = " + count + ", weight = " + weight;
    }

    public Integer getDefaultWeight() {
        return weight;
    }

    public Toy reduceWeight() {
        weight--;
        return this;
    }
    public void setDefaultWeight(Integer defaultWeight) {
        this.weight = defaultWeight;
    }
}