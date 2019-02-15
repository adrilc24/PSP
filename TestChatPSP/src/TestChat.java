
public class TestChat {
	
    boolean isInvalidWord;
    String word = "dork toss nerd";


    do {
      noun = console.readLine("Enter a noun:  ");
      // Boolean reads back eaither true or false
      // use isInvalidWord as a variable for all invalid words to stop repetition
      isInvalidWord = (noun.contains(word));

   // ban certain language being used in both lower and upper case. \\ means or.
      if(isInvalidWord) {
         console.printf("That language is not allowed! Try again. \n\n");
        }
      }  while(isInvalidWord);

    String adverb = console.readLine("Enter an adverb:  ");
    String verb = console.readLine("Enter a verb:  ");

    console.printf("My TreeStoryPrototype:\n---------------\n");
    console.printf("%s is a %s %s. They are always %s %s.\n", name, adjective, noun, adverb, verb);
}
	List<String> censoredWords = new ArrayList<>();
	censoredWords.add("dork");
	// some lines later
	censoredWords.contains(noun);
	
	for (String censoredWord : censoredWords) {
		   // will be true if userInput = "tosser" and one of censored words is "toss"
		   if (userInput.contains(censoredWord) {
		       isInvalidWord = true;
		       break;
		   }
		}

}
