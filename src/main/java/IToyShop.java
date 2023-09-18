public interface IToyShop {
    void addToy(String Name, int count, int weight);

    Toy getToy();

    int changeWeight(int ID, int weight);

    String getInfo();

    void selectToy(int ID);
}
