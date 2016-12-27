#########################################################################
# File Name: thief.py
# Author: yuhaitao
# mail: acer_yuhaitao@163.com
# Created Time: Thu 22 Dec 2016 01:03:50 AM PST
#########################################################################
#!/usr/bin/python
# -*- coding: utf-8 -*-

for thief in ['a', 'b', 'c', 'd']:
	sum = (thief != 'a') + (thief == 'b') + (thief == 'c') + (thief != 'd')
	if sum == 3 :
		print "小:%s" % thief
