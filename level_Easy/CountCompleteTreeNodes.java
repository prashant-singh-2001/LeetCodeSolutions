package level_Easy;

import java.util.ArrayList;
import java.util.List;

public class CountCompleteTreeNodes {
	public int countNodes(TreeNode root) {
		if (root == null)
			return 0;
		List<Integer> li = new ArrayList<>();
		lin(root, li);
		return li.size();
	}

	private void lin(TreeNode root, List<Integer> li) {
		if (root == null)
			return;
		li.add(root.val);
		lin(root.right, li);
		lin(root.left, li);
	}
}
