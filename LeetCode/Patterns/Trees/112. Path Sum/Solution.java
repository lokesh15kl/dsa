class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null) return false;

        Stack<TreeNode> nodeStack = new Stack<>();
        Stack<Integer> sumStack = new Stack<>();

        nodeStack.push(root);
        sumStack.push(targetSum - root.val);

        while(!nodeStack.isEmpty()) {
            TreeNode node = nodeStack.pop();
            int remaining = sumStack.pop();

            if(node.left == null && node.right == null && remaining == 0) {
                return true;
            }

            if(node.left != null) {
                nodeStack.push(node.left);
                sumStack.push(remaining - node.left.val);
            }
            if(node.right != null) {
                nodeStack.push(node.right);
                sumStack.push(remaining - node.right.val);
            }
        }
        return false;
    }
}