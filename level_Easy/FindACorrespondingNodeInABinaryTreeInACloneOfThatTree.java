package level_Easy;

public class FindACorrespondingNodeInABinaryTreeInACloneOfThatTree {
	TreeNode ans = null;

	public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
		if (original == null)
			return null;
		if (original == target)
			ans = cloned;

		getTargetCopy(original.left, cloned.left, target);
		getTargetCopy(original.right, cloned.right, target);
		return ans;
	}
}
