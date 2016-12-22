#!/usr/bin/python
# -*- coding: UTF-8 -*-

import socket
import sys
import time

#创建socket对象
serversocket = socket.socket(socket.AF_INET, socket.SOCK_STREAM)

#获取本地主几名
host = socket.gethostname()
port = 999;

#绑定端口号
serversocket.bind((host,port))
print "本地主机名：",host,"端口号：",port

#设置最大连接数
serversocket.listen(5)

while True:
	#建立客户端链接
	clientsocket, addr = serversocket.accept()
	print "连接地址:%s" % str(addr)

	msg = "连接成功%s"% time.asctime( time.localtime(time.time()) ) 
	#clientsocket.send(msg.encode('UTF-8'))
	clientsocket.send(msg)
	clientsocket.close()



