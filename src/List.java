public class List {
    // Declaring the first and last node of the list.
    private Node first;
    private Node last;

    // The constructor of the class.
    public List() {
        this.first = null;
        this.last = null;
    }

    /**
     * The function takes in an integer and creates a new node with that integer as its data. If the
     * list is empty, the new node becomes the first and last node. If the list is not empty, the new
     * node becomes the first node and the old first node becomes the second node
     * 
     * @param info the value to be added to the list
     */
    public void unshift (int info) {
        Node newNode = new Node(info);
        if (first == null){
            this.first = newNode;
            this.last = newNode;
        } else {
            newNode.setLink(this.first);
            this.first = newNode;
        }
    }

    /**
     * The function takes an integer as an argument and creates a new node with that integer as its
     * data. If the list is empty, the new node becomes the first and last node. If the list is not
     * empty, the new node becomes the last node and the previous last node's link is set to the new
     * node
     * 
     * @param info the value of the node
     */
    public void push (int info) {
        Node newNode = new Node(info);
        if (first == null){
            this.first = newNode;
            this.last = newNode;
        } else {
            this.last.setLink(newNode);
            this.last = newNode;
            this.last.setLink(null);
        }
    }

    /**
     * If the first node is null, then the list is empty
     * 
     * @return The first node in the list.
     */
    public boolean isEmpty() {
        return this.first == null;
    }

    /**
     * The function searches for a given value in the linked list
     * 
     * @param info the value to be searched
     * @return The boolean value of the search method.
     */
    public boolean search(int info) {
        Node p = first;
        while(p.getLink() != null) {
            if (p.getInfo() == info) {
                return true;
            } 
            p = p.getLink();
        }
        return false;
    }

    /**
     * This function removes the first element of the list and returns true if the list is not empty
     * 
     * @return The first element of the list is being returned.
     */
    public boolean shift(){
        if(this.isEmpty())
        return false;
        if (this.first.getLink() == null) {
            this.first = null;
            this.last = null;
            return true;
        }
        Node temp = this.first;
        this.first = this.first.getLink();
        temp = null;
        return true;
    }

    /**
     * The function checks if the list is empty, if it is, it returns false. If it isn't, it checks if
     * the list has only one element, if it does, it sets the first and last pointers to null and
     * returns true. If it doesn't, it creates two temporary nodes, one to traverse the list and one to
     * keep track of the previous node. It then traverses the list until it reaches the last node, sets
     * the last pointer to the previous node, sets the link of the previous node to null, and sets the
     * temporary node to null
     * 
     * @return The method returns a boolean value.
     */
    public boolean pop(){
        if(this.isEmpty())
        return false;
        if (this.first.getLink() == null){
            this.first = null;
            this.last = null;
            return true;
        }
        Node temp = this.first;
        Node temp2 = this.first;
        while (temp.getLink() != null) {
            temp2 = temp;
            temp = temp.getLink();
        } 
        this.last = temp2;
        this.last.setLink(null);
        temp = null;
        return true;
    }

    /**
     * The function prints the contents of the linked list
     * 
     * @return The string of the list.
     */
    public String print(){
        String str = "";
        Node p = this.first;
        while (p.getLink() != null){
            str += p.getInfo() + " | ";
            p = p.getLink();
        }
        return str;
    }
}