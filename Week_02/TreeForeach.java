package Week_02;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

//树的遍历
public class TreeForeach {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        while (root != null || (!stack.empty())) {
            if (root != null) {
                list.add(root.val);//步骤一，取根节点的值
                stack.push(root);
                root = root.left;//步骤二，遍历左子树
            } else {
                TreeNode tem = stack.pop();
                root = tem.right;//步骤三，遍历右子树
            }
        }
        return list;
    }

}
