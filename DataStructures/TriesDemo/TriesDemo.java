package DataStructures.TriesDemo;

import java.util.LinkedList;
import java.util.Queue;

public class TriesDemo {
    static class TrieNode {
        boolean isEndOfWord;
        TrieNode[] children = new TrieNode[26];

        TrieNode() {
            isEndOfWord = false;
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
        }

        void insert(String word, TrieNode root) {
            TrieNode currentNode = root;
            for (char ch: word.toCharArray()){
                if(currentNode.children[ch - 'a'] == null){
                    currentNode.children[ch - 'a'] = new TrieNode();
                }
                currentNode = currentNode.children[ch - 'a'];
            }
            currentNode.isEndOfWord = true;
        }

        boolean search(String word, TrieNode root){
            TrieNode currentNode = root;
            for(char ch: word.toCharArray()){
                int index = ch - 'a';
                if(currentNode.children[index] == null){
                    return false;
                }
                currentNode = currentNode.children[index];
            }
            return currentNode.isEndOfWord;
        }

        void printTrieLevelByLevel(TrieNode root){
            Queue<TrieNode> queue = new LinkedList<>();
            queue.add(root);
            while(!queue.isEmpty()){
                int levelSize = queue.size();
                for(int i=0; i<levelSize; i++){
                    TrieNode currentNode = queue.poll();
                    for(int j=0; j<26; j++){
                        if(currentNode.children[j] != null){
                            System.out.print((char)(j + 'a') + " ");
                            queue.add(currentNode.children[j]);
                        }
                    }
                }
                System.out.println();
            }
        }

        boolean startsWith(String prefix, TrieNode root){
            TrieNode currentNode = root;
            for(char ch: prefix.toCharArray()){
                int index = ch - 'a';
                if(currentNode.children[index] == null){
                    return false;
                }
                currentNode = currentNode.children[index];
            }
            return true;
        }

        void printAllWords(TrieNode root, String currentWord){
            if(root.isEndOfWord){
                System.out.println(currentWord);
            }
            for(int i=0; i<26; i++){
                if(root.children[i] != null){
                    printAllWords(root.children[i], currentWord + (char)(i + 'a'));
                }
            }
        }

        boolean isEmpty(TrieNode node){
            for(int i=0; i<26; i++){
                if(node.children[i] != null){
                    return false;
                }
            }
            return true;
        }

        boolean delete(String word, TrieNode root, int depth){
            if(root == null){
                return false;
            }
            if(depth == word.length()){
                if(root.isEndOfWord){
                    root.isEndOfWord = false;
                    return true;
                } else {
                    return false;
                }
            }
            int index = word.charAt(depth) - 'a';
            if(root.children[index] == null){
                return false;
            }  
            boolean deleted = delete(word, root.children[index], depth + 1);
            if(deleted && isEmpty(root.children[index]) && !root.children[index].isEndOfWord){
                root.children[index] = null;
            }
            return deleted;
        }

        // Auto Completion suggestions
        void autoComplete(String prefix, TrieNode root){
            TrieNode currentNode = root;
            for(char ch: prefix.toCharArray()){
                int index = ch - 'a';
                if(currentNode.children[index] == null){
                    System.out.println("No suggestions found for the given prefix.");
                    return;
                }
                currentNode = currentNode.children[index];
            }
            System.out.println("Suggestions for the given prefix:");
            printAllWords(currentNode, prefix);
        }

    }

    static String randomWord(){
        String[] words = {"apple", "applex", "appley", "banana", "grape", "orange", "peach", "strawberry", "watermelon", "kiwi", "mango", "pineapple"};
        int index = (int) (Math.random() * words.length);
        return words[index];
    }

    static TrieNode createTrie(){
        TrieNode root = new TrieNode();
        root.insert(randomWord(), root);
        root.insert(randomWord(), root);
        root.insert(randomWord(), root);
        root.insert(randomWord(), root);
        root.insert(randomWord(), root);
        root.insert(randomWord(), root);
        root.insert(randomWord(), root);
        root.insert(randomWord(), root);
        return root;
    }

    private static void performBasicOperationsOnTrie() {
        TrieNode root = createTrie();
        System.out.println("Trie structure (level by level):");
        root.printTrieLevelByLevel(root);
        System.out.println("All words in the trie:");
        root.printAllWords(root, "");
        String wordToSearch = randomWord();
        System.out.println("Searching for word: " + wordToSearch);  
        boolean found = root.search(wordToSearch, root);
        if (found) {
            System.out.println("Word found in trie.");
        } else {
            System.out.println("Word not found in trie.");
        }
        String prefixToSearch = randomWord().substring(0, 3);
        System.out.println("Checking if trie starts with prefix: " + prefixToSearch);
        boolean starts = root.startsWith(prefixToSearch, root);
        if (starts) {
            System.out.println("Trie starts with the given prefix.");
        } else {
            System.out.println("Trie does not start with the given prefix.");
        }
        String wordToDelete = randomWord();
        System.out.println("Deleting word: " + wordToDelete);
        boolean deleted = root.delete(wordToDelete, root, 0);
        if (deleted) {
            System.out.println("Word deleted successfully.");
        } else {
            System.out.println("Word not found for deletion.");
        }
        System.out.println("All words in the trie after deletion:");
        root.printAllWords(root, "");
        System.out.println("Auto-completion suggestions for prefix: " + "ap");
        root.autoComplete("ap", root);
    }

    public static void main(String[] args){
        performBasicOperationsOnTrie();
    }

}
