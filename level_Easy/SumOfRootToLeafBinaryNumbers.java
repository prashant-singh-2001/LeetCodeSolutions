package level_Easy;

public class SumOfRootToLeafBinaryNumbers {
	public int ans = 0;

	public void search(TreeNode node, int pre) {
		if (node.left == null && node.right == null)
			this.ans += pre * 2 + node.val;
		if (node.left != null)
			search(node.left, pre * 2 + node.val);
		if (node.right != null)
			search(node.right, pre * 2 + node.val);
	}

	public int sumRootToLeaf(TreeNode root) {
		search(root, 0);
		return this.ans;
	}
}
