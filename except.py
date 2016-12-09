#!/usr/bin/python
# -*- coding: UTF-8 -*-

def num_conver(var) :
	try :
		return float(var) 
	except ValueError, Argument :
		print "参数没有包含数字", Argument

num = raw_input("请输入数字：")
print num_conver(num)

def rais_except(var):
	"触发异常"
	if var < 10 :
		raise Exception("invaild", var)
		#后面的代码不再执行
		print "hello world"
try :
	rais_except(0)
except "invaild" :
	print 1
else :
	print 2


