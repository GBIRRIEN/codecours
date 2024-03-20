import java.util.ArrayList;

public class Atlantik {
    public static void main(String[] args) {

    Equipement unEquipement = new Equipement(1, "Rames");
    Equipement deuxEquipement = new Equipement(2, "Moteur");
    Equipement troisEquipement = new Equipement(3, "Bouée de sauvetage");
    Equipement quatreEquipement = new Equipement(4, "Gilet de sauvetage");

    ArrayList<Equipement> oEquipBat1 = new ArrayList<>();
    ArrayList<Equipement> oEquipBat2 = new ArrayList<>();

    oEquipBat1.add(deuxEquipement);
    oEquipBat1.add(troisEquipement);
    oEquipBat1.add(quatreEquipement);

    oEquipBat2.add(unEquipement);
    oEquipBat2.add(troisEquipement);
    oEquipBat2.add(quatreEquipement);

    BateauVoyageur oBat1 = new BateauVoyageur("1", "Luce Isle", 37.2, 8.6, 15.0, "LuceIsle.png", oEquipBat1);
    BateauVoyageur oBat2 = new BateauVoyageur("222", "Al'xi", 25.0, 7.0, 18.0, "Alxi.jpg", oEquipBat2);

    System.out.println(oBat1.versChaine());
    System.out.println(oBat2.versChaine());

    }
}