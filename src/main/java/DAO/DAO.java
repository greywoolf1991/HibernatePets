package DAO;

import entity.Pet;

public interface DAO<Entity, Key> {
    void create(Entity entity);


    Pet read(int petId);

    void update(Entity entity);
    void delete(Entity entity);
}