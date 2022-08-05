package LeetCode.medium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeRightSideView {

    public static class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }

  public static void main(String args[]){
      BinaryTreeRightSideView asd = new BinaryTreeRightSideView();
      TreeNode node = new TreeNode();
      node.val=1;
      node.left = new TreeNode();
      node.left.val=2;

      node.right = new TreeNode();
      node.right.val=3;

      node.left.left = null;
      node.left.right = new TreeNode();
      node.left.right.val = 5;

      node.right.left = null;
      node.right.right = new TreeNode();
      node.right.right.val = 4;
      System.out.println(asd.rightSideView(node));
      
  }

    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ret = new ArrayList<>();
        if (root == null) {
            return ret;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                TreeNode cur = q.poll();
                if (i == size - 1) {
                    ret.add(cur.val);
                }
                if (cur.left != null) {
                    q.offer(cur.left);
                }
                if (cur.right != null) {
                    q.offer(cur.right);
                }

            }
        }
        return ret;
    }
}
