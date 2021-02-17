## summary

1. 递归

   ```
   terminator (终止条件)
   process current level （处理当前层）
   drill down  （下一层）
   revert status if needed （根据需要是否进行清理参数）
   
   ```

   

2. 分治 （特殊的递归）

   ```
   recursion terminator (无子问题)
   process (如何拆分子问题)
   drill down (deal subproblems)
   merge
   revert the cur level status if needed
   ```

   

3. 回溯（特殊的递归 ,每一层多种的尝试，典型问题N皇后，以及数独问题)

