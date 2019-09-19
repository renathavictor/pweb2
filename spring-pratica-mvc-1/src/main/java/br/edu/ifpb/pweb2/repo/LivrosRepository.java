package br.edu.ifpb.pweb2.repo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import br.edu.ifpb.pweb2.model.Livro;

public class LivrosRepository {

	private static Map<Long, Livro> repositorio = new HashMap<Long, Livro>();
	
	public static Livro findById(Long id) {
		return repositorio.get(id);
	}
	
	public static void store(Livro livro) {
		repositorio.put(livro.getId(), livro);
	}
	
	public static List<Livro> findAll() {
		List<Livro> livros = repositorio.values().stream()
				.collect(Collectors.toList());
		return livros;
	}
}
