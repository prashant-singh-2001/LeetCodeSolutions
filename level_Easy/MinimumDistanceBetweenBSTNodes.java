package level_Easy;

public class MinimumDistanceBetweenBSTNodes {
	int minDiff = Integer.MAX_VALUE;
	Integer prev = null;

	public int minDiffInBST(TreeNode root) {
		if (root == null)
			return minDiff;

		minDiffInBST(root.left);

		if (prev != null)
			minDiff = Math.min(minDiff, Math.abs(root.val - prev));
		prev = root.val;

		minDiffInBST(root.right);

		return minDiff;
	}
}
