import java.util.ArrayList;

public class TestCafe{
    public static void main(String[] args) {
        CafeUtil util = new CafeUtil();
        int cantidadDeCafes = util.getStreakGoal(10);
        double[] precios = new double[] {1,3.5,7,8.9,15};
        double totalDeOrden = util.getOrderTotal(precios);
        ArrayList<String> menu = new ArrayList<String>();
        ArrayList<Double> preciosMenu = new ArrayList<Double>();

        menu.add("café de goteo");
        preciosMenu.add(600.00);
        menu.add("capuchino");
        preciosMenu.add(1000.00);
        menu.add("latte");
        preciosMenu.add(1100.00);
        menu.add("moka");
        preciosMenu.add(1200.00);



        System.out.println("----Streak Goal Test----");
        System.out.println("Cantidad de café minima para premios en 10 semanas: "+cantidadDeCafes);
        System.out.println("----Order Total Test----");
        System.out.println("La orden requerida tiene como precio total "+totalDeOrden);
        System.out.println("----Display Menu Test----");
        util.DisplayMenu(menu);
        System.out.println("----Add Customer Test----");
        ArrayList<String> costumers = new ArrayList<String>();
        for(int i=0; i<3; i++){
            util.addCustomer(costumers);
        }


        System.out.println("--- Probando PriceChart ---");
        util.printPriceChart("Mate de Coca", 1600, 5);
        System.out.println("--- Probando menu - precio ---");
        util.displayMenu(menu, preciosMenu);

        System.out.println("--- Probando ingreso multiple ---");
        util.addCustomers(costumers);
    }
}