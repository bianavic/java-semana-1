package br.com.codenation.desafioexe;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DesafioApplication {

	public static List<Integer> fibonacci() {
		return IntStream.range(0, 15).mapToObj(DesafioApplication::fibonnaci).collect(Collectors.toList());
	}

	public static Boolean isFibonacci(Integer a) {
		return fibonacci().contains(a);
	}

	public static Integer fibonnaci(Integer i) {
		return i < 2 ? i : fibonnaci(i - 1) + fibonnaci(i - 2);
	}


}