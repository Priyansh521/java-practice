public class binary_tree {
        static class Node {
            int data;
            Node left;
            Node right;

            Node(int data) {
                this.data = data;
                this.left = null;
                this.right = null;
        }

        static class BinaryTree {
            static int idx = -1;

            public static Node buildTree(int nodes[]) {
                idx++;
                if(idx >= nodes.length || nodes[idx] == -1){
                    return null;
                }
                Node newNode = new Node(nodes[idx]);
                newNode.left = buildTree(nodes);
                newNode.right = buildTree(nodes);
                return newNode;
            }
        }
        public static int count(Node root){
                if(root == null){
                    return 0;
                }
                int leftNodes = count(root.left);
                int rightNodes = count(root.right);
                return leftNodes + rightNodes +1;//this 1 we're adding for the root node
        }
        public static int sumOfNodes(Node root){
                if(root == null){
                    return 0;
                }
                int leftSum = sumOfNodes(root.left);
                int rightSum = sumOfNodes(root.right);
                return leftSum+rightSum+root.data;
        }
        public static int height(Node root){
                if(root == null){
                    return 0;
                }
                int leftHeight = height(root.left);
                int rightHeight = height(root.right);
                int max = Math.max(leftHeight, rightHeight);
                return max +1;
        }
        public static void main(String[] args) {
            int nodes[] = {1,2,3,-1,-1,4,5,-1,-1,6};
            BinaryTree tree = new BinaryTree();
            Node root = tree.buildTree(nodes);
            System.out.println(root.data);
            System.out.println(count(root));
            System.out.println(sumOfNodes(root));
            System.out.println(height(root));
        }
    }
}
