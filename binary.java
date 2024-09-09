public class binary {

    int size;
    int hoyde;

    public class Node{
        Node left;
        Node right;
        int element;
        int dybde;

        Node(int el){
            left = null;
            right = null;
            element = el;
            
        }
    }

    Node Insert(Node v,int x){
        if(v==null){
            v = new Node(x);
            size++;
            return v;
        }
        else if(x<v.element){
            v.left = Insert(v.left,x);
        }
        else if(x>v.element){
            v.right = Insert(v.right,x);
        }
        return v;
    }

    Node Search(Node v, int x){
        if(v==null){
            return null;
        }
        if(v.element == x){
            return v;
        }
        if(x>v.element){
            return Search(v.right,x);
        }
            return Search(v.left,x);
    }

    
    
}
