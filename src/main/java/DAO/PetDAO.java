package DAO;

import entity.Pet;
import org.hibernate.Session;
import utils.HSF;

public class PetDAO implements DAO<Pet, String> {

    @Override
    public void create(final Pet pet) {
        try (final Session session = HSF.getSessionFactory().openSession()) {
            session.beginTransaction();
            session.save(pet);
            session.getTransaction().commit();
        }
    }

    @Override
    public Pet read(final int petId) {
        try (final Session session = HSF.getSessionFactory().openSession()) {
            final Pet result = session.get(Pet.class, petId);
            return result != null ? result : new Pet();
        }
    }

    @Override
    public void update(final Pet pet) {
        try (final Session session = HSF.getSessionFactory().openSession()) {
            session.beginTransaction();
            session.update(pet);
            session.getTransaction().commit();
        }
    }

    @Override
    public void delete(final Pet pet) {
        try (final Session session = HSF.getSessionFactory().openSession()) {
            session.beginTransaction();
            session.delete(pet);
            session.getTransaction().commit();
        }
    }
}
