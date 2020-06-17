package br.com.codenation.desafioexe;

public class Fibonacci {

        public static Integer fibonnaci(Integer i) {
            return i < 2 ? i : fibonnaci(i - 1) + fibonnaci(i - 2);
        }

}
