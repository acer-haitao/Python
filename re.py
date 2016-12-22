#!/usr/bin/python
# -*- coding: UTF-8 -*-

import re

print (re.match("www", "www.baidu.com").span())
print (re.match("com", "www.baidu.com"))

str = "we are family"

obj = re.search(r'(.*) are (.*?) .*', str, re.M | re.I)
if obj :
	print obj.group()
	print obj.group(1)
	print obj.group(2)
else:
	print "No"




















