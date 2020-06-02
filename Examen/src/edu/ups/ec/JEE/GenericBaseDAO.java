package edu.ups.ec.JEE;

import java.util.List;

public interface GenericBaseDAO<T, ID> {

  

    public boolean create(T entity);

    public T findById(ID id);

    public boolean update(T entity);

    public boolean delete(T entity);

    
    public boolean deleteById(ID id);
    
    public List<T> find();
}
