import DAO.PetDAO;
import entity.Pet;

public class Main {

    public static void main(String[] args) {
        PetDAO petDAO = new PetDAO();
        Pet pet = petDAO.read(3);
        petDAO.delete(pet);
    }
}
