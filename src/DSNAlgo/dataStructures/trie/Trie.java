package DSNAlgo.dataStructures.trie;

public class Trie {

    private class TrieNode{

        private TrieNode[] children;
        private boolean isWord;
        public TrieNode(){
            this.children = new TrieNode[26]; // Stroing english letters from a-z
            this.isWord = false;
        }

    }

    private TrieNode root;

    public Trie(){
       root = new TrieNode();
    }

    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insert("cat");
        trie.insert("cab");
        trie.insert("son");
        trie.insert("so");
        trie.insert("club");
    }

    public void insert(String word){
        if(word == null && word.isEmpty()){
            throw new IllegalArgumentException("Invalid input");
        }
        word = word.toLowerCase();
        TrieNode current = root;
        for(int i=0;i<word.length();i++){
            char c = word.charAt(i);
            int index = c-'a';
            if(current.children[index] == null){
                TrieNode node = new TrieNode();
                current.children[index] = node;
                current = node;
            }
            else{
                current = current.children[index];
            }
        }
       current.isWord = true;
    }
}
