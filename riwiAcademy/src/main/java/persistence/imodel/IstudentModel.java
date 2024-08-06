package persistence.imodel;

import entities.student;
import persistence.crud.CreateModel;
import persistence.crud.ReadAllModel;

public interface IstudentModel extends CreateModel<student>,
        ReadAllModel<student> {

    public student readByEmail(String email);
}
