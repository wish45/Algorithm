package LeetCode.Easy;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList();

        if(root==null){
            return result;
        }

        String current_path = Integer.toString(root.val);
        if(root.left==null && root.right==null){
            result.add(current_path);
        }
        if(root!=null && root.left!= null){
            dfs(current_path, root.left, result);
        }
        if(root!=null && root.right!=null){
            dfs(current_path, root.right, result);
        }
        return result;
    }

    public void dfs(String current_path , TreeNode node, List<String> result){
        current_path = current_path +"->"+ node.val;

        if(node.left == null && node.right == null){
            result.add(current_path);
            return;
        }
        if(node!=null && node.left!=null){
            dfs(current_path, node.left, result);
        }
        if(node!=null && node.right!=null){
            dfs(current_path, node.right, result);
        }
    }
}

