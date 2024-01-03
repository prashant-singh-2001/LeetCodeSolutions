package level_Easy;

import java.util.ArrayList;
import java.util.List;

public class NaryTreePostorderTraversal {
	public List<Integer> postorder(Node root) {
		List<Integer> lis = new ArrayList<>();
		preorder(root, lis);
		return lis;
	}

	public void preorder(Node r, List<Integer> t) {
		if (r == null)
			return;
		for (Node e : r.children) {
			preorder(e, t);
		}
		t.add(r.val);
		return;
	}
}
