package level_Easy;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePreorderTraversal {
	public List<Integer> preorderTraversal(TreeNode root) {
		List<Integer> li = new ArrayList<Integer>();
		preorder(root, li);
		return li;
	}

	public void preorder(TreeNode root, List<Integer> list) {
		if (root == null) {
			return;
		}
		list.add(root.val);
		preorder(root.left, list);
		preorder(root.right, list);
	}
}
