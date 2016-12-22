#!/usr/bin/python
# -*- coding: UTF-8 -*-

class Parent :
	"继承"
	Parent_Num = 100
	def __init__(self):
		print "调用父类构造函数"
	def ParentMethd(self) :
		print "调用父类方法"
	def setNum(self, attr) :
		Parent.Parent_Num = attr
	def getNum(self) :	
		print "父类属性",Parent.Parent_Num

class Child(Parent):
	def __init__(self) :
		print "调用子类构造方法"
	def ChildMethd(self) :
		print "调用子类方法"

c = Child();
c.ChildMethd();
c.ParentMethd();
c.setNum(200);
c.getNum();













