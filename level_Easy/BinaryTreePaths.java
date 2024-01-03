package level_Easy;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths {
	public List<String> binaryTreePaths(TreeNode root) {
		List<String> res = new ArrayList<>();
		if (root == null)
			return res;
		dfs(root, new StringBuilder(), res);
		return res;
	}

	private void dfs(TreeNode node, StringBuilder path, List<String> result) {
		if (node == null) {
			return;
		}
		int len = path.length();
		path.append(node.val);
		if (node.left == null && node.right == null) {
			// Leaf node, add the path to the result list
			result.add(path.toString());
		} else {
			path.append("->");
			dfs(node.left, path, result);
			dfs(node.right, path, result);
		}
		path.setLength(len);
	}
}
