package org.algorithm.RedBlackTree;

import org.algorithm.RedBlackTree.RBTree.RBNodeColor;

/**
 * Created with IntelliJ IDEA. User: qarkly Date: 14-6-8 Time: ÏÂÎç11:16 To change
 * this template use File | Settings | File Templates.
 */
class RBNode {
    public RBNode right;
    public RBNode left;
    public RBNode parent;
    public double key;
    public RBNodeColor color = RBTree.RBNodeColor.Red; //default color of node is red.

    public RBNode(double _key) {
        this();
        key = _key;
    }

    public RBNode() {
        right = null;
        left = null;
        parent = null;
    }

    public RBNode(double k, RBNode l, RBNode r, RBNode p) {
        right = r;
        left = l;
        parent = p;
        key = k;
    }

}