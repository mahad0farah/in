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


/*
static void yo(teque t) throws FileNotFoundException {
        try (Scanner s = new Scanner(System.in)) {
            while (s.hasNextLine()) {
                String temp[] = s.nextLine().split(" ");
                if (temp.length != 1) {
                    int x = Integer.parseInt(temp[1]);
                    switch (temp[0]) {
                        case "push_front" ->
                            t.push_front(new Node(x));
                        case "push_back" ->
                            t.push_back(new Node(x));
                        case "push_middle" ->
                            t.push_middle(new Node(x));
                        default ->
                            System.out.println(t.get(x));
                    }
                }
                
            }
        }
    } 
        
    */