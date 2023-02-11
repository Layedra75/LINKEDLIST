public class Node {

    // Declaring the variables that will be used in the class.
    private int info;
    private Node link;

    
    // This is a constructor. It is used to initialize the object.
    public Node() {
        this.info = 0;
        this.link = null;
    }

    /**
     * @param info
     */
    public Node(int info) {
        this.info = info;
        this.link = null;
    }

    /**
     * @param info
     * @param link
     */
    public Node(int info, Node link) {
        this.info = info;
        this.link = link;
    }
   
    /**
     * @return
     */
    public int getInfo() {
        return info;
    }

    /**
     * @param info
     */
    public void setInfo(int info) {
        this.info = info;
    }
   
    /**
     * @return
     */
    public Node getLink() {
        return link;
    }

    /**
     * @param link
     */
    public void setLink(Node link) {
        this.link = link;
    }
}