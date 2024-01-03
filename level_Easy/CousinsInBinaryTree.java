package level_Easy;

public class CousinsInBinaryTree {
	private int x;
	private int y;
	private int depthX;
	private int depthY;
	private TreeNode parentX;
	private TreeNode parentY;

	public boolean isCousins(TreeNode root, int x, int y) {
		this.x = x;
		this.y = y;
		this.depthX = -1;
		this.depthY = -1;
		this.parentX = null;
		this.parentY = null;

		dfs(root, null, 0);

		return depthX == depthY && parentX != parentY;
	}

	private void dfs(TreeNode node, TreeNode parent, int depth) {
		if (node == null) {
			return;
		}

		if (node.val == x) {
			depthX = depth;
			parentX = parent;
		} else if (node.val == y) {
			depthY = depth;
			parentY = parent;
		}

		dfs(node.left, node, depth + 1);
		dfs(node.right, node, depth + 1);
	}
}
