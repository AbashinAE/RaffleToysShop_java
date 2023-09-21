public interface IToyShop {
    int addToy(String toyName, int count, int weight);

    Toy getToy();

    int changeWeight(int ID, int weight);

    String getInfo();


    void selectToy(int ID);
}