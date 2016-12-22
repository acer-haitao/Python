#!/usr/bin/python
# -*- coding: UTF-8 -*-
import random

Flag = False
name = '张三'

if name == '张三' :
	print "Flag"
	Flag = True
else :
	print Flag

list = [1, 2, 3]
num = 9
if num >= 0 and num < 8 :
	print "test1"
	print num + list[0] 
elif num >= 0 or num < 19 :
	print "test2"
	print num + list[1]
elif num > 1 :
	print 'test4'
elif num > 2 :
	print 'test5'
else :
	print "test3"
	print num + list[2] 

while ( num < 20 ):
	print num; 
	num = num + 1;
print "Good Bye"

count = 1 
while count < 20 :
	count += 1;
	if (count % 2 == 0):
		continue;
	if (count > 15):
		break;
	print count

Num = 2
while (Num < 2) :
	Num	= raw_input("Enter a Num :")
	print Num
else :
	print Num, "else"


for var_list in 'Python' :
	print '当前字母', var_list
list = ["hello", "world", "2016-12-7"]
for var_list in list :
	print '-->',var_list

for index in range(len(list)) :
	print '1-->',list[index]


for num in range(10,20) :
	for i in range(2, num) :
		if num % i == 0:
			j = num / i
			print ' %d = %d * %d' % (num, i, j)
			pass
			print "pass"
			break;
	else :
		print num, '是一个质数'

del num, i, j

num = random.choice([1,2,3,4,5,6,7,8,9])
num2 = random.choice('abcdefghijklmnopqstuvw')
print '随机数',num, num2
