package level_Easy;

import java.util.ArrayList;
import java.util.List;

public class IncreasingBST {
	public TreeNode increasingBST(TreeNode root) {
		List<Integer> list = new ArrayList<Integer>();
		inorder(root, list);
		TreeNode r1 = root;
		int i = 0;
		for (; i < list.size() - 1; i++) {
			r1.val = list.get(i);
			r1.left = null;
			r1.right = new TreeNode();
			r1 = r1.right;
		}
		r1.val = list.get(i);
		return root;
	}

	public void inorder(TreeNode root, List<Integer> list) {
		if (root == null) {
			return;
		}
		inorder(root.left, list);
		list.add(root.val);
		inorder(root.right, list);
	}
}
