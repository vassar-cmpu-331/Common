package edu.vassar.cs.cmpu331.errors;

/** Exception class thrown when a lexical error is encountered. */
public class LexicalError extends CompilerError
{
   public LexicalError(Type errorNumber, String message)
   {
      super(errorNumber, message);
   }

   // Factory methods to generate the lexical exception types.

   public static LexicalError BadComment(int line)
   {
      return new LexicalError(Type.BAD_COMMENT,
                              ">>> ERROR ON LINE " + line + " Cannot include { inside a comment.");
   }

   public static LexicalError IllegalCharacter(char c, int line)
   {
      return new LexicalError(Type.ILLEGAL_CHARACTER,
                              ">>> ERROR ON LINE " + line + " : Illegal character " + c);
   }

   public static LexicalError UnterminatedComment(int line)
   {
      return new LexicalError(Type.UNTERMINATED_COMMENT,
                              ">>> ERROR ON LINE " + line + " : Unterminated comment.");
   }
   
   public static LexicalError IdentifierTooLong (String id)
   {
      return new LexicalError(Type.IDENTIFIER_TOO_LONG,
                              ">>> ERROR : Identifier or constant" + id + " too long.");
   }   
   
}
