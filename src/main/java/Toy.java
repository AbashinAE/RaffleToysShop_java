public class Toy {
    private String name; // название
    private int count; // количество
    private Integer weight; // вес

    public Toy(String name, int count, Integer weight){
        this.name = name;
        this.count = count;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Toy: name=" + name + ", count=" + count+ ", weight=" + defaultWeight;
    }
    public Toy reduceWeight() {
        weight--;
        return this;
    }
}
