package level_Easy;

public class SymmetricTree {
	public boolean isSymmetric(TreeNode root) {
		if (root == null) {
			return true;
		}
		return isMirror(root.left, root.right);
	}

	private boolean isMirror(TreeNode leftNode, TreeNode rightNode) {
		// Base case: Both nodes are null, they are mirror images
		if (leftNode == null && rightNode == null) {
			return true;
		}
		// One of the nodes is null, they are not mirror images
		if (leftNode == null || rightNode == null) {
			return false;
		}
		// Check if the values of the nodes are equal and their subtrees are mirror
		// images
		return (leftNode.val == rightNode.val) && isMirror(leftNode.left, rightNode.right)
				&& isMirror(leftNode.right, rightNode.left);
	}
}
