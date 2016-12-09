#!/usr/bin/python
# -*- coding: UTF-8 -*-


raw_input("\n\n等待用户输入")
print "1+++++++++++++++++++++++++++"
print "你好 世界" #这是注释
'''这是多行注释
这是多行注释
这是多行注释
'''

"""一行多条语句
"""
import sys; x = "这是一行多条语句";sys.stdout.write(x + '\n')

print "多语句构成代码组"
print "2+++++++++++++++++++++++++++"
'''
if expression :
	suite
elif expression :
	suite
else :
	suite
'''

print "变量类型"
print "3+++++++++++++++++++++++++++"
conut = 100 #整型
flot = 100.001 #浮点
name = "张三" #字符串
a = b = c = 1
e, f, d = 1, 2, "hello world"


print conut
print flot
print name
print d 

print "字符串"
print "4+++++++++++++++++++++++++++"
str = "123456789"
print str
print str[0]#输出第一个字符
print str[2:5]#输出2-5
print str[2:]#从第三个开始
print str *2#输出两次
print str + "test"

print "列表"
print "5+++++++++++++++++++++++++++"
list = ['hello', 789, 12.00, 'jion']
tinylist = [123, 'world']
print list
print list[0]
print list[2:3]
print list[2:] 
print list + tinylist
print list + tinylist * 2
