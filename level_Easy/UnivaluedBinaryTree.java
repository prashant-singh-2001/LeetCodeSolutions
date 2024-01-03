package level_Easy;

public class UnivaluedBinaryTree {
	public boolean isUnivalTree(TreeNode root) {
		if (root == null)
			return true;
		int n = root.val;
		return isUnivalTree(root, n);
	}

	public boolean isUnivalTree(TreeNode root, int n) {
		if (root == null)
			return true;
		if (root.val != n)
			return false;
		return isUnivalTree(root.right, n) && isUnivalTree(root.left, n);
	}
}
