<h2><a href="https://www.geeksforgeeks.org/problems/preorder-to-postorder4423/1?page=2&category=Stack&sortBy=submissions">Preorder to BST</a></h2><h3>Difficulty Level : Difficulty: Medium</h3><hr><div class="problems_problem_content__Xm_eO"><p><span style="font-size: 18px;">Given an array arr[] of <strong>n</strong> nodes representing preorder traversal of some BST. You have to build the </span><strong style="font-size: 18px;">BST</strong><span style="font-size: 18px;">&nbsp;</span><span style="font-size: 18px;"> from the given preorder traversal.&nbsp;</span><span style="font-size: 18px;">In Pre-Order traversal,&nbsp;<strong>the root node is visited before the left child and right child nodes</strong>.</span></p>
<p><strong><span style="font-size: 18px;">Examples:</span></strong></p>
<pre><strong><span style="font-size: 18px;">Input: </span></strong><span style="font-size: 18px;">n = 5, arr[] = [40, 30, 35, 80, 100]
<strong>Output: </strong>[35, 30, 100, 80, 40]<strong>
Explanation:</strong> PreOrder: 40 30 35 80 100
Therefore, the BST will be:
&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; 40
&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;/&nbsp; &nbsp;&nbsp; &nbsp;\
&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;30&nbsp; &nbsp; &nbsp; &nbsp;80
&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;\&nbsp; &nbsp; &nbsp; &nbsp;&nbsp;\&nbsp; &nbsp;
&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;35&nbsp; &nbsp; &nbsp; 100
Hence, the postOrder traversal will
be: 35 30 100 80 40</span></pre>
<pre><strong><span style="font-size: 18px;">Input: </span></strong><span style="font-size: 18px;">n = 8, arr[] = [40, 30, 32, 35, 80, 90, 100, 120]
<strong>Output: </strong>[35, 32, 30, 120, 100, 90, 80, 40]</span></pre>
<p><span style="font-size: 18px;"><strong>Constraints:</strong><br>1 ≤ n ≤ 10<sup>3</sup><br>1 ≤ arr[i] ≤ 10<sup>4</sup></span></p></div><p><span style=font-size:18px><strong>Company Tags : </strong><br><code>Flipkart</code>&nbsp;<code>Amazon</code>&nbsp;<code>Linkedin</code>&nbsp;<br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Stack</code>&nbsp;<code>Binary Search Tree</code>&nbsp;<code>Tree</code>&nbsp;<code>Data Structures</code>&nbsp;