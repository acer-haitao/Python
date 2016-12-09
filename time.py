#!/usr/bin/python
# -*- coding: UTF-8 -*-

import calendar
import time;

tmp = time.time()
print tmp

tmp1 = time.localtime(time.time())
print tmp1
#获取当前时间
tmp2 = time.asctime(time.localtime(time.time()))
print tmp2
#获取日历
cal = calendar.month(2016,1)
print cal
