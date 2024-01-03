package level_Easy;

public class MinimuAbsoluteDiffernceInBST {
	int minDiff = Integer.MAX_VALUE;
	Integer prev = null;

	public int getMinimumDifference(TreeNode root) {
		if (root == null)
			return minDiff;

		getMinimumDifference(root.left);

		if (prev != null)
			minDiff = Math.min(minDiff, Math.abs(root.val - prev));
		prev = root.val;

		getMinimumDifference(root.right);

		return minDiff;
	}
}
