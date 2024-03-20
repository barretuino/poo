package br.unisal.colecoes;

import java.util.Collection;
import java.util.TreeSet;

public class ExemploSet {
	public static void main(String[] args) {
		Collection c = new TreeSet();
		
		c.add("João");
		c.add("Maria");
		c.add("Lucas");
		c.add("André");
		c.add("Madalena");
		c.add("Barnabé");
		c.add("Ana");
		
		System.out.println(c);
		
	}
}
