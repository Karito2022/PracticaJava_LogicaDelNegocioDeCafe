import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class CafeUtil{
    public int getStreakGoal(int numWeeks){
        int suma=0;
        for(int i=1; i<=numWeeks; i++){
            suma+=i;
        }
        return suma;
    }
    public double getOrderTotal(double[] prices){

        double precioTotal = 0;
        for (double price : prices){
            precioTotal+=price;
        }
        return precioTotal;
    }

    public void DisplayMenu(ArrayList<String> menuItems){
        for(int i = 0; i< menuItems.size(); i++){
            System.out.println(String.format("%d %s", i,menuItems.get(i)));
        }
    }

    public void addCustomer ( ArrayList<String> costumers ){
        //Al Tratar de colocar System.Console().readLine() retorna nulo defrente y genera excepción
        System.out.println("Por favor ingrese el nombre:");
        BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
        String nombreUsuario = "";
        try {
            nombreUsuario = bufferRead.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(String.format("Hola, %s.", nombreUsuario));

        System.out.println(String.format("Hay %d personas frente a ti.", costumers.size()));

        costumers.add(nombreUsuario);
        System.out.println("Lista de usuarios:");
        for(String costumer : costumers){
            System.out.println(costumer);
        }
    }

    public void printPriceChart(String product, double price, int maxQuantity){
        System.out.println(product);

        for(int i = 1; i<=maxQuantity; i++){
            System.out.println(String.format("%d - %s", i, String.format("$%,.3f",i*(price-400)+400 )));
        }
    }

    public boolean displayMenu(ArrayList<String> menuItems, ArrayList<Double> price){
        if(menuItems.size() != price.size()) return false;
        for(int i=0; i<menuItems.size(); i++){
            System.out.println(String.format("%d %s -- %s", i, menuItems.get(i), String.format("$%,.3f", price.get(i))));
        }
        return true;
    }

    public void addCustomers ( ArrayList<String> costumers ){
        
        String nombreUsuario = "";
        while(!(nombreUsuario.indexOf("q")==0 && nombreUsuario.length()==1)){
            try {
                BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Por favor ingrese el nombre:");
                nombreUsuario = bufferRead.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println(String.format("Hola, %s.", nombreUsuario));

            System.out.println(String.format("Hay %d personas frente a ti.", costumers.size()));

            costumers.add(nombreUsuario);
            System.out.println("Lista de usuarios:");
            for(String costumer : costumers){
                System.out.println(costumer);
            }
        }
    }
}