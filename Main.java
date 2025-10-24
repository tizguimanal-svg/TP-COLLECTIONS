package tp5;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {

    	 Commande c1 = new Commande(1, new Date(), "manal tizgui");
         Commande c2 = new Commande(2, new Date(), "ahmad akram");
         Commande c3 = new Commande(3, new Date(), "marwa rassy");

        Client client1 = new Client(1, "malak", "Casablanca", "0612345678");
        ClientFidel client2 = new ClientFidel(2, "rihab", "Rabat", "FID123", 10.5f, "0699887766");

        client1.EnregistrerCommande(c1);
        client1.EnregistrerCommande(c2);
        client1.EnregistrerCommande(c3);

        client2.EnregistrerCommande(c2);

        Collections.sort(client1.getListeCommandes(), (cmd1, cmd2) -> cmd1.compareTo(cmd2));

        Set<Commande> setCommandes = new HashSet<>(client1.getListeCommandes());

        Map<Integer, Client> mapClients = new HashMap<>();
        mapClients.put(client1.getCodeClient(), client1);
        mapClients.put(client2.getCodeClient(), client2);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("clients.txt"))) {
            for (Client c : mapClients.values()) {
                writer.write(c.toString());
                writer.newLine();
                writer.newLine();
            }
            System.out.println("Les informations ont été enregistrées dans clients.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedReader reader = new BufferedReader(new FileReader("clients.txt"))) {
            System.out.println("Contenu du fichier clients.txt :\n");
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } 
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
