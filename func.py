#!/usr/bin/python
# -*- coding: UTF-8 -*-
import time
import math
def myprint( str ):
	"自定义函数"
	print str 
	return;
#调用函数
myprint("调用自定义函数")

#按值传递
def change( mylist ) :
	"传入参数"
	mylist.append([1,2,3,4])
	print mylist
	return ;

mylist = [10,20,30,40]
change( mylist)
print mylist

#关键字参数
def chang1( name, age = 20):
	"----"
	print name
	print age
	return
chang1(age = 29, name = 'zhangsan')
chang1(name = 'lisi')

def chang2( var, *var2):
	"不定长参数*"
	print var
	for list in var2 :
		print list
	return

chang2(10,20,30,40,50)

sum = lambda var1, var2 : var1 + var2
print sum(10, 20)


tmp1 = dir(time)
print tmp1
