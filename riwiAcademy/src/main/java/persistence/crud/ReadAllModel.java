package persistence.crud;


import java.util.List;

public interface ReadAllModel<Entity> {
    public List<Entity> readAll();
}
