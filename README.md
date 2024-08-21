# BBM204 - Spring 2024 - PA4: Trie-Based Search Engine Autocomplete

This project is part of the BBM204 Software Practicum II course. The aim is to implement a search engine autocomplete feature using a Trie (Prefix Tree) data structure. The system allows users to input a prefix and receive suggestions of words that begin with that prefix.

## Problem Statement:
Implement a search engine autocomplete feature. The system should allow users to enter a string (prefix), and it will suggest the most relevant words that start with that prefix.

## Data Structure Requirement: 
Trie: The primary data structure to be used is a Trie (Prefix Tree). The Trie will store all the words, and each node in the Trie will represent a character. The Trie will enable efficient insertion, deletion, and searching of words.

## Features
- **Trie Data Structure**: Efficiently stores and manages a large set of words, enabling fast insertion, deletion, and prefix-based search operations.
- **Autocomplete Functionality**: Given a user-inputted prefix, returns a list of possible word completions from the Trie.
- **Word Management**:
  - **Insertion**: Adds new words to the Trie.
  - **Deletion**: Removes words from the Trie.

## How to Run
1. **Compilation**: Compile the Java files using the following command:
   ```bash
   javac *.java
   ```

2. **Execution**: Run the program, which will load the dataset into the Trie and allow for command-based interaction:
   ```bash
   java Main <projectsXMLFile> <hyperloopDATFile>
   ```

3. **Commands**:
   - **Insert <word>**: Adds the specified word to the Trie.
   - **Delete <word>**: Removes the specified word from the Trie.
   - **Autocomplete <prefix>**: Returns all words that start with the given prefix.

4. **Output**: The results of each command will be displayed in the console or written to an output file, depending on implementation.

## Input Files
- **dataset.txt**: Contains the list of words to be initially loaded into the Trie.

## Output Files
- **output.txt** (if implemented): Logs the results of each command executed by the user.

## Testing
Test the program by trying different prefixes, adding and removing words, and checking if the autocomplete suggestions are correct. Consider edge cases such as:
- Prefixes that do not match any word.
- Adding duplicate words.
- Deleting words that do not exist.

## Known Issues
- The program assumes well-formed input commands; it may not handle malformed input gracefully.
- Performance may degrade slightly if the dataset becomes extremely large, though the Trie structure helps maintain efficiency.

## Future Improvements
- Add error handling for invalid commands or input formats.
- Implement a graphical user interface (GUI) for easier interaction.
