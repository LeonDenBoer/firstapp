package nl.hu.v1.wac.firstapp.persistence;

import java.util.List;
import nl.hu.v1.wac.firstapp.model.Country;

public interface CountryDao {

    boolean save(Country country);
    List<Country> findAll();
    Country findByCode(String code);
    List<Country> find10LargestPopulations();
    List<Country> find10LargestSurfaces();
    boolean update(Country country);
    boolean delete(Country country);

}
