package level_Easy;

import java.util.ArrayList;
import java.util.List;

public class NaryTreePreorderTraversal {
	public List<Integer> preorder(Node root) {
		List<Integer> lis = new ArrayList<>();
		preorder(root, lis);
		return lis;
	}

	public void preorder(Node r, List<Integer> t) {
		if (r == null)
			return;
		t.add(r.val);
		for (Node e : r.children) {
			preorder(e, t);
		}
		return;
	}
}
