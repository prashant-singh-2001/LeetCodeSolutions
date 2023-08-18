package level_Easy;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePostoderTraversal {
	public List<Integer> postorderTraversal(TreeNode root) {
		List<Integer> li = new ArrayList<Integer>();
		postorder(root, li);
		return li;
	}

	public void postorder(TreeNode root, List<Integer> list) {
		if (root == null) {
			return;
		}
		postorder(root.left, list);
		postorder(root.right, list);
		list.add(root.val);

	}
}
