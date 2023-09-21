public class Main {
    public static void main(String[] args) {
        IToyShop toy = new RaffleToysShop();
        toy.addToy("Кукла",5, 25);
        toy.addToy("Машина",10, 25);
        toy.addToy("Юла",15, 25);
        toy.addToy("Мяч",15, 25);
        System.out.println(toy.getInfo());

        toy.changeWeight(3, 0);
        System.out.println(toy.getInfo());

    }
}