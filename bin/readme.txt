factory 包：
1.com.bjsxt.dp.factory 
描述的是:工厂方法模式
①VehicleFactory是一个抽象类,用来产生Moveable(接口)类型的对象->可以理解为一个接口产生一个接口
②VehicleFactory有其继承类CarFactory、PlaneFactory...->用来生产具体的Moveable对象
③Moveable有其实现类Car、Plane...
对于简单工厂就是没有第②项

2.com.bjsxt.dp.factory.abstractfactory
描述的是:抽象工厂模式
①AbstractFactory是一个抽象类,用来产生一批产品Vehicle(抽象类/接口)、Weapon、Food->可以理解为一个接口产生一批接口
②AbstractFactory有其继承类WarriorFactory、MagicFactory...->用来生产具体的Vehicle(抽象类/接口)、Weapon、Food对象
③Vehicle有其实现类Car、Broom.../Weapon有其实现类AK47、MagicStick...

offer 包：
Title1 :字符串	替换空格 
请实现一个函数，将一个字符串中的空格替换成“%20”。例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。

Title2 : 位运算	二进制中1的个数 
输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。

Title3 :知识迁移能力	翻转单词顺序列
例如，“student. a am I”。后来才意识到，这家伙原来把句子单词的顺序翻转了，正确的句子应该是“I am a student.”。Cat对一一的翻转这些单词顺序可不在行，你能帮助他么？

Title4 : 分解让复杂问题简单	 字符串的排列
输入一个字符串,按字典序打印出该字符串中字符的所有排列。例如输入字符串abc,则打印出由字符a,b,c所能排列出来的所有字符串abc,acb,bac,bca,cab和cba。 结果请按字母顺序输出。 
输入描述:
输入一个字符串,长度不超过9(可能有字符重复),字符只包括大小写字母。








ordinal 包:
Cow:
Problem
设有一头小母牛，从出生第四年起每年生一头小母牛，按此规律，第N年时有几头母牛？ 
Input
本题有多组数据。每组数据只有一个整数N，独占一行。(1≤N≤50) 
Output
对每组数据，输出一个整数（独占一行）表示第N年时母牛的数量 



tree 包：
二叉树结构的优点(针对面试问题 你用过哪种数据结构，有什么优点 缺点):
二叉树作为数据存储工具有重要的优势；可以快速地找到一个给定关键字的数据项，并且可以快速地插入和删除数据项。
遗憾的是，如果树中插入的是随机数据，则执行效果很好，但是如果插入的是有序数据，树将变得非平衡了。


解决二叉树非平衡问题：红黑树


