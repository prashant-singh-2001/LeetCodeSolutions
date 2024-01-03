package level_Easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SecondMinimumNodeInABinaryTree {
	public int findSecondMinimumValue(TreeNode root) {
		List<Integer> list = new ArrayList<Integer>();
		inorder(root, list);
		Collections.sort(list);
		int min = list.get(0);
		int smin = list.get(list.size() - 1);
		for (Integer i : list) {
			if (i < smin && i != min) {
				smin = i;
			}
		}
		return smin == min ? -1 : smin;
	}

	public void inorder(TreeNode root, List<Integer> list) {
		if (root == null) {
			return;
		}
		inorder(root.left, list);
		list.add(root.val);
		inorder(root.right, list);
	}
}
