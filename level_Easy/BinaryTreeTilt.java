package level_Easy;

public class BinaryTreeTilt {
	int sum = 0;

	public int findTilt(TreeNode root) {
		postOrder(root);
		return sum;
	}

	private int postOrder(TreeNode node) {
		if (node == null) {
			return 0;
		}

		int leftSum = postOrder(node.left);
		int rightSum = postOrder(node.right);

		sum += Math.abs(leftSum - rightSum);

		return leftSum + rightSum + node.val;
	}
}
