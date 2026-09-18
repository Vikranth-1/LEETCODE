class Node {
    Node[] children;
    boolean isEndOfWord;

    public Node() {
        children = new Node[26];
        for (int i = 0; i < children.length; i++) {
            children[i] = null;
        }
        isEndOfWord = false;
    }
}

class Trie {
    Node root;

    public Trie() {
        root = new Node();
    }

    public void insert(String str) {
        Node current = root;
        for (char ch : str.toCharArray()) {
            int index = ch - 'a';
            if (current.children[index] == null) {
                current.children[index] = new Node();
            }
            current = current.children[index];
        }
        current.isEndOfWord = true;
    }

    public boolean search(String str) {
        Node current = root;
        for (char ch : str.toCharArray()) {
            int index = ch - 'a';
            if (current.children[index] == null)
                return false;
            current = current.children[index];
        }
        return current.isEndOfWord;
    }

    public boolean startsWith(String str) {
        Node current = root;
        for (char ch : str.toCharArray()) {
            if (current.children[(int) (ch - 'a')] == null)
                return false;
            current = current.children[(int) (ch - 'a')];
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */
