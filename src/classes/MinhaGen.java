package classes;

import java.util.*;

public class MinhaGen<T> {
	 private List<T> lista;


	    public MinhaGen() {
	        lista = new ArrayList<>();
	    }

	    // Métodos para manipular a lista
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

		@Override
		public String toString() {
			return "MinhaGen [lista=" + lista + "]";
		}

}
