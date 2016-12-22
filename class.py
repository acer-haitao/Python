#!/usr/bin/python
# -*- coding: UTF-8 -*-

class stu:
	"所有学生的基类"
	stuconut = 0
	def __init__(self, name, sex, age):
		self.name = name
		self.sex = sex
		self.age = age
		stu.stuconut += 1
	def display(self) :
		print "age = %s" % stu.stuconut
	def display_self(self) :
		print "self :",self.name, self.sex, self.age
	def __del__(self) :
		class_self = self.__class__.__name__
		print "销毁" ,class_self

#创建一个对象
stu1 = stu("zhangsan", "man", 28)
stu2 = stu("lisi", "woman",25)
#调用类
stu1.display()
stu1.display_self()
stu2.display_self()
#增加一个属性
stu1.addr = "beijing"
stu1.addr = "shanghai"
print "addr :",stu1.addr

#用函数来访问属性
print "返回sex属性值", getattr(stu2, 'sex')
print "如果存在属性addr",hasattr(stu2, 'addr')
print "修改属性值",setattr(stu1, 'addr', "wuhan")
print "sut1--addr :",stu1.addr

#类的内置类属性
print "类的属性", stu1.__dict__ ;
print "类的名称", stu1.__module__;
del stu1
del stu2














