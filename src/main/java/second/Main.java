package second;
/**
 * To solve issue of the cheapest path Dijkstra algorithm is used.
 *
 * */
public class Main {
    public static void main(String[] args) {
        Node warszawa = new Node("warszawa");
        Node torun = new Node("torun");
        Node bydgoszcz = new Node("bydgoszcz");
        Node gdansk = new Node("gdansk");

        warszawa.addDestination(bydgoszcz, 4);
        warszawa.addDestination(torun, 1);
        bydgoszcz.addDestination(torun, 1);
        bydgoszcz.addDestination(warszawa, 1);
        bydgoszcz.addDestination(gdansk, 4);
        torun.addDestination(warszawa, 3);
        torun.addDestination(bydgoszcz, 1);
        torun.addDestination(gdansk, 1);
        gdansk.addDestination(bydgoszcz, 1);
        gdansk.addDestination(torun, 3);

        System.out.println("Minimum cost is: " + DijkstraAlgorithmImpl
                .getMinimumPathCost(bydgoszcz, warszawa));
    }
}
