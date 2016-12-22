#!/usr/bin/python
# -*- coding: UTF-8 -*-

import thread
import time

def print_func(threadName, delay):
	"为线程差创建一个函数"
	count = 0
	while count < 5:
		time.sleep(delay)
		count += 1
		print " %s-->%s" % ( threadName, time.ctime(time.time()) )

#创建两个线程
try:
	thread.start_new_thread(print_func, ("线程1", 2,))
	thread.start_new_thread(print_func, ("线程2", 4,))
except:
	print "unable to start thread"
while 1:
	pass

