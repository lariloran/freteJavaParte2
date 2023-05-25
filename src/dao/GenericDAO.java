package dao;

import classes.Cliente;
import classes.MinhaGen;

public interface GenericDAO<T> {
	
	public int insert(T obj);
	public int update(T obj);
	public int delete(T obj);
	public MinhaGen<Cliente> listAll();
	public T findByID(int id);
	public T findByName(String input);
	public T findByCpf(String input);

}
