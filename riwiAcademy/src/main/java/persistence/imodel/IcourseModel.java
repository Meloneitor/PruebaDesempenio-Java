package persistence.imodel;

import persistence.crud.CreateModel;
import persistence.crud.DeleteModel;
import persistence.crud.ReadByIdModel;

import java.awt.*;

public interface IcourseModel {
    CreateModel<>,
    DeleteModel<Integer>,
    ReadByIdModel<Integer>

}
