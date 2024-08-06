package persistence.crud;

public interface ReadByIdModel<ID, Entity> {
    public Entity readByID(ID id);
}
