package level_Easy;

import java.util.ArrayList;
import java.util.List;

public class LeafSimilarTrees {
	public boolean leafSimilar(TreeNode root1, TreeNode root2) {
		List<Integer> li = new ArrayList<Integer>();
		preorder(root1, li);
		List<Integer> l1 = new ArrayList<Integer>();
		preorder(root2, l1);
		return li.equals(l1);
	}

	public void preorder(TreeNode root, List<Integer> list) {
		if (root == null) {
			return;
		}
		if (root.left == null && root.right == null)
			list.add(root.val);
		preorder(root.left, list);
		preorder(root.right, list);
	}
}
