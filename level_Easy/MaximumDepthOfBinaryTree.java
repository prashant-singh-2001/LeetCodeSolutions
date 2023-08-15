package level_Easy;

public class MaximumDepthOfBinaryTree {
	public int maxDepth(TreeNode root) {
		return maxDepth(root, 0);
	}

	public int maxDepth(TreeNode root, int h) {
		if (root == null)
			return h;
		h = h + 1;
		h = Math.max(maxDepth(root.right, h), maxDepth(root.left, h));
		return h;
	}
}
