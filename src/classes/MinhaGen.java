package classes;

import java.util.*;

public class MinhaGen<T> {
	 private List<T> lista;


	    public MinhaGen() {
	        lista = new ArrayList<>();
	    }

	    public void inserir(T obj) {
	        lista.add(obj);
	    }

	    public boolean estaVazia() {
	        return lista.isEmpty();
	    }

	    public void remover(T obj) {
	        lista.remove(obj);
	    }

	    public List<T> getLista() {
	        return lista;
	    }

	    public int getSize() {
	        return lista.size();
	    }

		@Override
		public String toString() {
			return "MinhaGen [lista=" + lista + "]";
		}

}
