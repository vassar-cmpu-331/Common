package edu.vassar.cs.cmpu331.grammar;

public interface GrammarSymbol 
{
	boolean isToken();
	boolean isNonTerminal();
	boolean isAction();
}
