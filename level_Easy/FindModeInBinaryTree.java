package level_Easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindModeInBinaryTree {
	public int[] findMode(TreeNode root) {
		if (root == null)
			return new int[0];
		Map<Integer, Integer> map = new HashMap<>();
		inOrder(root, map);
		List<Integer> res = new ArrayList<>();
		int max = Integer.MIN_VALUE;
		for (int key : map.keySet()) {
			max = Math.max(max, map.get(key));
		}
		for (int key : map.keySet()) {
			if (map.get(key) == max) {
				res.add(key);
			}
		}
		int[] result = new int[res.size()];
		for (int i = 0; i < result.length; i++) {
			result[i] = res.get(i);
		}
		return result;
	}

	private void inOrder(TreeNode node, Map<Integer, Integer> map) {
		if (node == null)
			return;
		inOrder(node.left, map);
		map.put(node.val, map.getOrDefault(node.val, 0) + 1);
		inOrder(node.right, map);
	}
}
