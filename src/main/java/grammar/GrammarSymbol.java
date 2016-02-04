package grammar;

public interface GrammarSymbol 
{
	boolean isToken();
	boolean isNonTerminal();
	boolean isAction();
}
