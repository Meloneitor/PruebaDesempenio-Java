package persistence.crud;

import javax.swing.text.html.parser.Entity;

public interface CreateModel<Entity> {
    public Entity create(Entity request);
}
