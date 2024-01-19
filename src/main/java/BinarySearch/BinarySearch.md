讨论一下二分查询几种写法的核心区别：
_二分法形式的区别主要在于开闭区间对于循环不变量的影响_

二分法的区间选择可分为:
开闭区间的原则都一样，包含数组中的所有元素，即闭区间（0 —— len-1），开区间（-1 —— len），其余类似。

开闭区间的选择以及循环不变量的选择决定了答案返回的边界，
eg lower_bound(从该下标起，所有元素x>=target)，那么毫无疑问，循环不变量的设定，左边界l往左一律小于target，右边界
r往右一律大于或者等于target，边界具体移动的表达式联合开闭区间的选择确定。

同时开闭区间的选择也决定了中间值mid的表达式，由于java是自动整除（当数组元素为偶数个时选择靠左下标），所以区间选择为(]时需要调整为标准mid值+1

* [] -> end: l>r, return l
detail: from r+1 to len-1, all x>=target, from 0 to l-1, all x < target, after looping, the index is same as the last r+1,
due to the end condition is l>r -> l=r+1, so the lower_bound is l.

* [) -> end: l==r, both is ok
detail: from r to len, all x>=target, from 0 to l-1, all x < target, after looping, the index is same as the last r,
due to the end condition is l==r, so the lower_bound is l.

* (] -> end: l==r, return l+1
detail: from r+1 to len-1, all x>=target, from -1 to l, all x < target, after looping, the index is same as the last r+1,
due to the end condition is l==r, so the lower_bound is l+1.

* () -> end: l+1==r, return l+1
detail: from r to len, all x>=target, from -1 to l, all x < target, after looping, the index is same as the last r,
due to the end condition is l+1==r, so the lower_bound is l+1.