package pl.sdacademy.designpatterns.Facade;

import java.util.List;

public interface MultiValueAttrRepo {
    MultiValueAttribute create (MultiValueAttribute mva);
    MultiValueAttribute getById (Long id);
    List<MultiValueAttribute> findAll ();


}
