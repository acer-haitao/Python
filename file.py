#!/usr/bin/python
# -*- coding: UTF-8 -*-

import os 

file1 = open("text.c","a+")
print file1.name
print file1.write("hello world\n")
str = file1.read(20)
print str
print file1.tell()
file1.seek(1,0)
print file1.read(10)
print file1.close()
print file1.encoding
print file1.errors
print file1.mode
print file1.newlines
print file1.next

"""os.rename("text.txt", "text.c")
"""
os.getcwd()

try :
	fd = open("test.c","r+")
	fd.write("这是一个测试文件")
except IOError :
	print "没有找到文件"
else :
	print "写入失败"

try :
	fd = open("try.c", "r+")
	fd.write("zhehsi dfahdflaf")
except :
	print "except"
	open("try.c", "a+")
else :
	print "unexcept"

try :
	fh = open("fh.txt", "w+")
	print fh.errors
	try :
		fh.write("adasffffffffffff")
	finally :
		print "关闭文件"
		fh.close()
except IOError :
	print "没找到文件"

